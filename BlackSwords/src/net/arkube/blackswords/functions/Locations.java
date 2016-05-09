package net.arkube.blackswords.functions;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class Locations {

	private Location spawn = new Location(Bukkit.getWorlds().get(0), 0, 0, 0);
	private Player player;
	
	public Locations(Player player){
		this.player = player;
	}
	
	public void teleportOnSpawn(){
		player.teleport(spawn);
	}
	
}
