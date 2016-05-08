package net.arkube.blackswords;

import net.arkube.blackswords.manager.CommandsManager;
import net.arkube.blackswords.manager.EventsManager;

import org.bukkit.plugin.java.JavaPlugin;

public class BlackSwords extends JavaPlugin {
	
	private static BlackSwords instance;
	
	public static BlackSwords getInstance(){
		return instance;
	}
	
	@Override
	public void onEnable(){
		new EventsManager(this).registerEvents();
		new CommandsManager(this).registerCommands();
	}

}
