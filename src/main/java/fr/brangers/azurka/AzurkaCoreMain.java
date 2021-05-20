package fr.brangers.azurka;

import fr.brangers.azurka.event.InventoryEvent;
import fr.brangers.azurka.register.Register;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.util.logging.Logger;

public class AzurkaCoreMain extends JavaPlugin {

    public static Logger LOGGER = Bukkit.getLogger();

    @Override
    public void onLoad() {
        super.onLoad();
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }

    @Override
    public void onEnable() {
        LOGGER.info("Initialisation de AzurkaCore");
        Register.register(this);
        getServer().getPluginManager().registerEvents(new InventoryEvent(this), this);
    }
}
