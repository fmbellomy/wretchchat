package com.quantumgarbage.formatters;

import org.bukkit.event.player.AsyncPlayerChatEvent;

import com.quantumgarbage.App;
import com.quantumgarbage.persistence.WretchPlayer;

public class DefaultFormatter implements WretchFormatter {
    public String format(AsyncPlayerChatEvent e) {
        String msg = e.getMessage();
        WretchPlayer wp = App.players.get(e.getPlayer());

        return wp.getPrefix() + wp.getPlayer().getDisplayName() + " -> " + msg;
    }
}
