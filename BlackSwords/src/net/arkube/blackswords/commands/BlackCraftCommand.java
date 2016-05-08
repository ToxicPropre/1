package net.arkube.blackswords.commands;

import net.arkube.blackswords.functions.BlackCraft;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BlackCraftCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		
		Player player = (Player)sender;

		new BlackCraft().open(player);
		
		return false;
	}
	
}
