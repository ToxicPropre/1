package net.arkube.blackswords.commands;

import net.arkube.blackswords.functions.RankFunction;
import net.arkube.blackswords.utils.ChatUtil;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class RepairCommand implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		
		if(sender instanceof Player){
			Player player = (Player)sender;
			
			if(new RankFunction(player).getRank().getLevel() >= 50 || new RankFunction(player).hasPermission("repair.use")){
				@SuppressWarnings("deprecation")
				ItemStack item = player.getItemInHand();
				item.setDurability((short)0);
			}else{
				player.sendMessage(new ChatUtil().getPrefix()+"Vous n'avez pas accés à cette fonctionnalité ! Vous pouvez l'acheter depuis la boutique !");
			}
		}
		
		return false;
	}

}
