package dev.voigon.watchwolfsampleplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class WatchwolfSamplePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("test-cmd").setExecutor(new TestCommand(getLogger()));

        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
