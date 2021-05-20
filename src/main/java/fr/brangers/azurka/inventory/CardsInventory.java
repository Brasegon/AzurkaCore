package fr.brangers.azurka.inventory;

import fr.brangers.azurka.AzurkaCoreMain;
import fr.brangers.azurka.items.cards.Card;
import fr.brangers.azurka.register.init.Items;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import java.util.ArrayList;
import java.util.List;

public class CardsInventory implements Listener {
    private Inventory inv;

    public CardsInventory(Player player, AzurkaCoreMain main) {
        NamespacedKey namespacedKey = new NamespacedKey(main, "cards");

        PersistentDataContainer data = player.getPersistentDataContainer();

        int[] test = data.get(namespacedKey, PersistentDataType.INTEGER_ARRAY);
        try {
            inv = Bukkit.createInventory(null, 9, "Vous avez :" + test.length);
        } catch (Exception e) {
            inv = Bukkit.createInventory(null, 9, "Vous avez :" + "0");
        }
        for (Card card: Items.cards) {
            ItemStack item = new ItemStack(Material.GRAY_STAINED_GLASS);
            ItemMeta meta = item.getItemMeta();
            meta.setDisplayName(card.getItemMeta().getDisplayName());
            List<String> lores = new ArrayList<>();
            lores.add(ChatColor.RED + "Vous ne possédé pas cette carte");
            meta.setLore(lores);
            item.setItemMeta(meta);
            inv.addItem(item);
        }
    }

    public Inventory getInv() {
        return inv;
    }
}
