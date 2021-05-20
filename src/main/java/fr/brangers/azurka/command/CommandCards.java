package fr.brangers.azurka.command;

import fr.brangers.azurka.register.init.inventory.Inventories;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class CommandCards implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "Cette commande ne peut être éxécutée qu'en jeu");
            return true;
        }
        Player player = (Player) sender;
        Inventory inv = Inventories.cardsInventories.get(player.getUniqueId()).getInv();
        player.openInventory(inv);
        return false;
    }
}