package net.kettlemc.custompolls;

import org.bukkit.plugin.java.JavaPlugin;

public class CustomPollsPlugin extends JavaPlugin {

    public void onEnable() {
        getLogger().info("CustomPolls enabled!");
    }

    public void onDisable() {
        getLogger().info("CustomPolls disabled!");
    }

}
