package net.arkube.blackswords.functions;

import net.arkube.blackswords.utils.KitsList;

import org.bukkit.entity.Player;

public class Kits {

	private Player player;
	private KitsList kit;
	
	public Kits(Player player, KitsList kit){
		this.player = player;
		this.kit = kit;
	}
	
	public void give(){
		if(kit == KitsList.ARRIVANT){
			
		}else if(kit == KitsList.INITIE){
			
		}else if(kit == KitsList.DEBUTANT){
			
		}else if(kit == KitsList.AMATEUR){
			
		}else if(kit == KitsList.VIP){
			
		}
	}
	
}
