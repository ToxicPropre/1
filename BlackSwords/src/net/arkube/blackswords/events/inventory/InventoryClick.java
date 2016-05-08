package net.arkube.blackswords.events.inventory;

import net.arkube.blackswords.functions.BlackCraft;
import net.arkube.blackswords.utils.ChatUtil;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class InventoryClick implements Listener {

	@EventHandler
	public void onClick(InventoryClickEvent event){
		Player player = (Player) event.getWhoClicked();
		ItemStack item = event.getCurrentItem();
		if(item.getType() == new BlackCraft().getRetourItem().getType()
				&& item.getItemMeta().getDisplayName() == new BlackCraft().getRetourItem().getItemMeta().getDisplayName()){
			event.setCancelled(true);
			player.closeInventory();
		}else if(item.getType() == new BlackCraft().getGlassitem().getType() 
				&& item.getItemMeta().getDisplayName() == new BlackCraft().getGlassitem().getItemMeta().getDisplayName()){
			event.setCancelled(true);
		}else if(item.getType() == new BlackCraft().getFurnace().getType() 
				&& item.getItemMeta().getDisplayName() == new BlackCraft().getFurnace().getItemMeta().getDisplayName()){
			if(player.getInventory().contains(Material.COBBLESTONE, 8)){
				player.getInventory().remove(new ItemStack(Material.COBBLESTONE, 8));
				player.getInventory().addItem(new ItemStack(Material.FURNACE, 1));
				player.closeInventory();
				player.playSound(player.getLocation(), Sound.ENTITY_VILLAGER_YES, 2F, 1F);
			}else{
				player.closeInventory();
				player.playSound(player.getLocation(), Sound.ENTITY_VILLAGER_NO, 2F, 1F);
				player.sendMessage(new ChatUtil().getBlackCraftPrefix()+"Vous n'avez toutes les fournitures nécessaire !");
			}
		}else if(item.getType() == new BlackCraft().getChest().getType() 
				&& item.getItemMeta().getDisplayName() == new BlackCraft().getChest().getItemMeta().getDisplayName()){
			if(player.getInventory().contains(Material.WOOD, 8)){
				player.getInventory().remove(new ItemStack(Material.WOOD, 8));
				player.getInventory().addItem(new ItemStack(Material.CHEST, 1));
				player.closeInventory();
				player.playSound(player.getLocation(), Sound.ENTITY_VILLAGER_YES, 2F, 1F);
			}else{
				player.closeInventory();
				player.playSound(player.getLocation(), Sound.ENTITY_VILLAGER_NO, 2F, 1F);
				player.sendMessage(new ChatUtil().getBlackCraftPrefix()+"Vous n'avez toutes les fournitures nécessaire !");
			}
		}else if(item.getType() == new BlackCraft().getWorkbench().getType() 
				&& item.getItemMeta().getDisplayName() == new BlackCraft().getWorkbench().getItemMeta().getDisplayName()){
			if(player.getInventory().contains(Material.WOOD, 4)){
				player.getInventory().remove(new ItemStack(Material.WOOD, 4));
				player.getInventory().addItem(new ItemStack(Material.WORKBENCH, 1));
				player.closeInventory();
				player.playSound(player.getLocation(), Sound.ENTITY_VILLAGER_YES, 2F, 1F);
			}else{
				player.closeInventory();
				player.playSound(player.getLocation(), Sound.ENTITY_VILLAGER_NO, 2F, 1F);
				player.sendMessage(new ChatUtil().getBlackCraftPrefix()+"Vous n'avez toutes les fournitures nécessaire !");
			}
		}else if(item.getType() == new BlackCraft().getAnvil().getType() 
				&& item.getItemMeta().getDisplayName() == new BlackCraft().getAnvil().getItemMeta().getDisplayName()){
			if(player.getInventory().contains(Material.IRON_INGOT, 7)){
				player.getInventory().remove(new ItemStack(Material.IRON_INGOT, 7));
				player.getInventory().addItem(new ItemStack(Material.ANVIL, 1));
				player.closeInventory();
				player.playSound(player.getLocation(), Sound.ENTITY_VILLAGER_YES, 2F, 1F);
			}else{
				player.closeInventory();
				player.playSound(player.getLocation(), Sound.ENTITY_VILLAGER_NO, 2F, 1F);
				player.sendMessage(new ChatUtil().getBlackCraftPrefix()+"Vous n'avez toutes les fournitures nécessaire !");
			}
		}else if(item.getType() == new BlackCraft().getEnchantmentTable().getType() 
				&& item.getItemMeta().getDisplayName() == new BlackCraft().getEnchantmentTable().getItemMeta().getDisplayName()){
			if(player.getInventory().contains(Material.OBSIDIAN, 4) && player.getInventory().contains(Material.DIAMOND, 2) && player.getInventory().contains(Material.BOOK, 1)){
				player.getInventory().remove(new ItemStack(Material.OBSIDIAN, 4));
				player.getInventory().remove(new ItemStack(Material.DIAMOND, 2));
				player.getInventory().remove(new ItemStack(Material.BOOK, 1));
				player.getInventory().addItem(new ItemStack(Material.ENCHANTMENT_TABLE, 1));
				player.closeInventory();
				player.playSound(player.getLocation(), Sound.ENTITY_VILLAGER_YES, 2F, 1F);
			}else{
				player.closeInventory();
				player.playSound(player.getLocation(), Sound.ENTITY_VILLAGER_NO, 2F, 1F);
				player.sendMessage(new ChatUtil().getBlackCraftPrefix()+"Vous n'avez toutes les fournitures nécessaire !");
			}
		}else if(item.getType() == new BlackCraft().getBrewingStand().getType() 
				&& item.getItemMeta().getDisplayName() == new BlackCraft().getBrewingStand().getItemMeta().getDisplayName()){
			if(player.getInventory().contains(Material.COBBLESTONE, 3) && player.getInventory().contains(Material.BLAZE_ROD, 1)){
				player.getInventory().remove(new ItemStack(Material.COBBLESTONE, 3));
				player.getInventory().remove(new ItemStack(Material.BLAZE_ROD, 1));
				player.getInventory().addItem(new ItemStack(Material.BREWING_STAND_ITEM, 1));
				player.closeInventory();
				player.playSound(player.getLocation(), Sound.ENTITY_VILLAGER_YES, 2F, 1F);
			}else{
				player.closeInventory();
				player.playSound(player.getLocation(), Sound.ENTITY_VILLAGER_NO, 2F, 1F);
				player.sendMessage(new ChatUtil().getBlackCraftPrefix()+"Vous n'avez toutes les fournitures nécessaire !");
			}
		}else if(item.getType() == new BlackCraft().getBeacon().getType() 
				&& item.getItemMeta().getDisplayName() == new BlackCraft().getBeacon().getItemMeta().getDisplayName()){
			if(player.getInventory().contains(Material.OBSIDIAN, 3) && player.getInventory().contains(Material.NETHER_STAR, 1)
					&& player.getInventory().contains(Material.GLASS, 5)){
				player.getInventory().remove(new ItemStack(Material.OBSIDIAN, 3));
				player.getInventory().remove(new ItemStack(Material.NETHER_STAR, 1));
				player.getInventory().remove(new ItemStack(Material.GLASS , 5));
				player.getInventory().addItem(new ItemStack(Material.BEACON, 1));
				player.closeInventory();
				player.playSound(player.getLocation(), Sound.ENTITY_VILLAGER_YES, 2F, 1F);
			}else{
				player.closeInventory();
				player.playSound(player.getLocation(), Sound.ENTITY_VILLAGER_NO, 2F, 1F);
				player.sendMessage(new ChatUtil().getBlackCraftPrefix()+"Vous n'avez toutes les fournitures nécessaire !");
			}
		}
	}
	
}
