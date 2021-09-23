package me.aayush.myfirstplugin;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class MyFirstPlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("the plugin is started");

        getServer().getPluginManager().registerEvents(this, this);

    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){

    event.setJoinMessage("a player has joined ");

    }

}
