package com.quantumgarbage;

import java.util.HashMap;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import com.quantumgarbage.persistence.WretchPlayer;

public class App extends JavaPlugin {
    public static HashMap<Player, WretchPlayer> players;

    @Override
    public void onEnable() {
        getLogger().info("Hello, SpigotMC!");
        WretchPlayer.load(this);
    }

    @Override
    public void onDisable() {
        getLogger().info("See you again, SpigotMC!");
    }
}
