package me.icky.zombieapocdev;

import me.icky.zombieapocdev.commands.SpawnZombie;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    public static final String prefix = "§6[§cZombieApocalypse Dev§6] ";

    @Override
    public void onEnable() {
        getCommand("spawnzombie").setExecutor(new SpawnZombie());
    }

    @Override
    public void onDisable() {

    }
}