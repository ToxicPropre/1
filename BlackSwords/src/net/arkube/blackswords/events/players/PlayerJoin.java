package net.arkube.blackswords.events.players;

import net.minecraft.server.v1_9_R1.AttributeInstance;

import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener {

	@EventHandler
	public void onJoin(PlayerJoinEvent event){
		Player player = event.getPlayer();
		
		AttributeInstance ai = (AttributeInstance) player.getAttribute(Attribute.GENERIC_ATTACK_SPEED);
		ai.setValue(16);
		
		event.setJoinMessage("§7[§a+§7]"+player.getName());
	}
	
}
