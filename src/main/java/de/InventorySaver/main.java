package de.InventorySaver;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {

    @java.lang.Override
    public void onEnable() {

        Bukkit.getConsoleSender().sendMessage("Hey there! What's up!");

    }
}
