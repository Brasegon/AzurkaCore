package fr.brangers.azurka.register;

import fr.brangers.azurka.AzurkaCoreMain;
import fr.brangers.azurka.command.CommandCards;
import fr.brangers.azurka.register.init.Items;

public class Register {

    public static void register(AzurkaCoreMain main) {
        registerItems(main);
        registerCommand(main);
    }

    private static void registerItems(AzurkaCoreMain main) {
    }

    private static void registerCommand(AzurkaCoreMain main) {
        main.getCommand("cards").setExecutor(new CommandCards());
    }

}
