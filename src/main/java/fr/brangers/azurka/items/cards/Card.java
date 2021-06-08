package fr.brangers.azurka.items.cards;

import fr.brangers.azurka.register.init.Items;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class Card extends ItemStack {
    public ItemMeta meta;
    public Card(Material material, String name, ArrayList<String> lores, int modelData) {
        super(material);
        this.meta = this.getItemMeta();
        meta.setDisplayName(name);
        meta.setCustomModelData(modelData);
        this.setItemMeta(meta);
        Items.cards.add(this);
    }

}
