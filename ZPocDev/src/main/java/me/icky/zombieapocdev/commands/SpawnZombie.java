package me.icky.zombieapocdev.commands;

import me.icky.zombieapocdev.utils.Message;
import me.icky.zombieapocdev.utils.Zombie;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SpawnZombie implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (!(sender instanceof Player)) {
            Message.info("Only players can use that command.");
            return true;
        }

        if (args.length < 0) {
            sender.sendMessage("&cPlease enter more arguments\n&c/spawnzombie <name> <health> <strength> <speed> <jump> <range> <pickItems>");
            return true;
        }

        Zombie.spawnZombie(args[0], args[1], args[2], args[3], args[4], args[5], args[6], ((Player) sender).getWorld(), ((Player) sender).getLocation(), (Player) sender);

        return true;
    }
}
