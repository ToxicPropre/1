package net.arkube.blackswords.manager;

import net.arkube.blackswords.BlackSwords;
import net.arkube.blackswords.commands.BlackCraftCommand;
import net.arkube.blackswords.commands.MonnaieCommand;
import net.arkube.blackswords.commands.RankCommand;

public class CommandsManager {

	private BlackSwords pl;
	
	public CommandsManager(BlackSwords pl){
		this.pl = pl;
	}
	
	public void registerCommands(){
		pl.getCommand("blackcraft").setExecutor(new BlackCraftCommand());
		pl.getCommand("rank").setExecutor(new RankCommand());
		pl.getCommand("monnaie").setExecutor(new MonnaieCommand());
	}
	
}
