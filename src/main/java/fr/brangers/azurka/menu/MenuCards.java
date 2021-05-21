package fr.brangers.azurka.menu;

import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;

public class MenuCards extends Menu{

    public MenuCards(Player p) {
        super(p);
    }

    @Override
    public String getMenuName() {
        return "Cards Menu";
    }

    @Override
    public int getSlots() {
        return 9;
    }

    @Override
    public void handleMenu(InventoryClickEvent e) {

    }

    @Override
    public void setMenuItems() {

    }
}
