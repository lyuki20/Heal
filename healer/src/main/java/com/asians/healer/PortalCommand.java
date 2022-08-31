package com.asians.healer;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPortalEnterEvent;
import org.bukkit.event.player.PlayerTeleportEvent;

public class PortalCommand implements Listener {
    @EventHandler
    public void onEnterPortal(PlayerTeleportEvent playerTeleportEvent) {
        if(playerTeleportEvent.getCause().equals((Object) PlayerTeleportEvent.TeleportCause.NETHER_PORTAL)) {
            Player player = playerTeleportEvent.getPlayer();
            playerTeleportEvent.setCancelled(true);
            ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
            String command = "tp " + player.getDisplayName() + " -259 62 202.7";
            Bukkit.dispatchCommand(console, command);
            player.sendMessage(ChatColor.DARK_GREEN + "[*]" + ChatColor.GREEN + "Teleporting to " + player.getLocation().toString());
        }

    }
}
