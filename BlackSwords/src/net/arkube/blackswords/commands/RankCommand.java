package net.arkube.blackswords.commands;

import net.arkube.blackswords.functions.RankFunction;
import net.arkube.blackswords.rank.Rank;
import net.arkube.blackswords.utils.ChatUtil;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RankCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		
		if(sender instanceof Player){
			Player player = (Player)sender;
			
			if(new RankFunction(player).getRank() == Rank.ADMINISTRATEUR || new RankFunction(player).hasPermission("rank.use")){
				if(args.length == 2){
					Player target = Bukkit.getPlayerExact(args[0]);
					
					if(target == null){
						player.sendMessage(new ChatUtil().getPrefix()+"§cCe joueur n'est pas connecté !");
					}else{
						if(args[1].equalsIgnoreCase("arrivant")){
							if(new RankFunction(target).getRank() == Rank.ARRIVANT){
								player.sendMessage(new ChatUtil().getPrefix()+"§cCe joueur possède déjà ce grade !");
							}else{
								new RankFunction(target).setRank(Rank.ARRIVANT);
								player.sendMessage(new ChatUtil().getPrefix()+"Vous venez de promouvoir §a"+args[1]+" §fau grade §aArrivant §f!");
								target.sendMessage(new ChatUtil().getPrefix()+"Vous venez d'être promu au grade de §aArrivant §f! \n §7Reconnectez-vous pour voir les modifications !");
							}
						}else if(args[1].equalsIgnoreCase("initie")){
							if(new RankFunction(target).getRank() == Rank.INITIE){
								player.sendMessage(new ChatUtil().getPrefix()+"§cCe joueur possède déjà ce grade !");
							}else{
								new RankFunction(target).setRank(Rank.INITIE);
								player.sendMessage(new ChatUtil().getPrefix()+"Vous venez de promouvoir §a"+args[1]+" §fau grade §aInitié §f!");
								target.sendMessage(new ChatUtil().getPrefix()+"Vous venez d'être promu au grade de §aInitié §f! \n §7Reconnectez-vous pour voir les modifications !");
							}
						}else if(args[1].equalsIgnoreCase("debutant")){
							if(new RankFunction(target).getRank() == Rank.DEBUTANT){
								player.sendMessage(new ChatUtil().getPrefix()+"§cCe joueur possède déjà ce grade !");
							}else{
								new RankFunction(target).setRank(Rank.DEBUTANT);
								player.sendMessage(new ChatUtil().getPrefix()+"Vous venez de promouvoir §a"+args[1]+" §fau grade §aDébutant §f!");
								target.sendMessage(new ChatUtil().getPrefix()+"Vous venez d'être promu au grade de §aDébutant §f! \n §7Reconnectez-vous pour voir les modifications !");
							}
						}else if(args[1].equalsIgnoreCase("amateur")){
							if(new RankFunction(target).getRank() == Rank.AMATEUR){
								player.sendMessage(new ChatUtil().getPrefix()+"§cCe joueur possède déjà ce grade !");
							}else{
								new RankFunction(target).setRank(Rank.AMATEUR);
								player.sendMessage(new ChatUtil().getPrefix()+"Vous venez de promouvoir §a"+args[1]+" §fau grade §aAmateur §f!");
								target.sendMessage(new ChatUtil().getPrefix()+"Vous venez d'être promu au grade de §aAmateur §f! \n §7Reconnectez-vous pour voir les modifications !");
							}
						}else if(args[1].equalsIgnoreCase("vip")){
							if(new RankFunction(target).getRank() == Rank.VIP){
								player.sendMessage(new ChatUtil().getPrefix()+"§cCe joueur possède déjà ce grade !");
							}else{
								new RankFunction(target).setRank(Rank.VIP);
								player.sendMessage(new ChatUtil().getPrefix()+"Vous venez de promouvoir §a"+args[1]+" §fau grade §aVIP §f!");
								target.sendMessage(new ChatUtil().getPrefix()+"Vous venez d'être promu au grade de §aVIP §f! \n §7Reconnectez-vous pour voir les modifications !");
							}
						}else if(args[1].equalsIgnoreCase("moderateur")){
							if(new RankFunction(target).getRank() == Rank.MODERATEUR){
								player.sendMessage(new ChatUtil().getPrefix()+"§cCe joueur possède déjà ce grade !");
							}else{
								new RankFunction(target).setRank(Rank.MODERATEUR);
								player.sendMessage(new ChatUtil().getPrefix()+"Vous venez de promouvoir §a"+args[1]+" §fau grade §aModérateur §f!");
								target.sendMessage(new ChatUtil().getPrefix()+"Vous venez d'être promu au grade de §aModérateur §f! \n §7Reconnectez-vous pour voir les modifications !");
							}
						}else if(args[1].equalsIgnoreCase("administrateur")){
							if(new RankFunction(target).getRank() == Rank.ADMINISTRATEUR){
								player.sendMessage(new ChatUtil().getPrefix()+"§cCe joueur possède déjà ce grade !");
							}else{
								new RankFunction(target).setRank(Rank.ADMINISTRATEUR);
								player.sendMessage(new ChatUtil().getPrefix()+"Vous venez de promouvoir §a"+args[1]+" §fau grade §aAdministrateur §f!");
								target.sendMessage(new ChatUtil().getPrefix()+"Vous venez d'être promu au grade de §aAdministrateur §f! \n §7Reconnectez-vous pour voir les modifications !");
							}
						}else{
							player.sendMessage(new ChatUtil().getPrefix()+"Faite /rank <joueur> <rank> ! ");
						}
					}
				}else{
					player.sendMessage(new ChatUtil().getPrefix()+"Faite /rank <joueur> <rank> ! \n"+new ChatUtil().getPrefix()+"§6Liste des grades : §eArrivant, Initie, Debutant, Amateur, VIP, Moderateur, Administrateur");
				}
			}else{
				player.sendMessage(new ChatUtil().getPrefix()+"§cVous devez être Administrateur pour éffectuer cette commande !");
			}
		}else{
			Player target = Bukkit.getPlayerExact(args[0]);

			if(target != null){
				if(args[1].equalsIgnoreCase("arrivant")){
					if(new RankFunction(target).getRank() != Rank.ARRIVANT){
						new RankFunction(target).setRank(Rank.ARRIVANT);
					}
				}else if(args[1].equalsIgnoreCase("initie")){
					if(new RankFunction(target).getRank() != Rank.INITIE){
						new RankFunction(target).setRank(Rank.INITIE);
					}
				}else if(args[1].equalsIgnoreCase("debutant")){
					if(new RankFunction(target).getRank() != Rank.DEBUTANT){
						new RankFunction(target).setRank(Rank.DEBUTANT);
					}
				}else if(args[1].equalsIgnoreCase("amateur")){
					if(new RankFunction(target).getRank() != Rank.AMATEUR){
						new RankFunction(target).setRank(Rank.AMATEUR);
					}
				}else if(args[1].equalsIgnoreCase("vip")){
					if(new RankFunction(target).getRank() != Rank.VIP){
						new RankFunction(target).setRank(Rank.VIP);
					}
				}else if(args[1].equalsIgnoreCase("moderateur")){
					if(new RankFunction(target).getRank() != Rank.MODERATEUR){
						new RankFunction(target).setRank(Rank.MODERATEUR);
					}
				}else if(args[1].equalsIgnoreCase("administrateur")){
					if(new RankFunction(target).getRank() != Rank.ADMINISTRATEUR){
						new RankFunction(target).setRank(Rank.ADMINISTRATEUR);
					}
				}
			}
		}
		
		return false;
	}

}
