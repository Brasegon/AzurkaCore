package fr.brangers.azurka.command;

import fr.brangers.azurka.menu.MenuCards;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandCards implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "Cette commande ne peut être éxécutée qu'en jeu");
            return true;
        }
        Player player = (Player) sender;
        new MenuCards(player, 0).open();
        return false;
    }
}
