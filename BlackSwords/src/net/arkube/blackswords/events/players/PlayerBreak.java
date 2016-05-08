package net.arkube.blackswords.events.players;


import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class PlayerBreak implements Listener {
	
	@EventHandler
	public void onBreak(BlockBreakEvent event){
		if(event.getBlock().getType().equals(Material.LOG)){
			breakAllBlock(event.getBlock());
		}else if(event.getBlock().getType().equals(Material.IRON_ORE)){
			Bukkit.getWorlds().get(0).dropItem(event.getBlock().getLocation(), new ItemStack(Material.IRON_INGOT, 1));
		}else if(event.getBlock().getType().equals(Material.GOLD_ORE)){
			Bukkit.getWorlds().get(0).dropItem(event.getBlock().getLocation(), new ItemStack(Material.GOLD_INGOT, 1));
		}else if(event.getBlock().getType().equals(Material.COAL_ORE)){
			Bukkit.getWorlds().get(0).dropItem(event.getBlock().getLocation(), new ItemStack(Material.TORCH, 1));
		}
	}
	
	public void breakAllBlock(Block block){
		if(block.getType().equals(Material.LOG)||block.getType().equals(Material.LEAVES)){
			block.breakNaturally();
			for(BlockFace face : BlockFace.values()){
				breakAllBlock(block.getRelative(face));
			}
		}
	}
	
}
