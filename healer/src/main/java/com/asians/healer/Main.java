package com.asians.healer;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginCommand("cure").setExecutor(new HealHealthAndHungry(this));
        getServer().getPluginManager().registerEvents(new DropIron(), this);
        getServer().getPluginManager().registerEvents(new PortalCommand(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
