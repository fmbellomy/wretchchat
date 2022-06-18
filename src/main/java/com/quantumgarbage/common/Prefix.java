package com.quantumgarbage.common;

import org.bukkit.ChatColor;

public class Prefix {
    public String prefixText;
    public ChatColor color;

    public Prefix() {
        prefixText = "";
        color = ChatColor.WHITE;
    }

    public Prefix(String text) {
        prefixText = text;
        color = ChatColor.WHITE;
    }

    public Prefix(String text, ChatColor c) {
        prefixText = text;
        color = c;
    }
}
