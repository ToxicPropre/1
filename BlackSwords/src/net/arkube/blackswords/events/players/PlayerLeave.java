package net.arkube.blackswords.events.players;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerLeave implements Listener {
	
	 @EventHandler
	 public void onQuit(PlayerQuitEvent event){
		 Player player = event.getPlayer();
		 
		 event.setQuitMessage("§7[§c-§7]"+player.getName());
	 }

}
