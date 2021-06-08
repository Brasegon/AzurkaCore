package fr.brangers.azurka.menu;

import fr.brangers.azurka.items.cards.Card;
import fr.brangers.azurka.register.init.Items;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;

import java.util.ArrayList;

public class MenuCards extends PaginatedMenu {
    private final int page;

    public MenuCards(Player p, int page) {
        super(p, 18, 26, 22);
        this.page = page;
    }

    @Override
    public String getMenuName() {
        return "Collection de Carte";
    }

    @Override
    public int getSlots() {
        return 27;
    }

    @Override
    public void handleMenu(InventoryClickEvent e) {
        this.p.sendMessage(String.valueOf(e.getSlot()));
        if (Items.cards.size() > 7) {
            if (e.getSlot() == right) {
                new MenuCards(p, page + 1).open();
            }
            if (e.getSlot() == left) {
                new MenuCards(p, page - 1).open();
            }
        }
    }

    @Override
    public void setMenuItems() {
        int index = 0;
        this.setFillerGlass();
        ArrayList<Card> test = (ArrayList<Card>) Items.cards.clone();
        System.out.println(test.size());
        for (int i = 0, j = 0; j < 7 * page; j += 1) {
            System.out.println(i + " --> " + test.get(i).getItemMeta().getDisplayName());
            test.remove(i);
        }
        if (Items.cards.size() > 7) {
            addMenuBorder(page, test.size());
        }
        for (int i = 0; i < test.size(); i += 1) {
            if (i != 0 && i % 7 == 0) {
                break;
            }
            Card card = test.get(i);

            inventory.setItem(i + 10, card);
            index += 1;

        }
    }
}
