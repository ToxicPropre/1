package net.arkube.blackswords.manager;

import net.arkube.blackswords.BlackSwords;
import net.arkube.blackswords.events.inventory.InventoryClick;
import net.arkube.blackswords.events.players.PlayerBreak;
import net.arkube.blackswords.events.players.PlayerCraft;
import net.arkube.blackswords.events.players.PlayerJoin;
import net.arkube.blackswords.events.players.PlayerLeave;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;

public class EventsManager {

	private BlackSwords pl;
	
	public EventsManager(BlackSwords pl){
		this.pl = pl;
	}
	
	public void registerEvents(){
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new PlayerJoin(), pl);
		pm.registerEvents(new PlayerLeave(), pl);
		pm.registerEvents(new PlayerBreak(), pl);
		pm.registerEvents(new PlayerCraft(), pl);
		pm.registerEvents(new InventoryClick(), pl);
	}
	
}
