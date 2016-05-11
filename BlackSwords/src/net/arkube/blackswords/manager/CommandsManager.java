package net.arkube.blackswords.manager;

import net.arkube.blackswords.BlackSwords;
import net.arkube.blackswords.commands.BlackCraftCommand;
import net.arkube.blackswords.commands.MonnaieCommand;
import net.arkube.blackswords.commands.RankCommand;
import net.arkube.blackswords.commands.RepairCommand;
import net.arkube.blackswords.commands.WorkbenchCommand;

public class CommandsManager {

	private BlackSwords pl;
	
	public CommandsManager(BlackSwords pl){
		this.pl = pl;
	}
	
	public void registerCommands(){
		pl.getCommand("blackcraft").setExecutor(new BlackCraftCommand());
		pl.getCommand("rank").setExecutor(new RankCommand());
		pl.getCommand("monnaie").setExecutor(new MonnaieCommand());
		pl.getCommand("craft").setExecutor(new WorkbenchCommand());
		pl.getCommand("repair").setExecutor(new RepairCommand());
	}
	
}
