package net.arkube.blackswords.commands;

import net.arkube.blackswords.functions.RankFunction;
import net.arkube.blackswords.monnaie.Monnaie;
import net.arkube.blackswords.rank.Rank;
import net.arkube.blackswords.utils.ChatUtil;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MonnaieCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		
		if(sender instanceof Player){
			Player player = (Player)sender;
			Player target = Bukkit.getPlayerExact(args[1]);
			
			if(new RankFunction(player).getRank() == Rank.ADMINISTRATEUR || new RankFunction(player).hasPermission("monnaie.use")){
				if(args.length == 3){
					if(target == null){
						player.sendMessage(new ChatUtil().getPrefix()+"§cCe joueur n'est pas connecté !");
					}else{
						if(args[0].equalsIgnoreCase("add")){
							new Monnaie(target).addMonnaie(Integer.valueOf(args[2]));
							player.sendMessage(new ChatUtil().getPrefix()+"Vous venez de donné §a"+args[2]+"monnaie §fà §a"+args[1]);
						}else if(args[0].equalsIgnoreCase("remove")){
							if(new Monnaie(target).getMonnaie() < Integer.valueOf(args[2])){
								player.sendMessage(new ChatUtil().getPrefix()+"§cCe joueur à que "+new Monnaie(target).getMonnaie()+" de monnaie !");
							}else{
								new Monnaie(target).removeMonnaie(Integer.valueOf(args[2]));
								player.sendMessage(new ChatUtil().getPrefix()+"Vous venez de donné §a"+args[2]+"monnaie §fà §a"+args[1]);
							}
						}else{
							player.sendMessage(new ChatUtil().getPrefix()+"Faite /monnaie <add/remove> <joueur> <monnaie> ! ");
						}
					}
				}else{
					player.sendMessage(new ChatUtil().getPrefix()+"Faite /monnaie <add/remove> <joueur> <monnaie> ! ");
				}
			}else{
				player.sendMessage(new ChatUtil().getPrefix()+"§cVous devez être Administrateur pour éffectuer cette commande !");
			}
		}else{
			Player target = Bukkit.getPlayerExact(args[1]);
			
			if(target != null){
				if(args[0].equalsIgnoreCase("add")){
					new Monnaie(target).addMonnaie(Integer.valueOf(args[2]));
				}else if(args[0].equalsIgnoreCase("remove")){
					if(new Monnaie(target).getMonnaie() < Integer.valueOf(args[2])){
						System.out.println(new ChatUtil().getPrefix()+"§cCe joueur à que "+new Monnaie(target).getMonnaie()+" de monnaie !");
					}else{
						new Monnaie(target).removeMonnaie(Integer.valueOf(args[2]));
					}
				}
			}
		}
		
		return false;
	}

}
