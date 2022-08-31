package com.asians.healer;

import org.bukkit.Material;
import org.bukkit.entity.Monster;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;

public class DropIron implements Listener {
@EventHandler
    public void onPlayerAttackMonster(org.bukkit.event.entity.EntityDeathEvent deathEvent) {
        if(deathEvent.getEntity() instanceof Monster) {
            Monster monster = (Monster) deathEvent.getEntity();
            ItemStack iron = new ItemStack(Material.IRON_INGOT, 5);
            monster.getWorld().dropItem(monster.getLocation(), iron);
        }
    }
}
