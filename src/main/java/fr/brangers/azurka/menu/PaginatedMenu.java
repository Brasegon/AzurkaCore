package fr.brangers.azurka.menu;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;

public abstract class PaginatedMenu extends Menu {

    protected int page = 0;
    protected int maxItemsPerPage = 28;
    protected int index = 0;
    protected int left;
    protected int right;
    protected int close;

    public PaginatedMenu(Player p, int left, int right, int close) {
        super(p);
        this.left = left;
        this.right = right;
        this.close = close;
    }

    public void addMenuBorder(int page, int items){
        if (page > 0) {
            inventory.setItem(left, makeItem(Material.DARK_OAK_BUTTON, ChatColor.GREEN + "Left"));
        }

        inventory.setItem(close, makeItem(Material.BARRIER, ChatColor.DARK_RED + "Close"));
        if (items > 7) {
            inventory.setItem(right, makeItem(Material.DARK_OAK_BUTTON, ChatColor.GREEN + "Right"));
        }
    }

    public int getMaxItemsPerPage() {
        return maxItemsPerPage;
    }

}
