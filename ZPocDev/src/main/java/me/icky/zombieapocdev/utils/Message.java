package me.icky.zombieapocdev.utils;

import me.icky.zombieapocdev.Main;
import org.bukkit.Bukkit;

public class Message {
    public static void broadcast(String message) {
        Bukkit.broadcastMessage(Main.prefix+"§r"+message);
    }
    public static void info (String message) {
        System.out.println(Main.prefix+"§r"+message);
    }
}
