package com.quantumgarbage.formatters;

import org.bukkit.event.player.AsyncPlayerChatEvent;

public interface WretchFormatter {
    public String format(AsyncPlayerChatEvent e);
}
