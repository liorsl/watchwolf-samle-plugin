package dev.voigon.watchwolfsampleplugin;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.logging.Logger;

public class TestCommand implements CommandExecutor {

    private final Logger logger;

    public TestCommand(Logger logger) {
        this.logger = logger;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        logger.info(String.format("Running test cmd '%s' froms sender %s", label, sender));
        Bukkit.getWorlds().get(0).getBlockAt(0, 0, 0).setType(Material.ACACIA_LOG);
        return true;
    }

}
