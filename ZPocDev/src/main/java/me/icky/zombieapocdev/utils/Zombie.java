package me.icky.zombieapocdev.utils;

import me.icky.zombieapocdev.Main;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Zombie {
    public static void spawnZombie(String name, double health, double strength, double speed,
    int jump, int range, boolean pickItems, World world, Location location, Player player) {


        org.bukkit.entity.Zombie zombie = (org.bukkit.entity.Zombie) world.spawnEntity(location, EntityType.ZOMBIE);
        zombie.setCustomNameVisible(true);
        zombie.setCustomName(name);
        zombie.setMaxHealth(health);
        zombie.setHealth(health);
        zombie.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(strength);
        zombie.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).setBaseValue(speed);
        zombie.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 18400000, jump));
        zombie.getAttribute(Attribute.GENERIC_FOLLOW_RANGE).setBaseValue(range);
        zombie.setCanPickupItems(pickItems);
        player.sendMessage(Main.prefix + "§rSpawned zombie.");
    }

    public static void spawnZombie(String name, String health, String strength, String speed,
                                   String jump, String range, String pickItems, World world, Location location, Player player) {


        org.bukkit.entity.Zombie zombie = (org.bukkit.entity.Zombie) world.spawnEntity(location, EntityType.ZOMBIE);
        zombie.setCustomNameVisible(true);
        zombie.setCustomName(name);
        zombie.setMaxHealth(Integer.valueOf(health));
        zombie.setHealth(Integer.valueOf(health));
        zombie.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(Integer.valueOf(strength));
        zombie.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).setBaseValue(Integer.valueOf(speed));
        zombie.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 18400000, Integer.valueOf(jump)));
        zombie.getAttribute(Attribute.GENERIC_FOLLOW_RANGE).setBaseValue(Integer.valueOf(range));
        zombie.setCanPickupItems(Boolean.valueOf(pickItems));
        player.sendMessage(Main.prefix + "§rSpawned zombie.");
    }
}
