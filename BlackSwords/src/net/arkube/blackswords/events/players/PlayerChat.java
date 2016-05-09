package net.arkube.blackswords.events.players;

import net.arkube.blackswords.functions.RankFunction;
import net.arkube.blackswords.rank.Rank;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class PlayerChat implements Listener{

	@EventHandler
	public void onChat(AsyncPlayerChatEvent event){
		Player player = event.getPlayer();
		String message = event.getMessage();
		
		if(new RankFunction(player).getRank() == Rank.ARRIVANT){
			event.setFormat(Rank.ARRIVANT.getName()+player.getName()+" §7-> §f"+message);
		}else if(new RankFunction(player).getRank() == Rank.INITIE){
			event.setFormat(Rank.INITIE.getName()+player.getName()+" §7-> §f"+message);
		}else if(new RankFunction(player).getRank() == Rank.ARRIVANT){
			event.setFormat(Rank.ARRIVANT.getName()+player.getName()+" §7-> §f"+message);
		}else if(new RankFunction(player).getRank() == Rank.AMATEUR){
			event.setFormat(Rank.AMATEUR.getName()+player.getName()+" §7-> §f"+message);
		}else if(new RankFunction(player).getRank() == Rank.VIP){
			event.setFormat(Rank.VIP.getName()+player.getName()+" §7-> §f"+message);
		}else if(new RankFunction(player).getRank() == Rank.MODERATEUR){
			event.setFormat(Rank.MODERATEUR.getName()+player.getName()+" §7-> §f"+message);
		}else if(new RankFunction(player).getRank() == Rank.ADMINISTRATEUR){
			event.setFormat(Rank.ADMINISTRATEUR.getName()+player.getName()+" §7-> §f"+message);
		}
	}
	
}
