package com.carpercreative.minecraft.nkhpvp;

import org.bukkit.entity.Player;

public class PvpPlayer {

    int kills, deaths;
    double damageDealt;
    Player bukkitPlayer;
    PvpTeam team;

    public PvpPlayer(Player player) {
        this.bukkitPlayer = player;
    }

    public PvpTeam getTeam() {
        return team;
    }

    public void setTeam(PvpTeam team) {
        this.team = team;
    }

    public void addKill() {
        kills++;
        team.kills++;
    }

    public void addDeath() {
        deaths++;
        team.deaths++;
    }

    public void addDamageDealt(double damage) {
        this.damageDealt += damage;
        team.damageDealt += damage;
    }

    public void resetScores() {
        kills = 0;
        deaths = 0;
        damageDealt = 0;
    }

    public Player getBukkitPlayer() {
        return bukkitPlayer;
    }

}
