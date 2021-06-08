package fr.brangers.azurka.event;

import fr.brangers.azurka.AzurkaCoreMain;
import fr.brangers.azurka.menu.Menu;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;

public class InventoryEvent implements Listener {
    private AzurkaCoreMain main;

    public InventoryEvent(AzurkaCoreMain main) {
        this.main = main;
    }

    @EventHandler
    public void onMenuClick(InventoryClickEvent e) {
        InventoryHolder holder = e.getInventory().getHolder();

        if (holder instanceof Menu) {
            e.setCancelled(true);
            if (e.getCurrentItem() == null) {
                return;
            }
            Menu menu = (Menu) holder;

            menu.handleMenu(e);
        }
    }
}
