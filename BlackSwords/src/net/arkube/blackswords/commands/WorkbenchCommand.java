package net.arkube.blackswords.commands;

import net.arkube.blackswords.functions.RankFunction;
import net.arkube.blackswords.utils.ChatUtil;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;

public class WorkbenchCommand implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		
		if(sender instanceof Player){
			Player player = (Player)sender;
			
			if(new RankFunction(player).getRank().getLevel() >= 50 || new RankFunction(player).hasPermission("workbench.use")){
				Inventory craft = Bukkit.createInventory(null, InventoryType.WORKBENCH);
				player.openInventory(craft);
			}else{
				player.sendMessage(new ChatUtil().getPrefix()+"Vous n'avez pas accés à cette fonctionnalité ! Vous pouvez l'acheter depuis la boutique !");
			}
		}
		
		return false;
	}

}
