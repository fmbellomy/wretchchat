package com.quantumgarbage.persistence;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.HashSet;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import com.quantumgarbage.common.Prefix;
import com.google.gson.Gson;

public class WretchPlayer {
    private Player p;
    private Prefix pf;
    private boolean owo;

    public WretchPlayer(Player p, Prefix pf, boolean owo) {
        this.p = p;
        this.pf = pf;
        this.owo = owo;
    }

    public WretchPlayer(Player p) {
        this.p = p;
        this.pf = new Prefix();
        this.owo = false;
    }

    public Player getPlayer() {
        return p;
    }

    public Prefix getPrefix() {
        return pf;
    }

    public boolean isOwO() {
        return owo;
    }

    public void save() {

    }

    public static HashMap<Player, WretchPlayer> load(JavaPlugin p) {
        HashMap<Player, WretchPlayer> rtrn = new HashMap<Player, WretchPlayer>();
        Path parentDir = p.getDataFolder().toPath();
        try {
            Path playerdata = Path.of(parentDir.toString() + File.separator + "playerdata.json");
            if (playerdata.toFile().exists()) {
                String pdString = Files.readString(playerdata);
                Gson gson = new Gson();

                WretchPlayer[] ps = gson.fromJson(pdString, WretchPlayer[].class);
                for (WretchPlayer wp : ps) {
                    rtrn.put(wp.p, wp);

                }

            }
        } catch (IOException e) {
            e.printStackTrace();

        }
        return rtrn;

    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof WretchPlayer)) {
            return false;
        }
        return ((WretchPlayer) o).getPlayer() == this.getPlayer();
    }

    @Override
    public int hashCode() {
        return p.hashCode();
    }
}