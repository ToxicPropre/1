package net.arkube.blackswords.events.players;

import net.arkube.blackswords.functions.Locations;
import net.arkube.blackswords.functions.RankFunction;
import net.arkube.blackswords.rank.Rank;
import net.arkube.blackswords.utils.ChatUtil;

import org.bukkit.Statistic;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class PlayerDeath implements Listener {

	@EventHandler
	public void onDeath(PlayerDeathEvent event){
		Player player = event.getEntity();
		Player killer = player.getKiller();
		
		new Locations(player).teleportOnSpawn();
		
		if(killer == null){
			Player lastDamager = (Player) player.getLastDamageCause();
			
			if(lastDamager.getStatistic(Statistic.PLAYER_KILLS) == 0){
				new RankFunction(lastDamager).setRank(Rank.INITIE);
				lastDamager.sendMessage(new ChatUtil().getPrefix()+"Vous avez atteint les �a0Kills�f, vous venez d'�tre promu �aIniti� �f!");
			}else if(lastDamager.getStatistic(Statistic.PLAYER_KILLS) == 0){
				new RankFunction(lastDamager).setRank(Rank.DEBUTANT);
				lastDamager.sendMessage(new ChatUtil().getPrefix()+"Vous avez atteint les �a0Kills�f, vous venez d'�tre promu �aD�butant �f!");
			}else if(lastDamager.getStatistic(Statistic.PLAYER_KILLS) == 0){
				new RankFunction(lastDamager).setRank(Rank.AMATEUR);
				lastDamager.sendMessage(new ChatUtil().getPrefix()+"Vous avez atteint les �a0Kills�f, vous venez d'�tre promu �aAmateur �f!");
			}
		}else{
			if(killer.getStatistic(Statistic.PLAYER_KILLS) == 0){
				new RankFunction(killer).setRank(Rank.INITIE);
				killer.sendMessage(new ChatUtil().getPrefix()+"Vous avez atteint les �a0Kills�f, vous venez d'�tre promu �aIniti� �f!");
			}else if(killer.getStatistic(Statistic.PLAYER_KILLS) == 0){
				new RankFunction(killer).setRank(Rank.DEBUTANT);
				killer.sendMessage(new ChatUtil().getPrefix()+"Vous avez atteint les �a0Kills�f, vous venez d'�tre promu �aD�butant �f!");
			}else if(killer.getStatistic(Statistic.PLAYER_KILLS) == 0){
				new RankFunction(killer).setRank(Rank.AMATEUR);
				killer.sendMessage(new ChatUtil().getPrefix()+"Vous avez atteint les �a0Kills�f, vous venez d'�tre promu �aAmateur �f!");
			}
		}
	}
	
}
