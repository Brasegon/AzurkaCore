package fr.brangers.azurka.register.init;


import fr.brangers.azurka.items.cards.Card;
import org.bukkit.Material;

import java.util.ArrayList;

public class Items {
    public static ArrayList<Card> cards = new ArrayList<>();
    public static final Card exampleCard = new Card(Material.ACACIA_BOAT, "Examplecards", null, 1);
}
