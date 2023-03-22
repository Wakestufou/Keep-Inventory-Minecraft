package fr.wakestufou.keepinventory;

import fr.wakestufou.keepinventory.events.OnPlayerDeath;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;

public final class KeepInventory extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new OnPlayerDeath(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
