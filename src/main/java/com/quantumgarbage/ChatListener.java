package com.quantumgarbage;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent;

import com.quantumgarbage.formatters.DefaultFormatter;
import com.quantumgarbage.formatters.WretchFormatter;
import com.quantumgarbage.persistence.WretchPlayer;

public class ChatListener implements Listener {
    @EventHandler
    public void newPlayerJoined(AsyncPlayerPreLoginEvent e) {
        Player p = Bukkit.getPlayer(e.getUniqueId());
        App.players.put(p, new WretchPlayer(p));
    }

    @EventHandler
    public void onChatEvent(AsyncPlayerChatEvent e) {
        // this should read from a static config struct defined in App.java
        // dont forget, krang.
        // formatters should be configurable with in-game commands.
        WretchFormatter wf = new DefaultFormatter();
    }

}
