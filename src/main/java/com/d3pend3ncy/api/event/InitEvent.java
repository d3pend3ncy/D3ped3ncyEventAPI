package com.d3pend3ncy.api.event;

import com.d3pend3ncy.api.event.core.eventManager;
import com.d3pend3ncy.api.event.register.*;
import org.bukkit.plugin.java.JavaPlugin;

public class InitEvent {
    public InitEvent(JavaPlugin plugin) {
        new eventManager();
        plugin.getServer().getPluginManager().registerEvents(new RegisterBlock(), plugin);
        plugin.getServer().getPluginManager().registerEvents(new RegisterEnchantment(), plugin);
        plugin.getServer().getPluginManager().registerEvents(new RegisterEntity(), plugin);
        plugin.getServer().getPluginManager().registerEvents(new RegisterHanging(), plugin);
        plugin.getServer().getPluginManager().registerEvents(new RegisterInventory(), plugin);
        plugin.getServer().getPluginManager().registerEvents(new RegisterPlayer(), plugin);
        plugin.getServer().getPluginManager().registerEvents(new RegisterRaid(), plugin);
        plugin.getServer().getPluginManager().registerEvents(new RegisterServer(), plugin);
        plugin.getServer().getPluginManager().registerEvents(new RegisterVehicle(), plugin);
        plugin.getServer().getPluginManager().registerEvents(new RegisterWeather(), plugin);
        plugin.getServer().getPluginManager().registerEvents(new RegisterWorld(), plugin);
    }
}
