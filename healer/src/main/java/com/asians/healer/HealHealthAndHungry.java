package com.asians.healer;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.permissions.Permission;

public class HealHealthAndHungry implements CommandExecutor {
    Main main;

    HealHealthAndHungry(Main main) {
        this.main = main;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player) {
            Player player = (Player) sender;
            if(player.hasPermission(new Permission("healer.cure"))) {
                player.setHealth(20);
                player.setFoodLevel(20);
                player.sendMessage(ChatColor.DARK_GREEN + "[*]" + ChatColor.GREEN + "Your health and hunger has been restored");
                return true;
            }
            player.sendMessage(ChatColor.RED + "[*]" + ChatColor.RED + "You have no permission to cure yourself");
            return false;
        }
        return false;
    }
}
