package fr.brangers.azurka.event;

import fr.brangers.azurka.AzurkaCoreMain;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.Inventory;

public class InventoryEvent implements Listener {
    private AzurkaCoreMain main;

    public InventoryEvent(AzurkaCoreMain main) {
        this.main = main;
    }

    @EventHandler
    public void onPlayerJoin(final PlayerJoinEvent e) {
    }
    @EventHandler
    public void onPlayerLeave(final PlayerQuitEvent e) {
    }
}
