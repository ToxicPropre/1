package net.arkube.blackswords.events.players;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.inventory.CraftingInventory;
import org.bukkit.inventory.ItemStack;

public class PlayerCraft implements Listener {

	@EventHandler
	public void changeCraft(PrepareItemCraftEvent e){
		if(e.getInventory() instanceof CraftingInventory){
			CraftingInventory inv = (CraftingInventory)e.getInventory();
	
			switch(inv.getResult().getType()){
			
			case WOOD_PICKAXE:
				inv.setResult(new ItemStack(Material.STONE_PICKAXE, 1));
			break;
			
			case WOOD_SWORD:
				inv.setResult(new ItemStack(Material.STONE_SWORD, 1));
			break;
			
			case WOOD_AXE:
				inv.setResult(new ItemStack(Material.STONE_AXE, 1));
			break;
			
			case WOOD_HOE:
				inv.setResult(new ItemStack(Material.STONE_HOE, 1));
			break;
			
			case WOOD_PLATE:
				inv.setResult(new ItemStack(Material.STONE_PLATE, 1));
			break;
			
			case WOOD_SPADE:
				inv.setResult(new ItemStack(Material.STONE_SPADE, 1));
			break;
		
			
			
			default:
			break;
			
			}
			
		}
		
		
	}
	
}
