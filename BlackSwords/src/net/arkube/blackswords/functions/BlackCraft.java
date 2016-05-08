package net.arkube.blackswords.functions;

import org.bukkit.Bukkit;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class BlackCraft {

	private Inventory inv = Bukkit.createInventory(null, 27, "§8§nBlackCraft");
	
	public BlackCraft(){}

	@SuppressWarnings("deprecation")
	public ItemStack getGlassitem(){
		ItemStack glass = new ItemStack(Material.STAINED_GLASS_PANE, 1, DyeColor.CYAN.getData());
		ItemMeta glassM = glass.getItemMeta();
	    glassM.setDisplayName(" ");
	    glass.setItemMeta(glassM);
		return glass;
	}
	
	public ItemStack getRetourItem(){
		ItemStack barrier = new ItemStack(Material.BARRIER, 1);
		ItemMeta barrierM = barrier.getItemMeta();
	    barrierM.setDisplayName("§c§nRetour");
		barrier.setItemMeta(barrierM);
	    return barrier;
	}
	
	public ItemStack getFurnace(){
		ItemStack furnace = new ItemStack(Material.FURNACE, 1);
		ItemMeta furnaceM = furnace.getItemMeta();
		furnaceM.setDisplayName("§6Four");
		furnace.setItemMeta(furnaceM);
		return furnace;
	}
	
	public ItemStack getChest(){
		ItemStack chest = new ItemStack(Material.CHEST, 1);
		ItemMeta chestM = chest.getItemMeta();
		chestM.setDisplayName("§6Coffre");
		chest.setItemMeta(chestM);
		return chest;
		
	}
	
	public ItemStack getWorkbench(){
		ItemStack workbench = new ItemStack(Material.WORKBENCH, 1);
		ItemMeta workbenchM = workbench.getItemMeta();
		workbenchM.setDisplayName("§6Table de craft");
		workbench.setItemMeta(workbenchM);
		return workbench;
	}
	
	public ItemStack getAnvil(){
		ItemStack anvil = new ItemStack(Material.ANVIL, 1);
		ItemMeta anvilM = anvil.getItemMeta();
		anvilM.setDisplayName("§6Enclume");
		anvil.setItemMeta(anvilM);
		return anvil;
	}
	
	public ItemStack getEnchantmentTable(){
		ItemStack et = new ItemStack(Material.ENCHANTMENT_TABLE, 1);
		ItemMeta etM = et.getItemMeta();
		etM.setDisplayName("§6Table d'enchantement");
		et.setItemMeta(etM);
		return et;
	}
	
	public ItemStack getBrewingStand(){
		ItemStack bs = new ItemStack(Material.BREWING_STAND_ITEM, 1);
		ItemMeta bsM = bs.getItemMeta();
		bsM.setDisplayName("§6Stand d'alchimie");
		bs.setItemMeta(bsM);
		return bs;
	}
	
	public ItemStack getBeacon(){
		ItemStack beacon = new ItemStack(Material.BEACON, 1);
		ItemMeta beaconM = beacon.getItemMeta();
		beaconM.setDisplayName("§6Beacon");
		beacon.setItemMeta(beaconM);
		return beacon;
	}
	
	public Inventory getInventory(){
		return inv;
	}

	public void open(Player player){
		
	    inv.setItem(0, getGlassitem());
	    inv.setItem(1, getGlassitem());
	    inv.setItem(2, getGlassitem());
	    inv.setItem(3, getGlassitem());
	    inv.setItem(4, getGlassitem());
	    inv.setItem(5, getGlassitem());
	    inv.setItem(6, getGlassitem());
	    inv.setItem(7, getGlassitem());
	    inv.setItem(8, getGlassitem());
	    inv.setItem(9, getGlassitem());
	    
	    inv.setItem(10, getFurnace());
	    inv.setItem(11, getChest());
	    inv.setItem(12, getWorkbench());
	    inv.setItem(13, getAnvil());
	    inv.setItem(14, getEnchantmentTable());
	    inv.setItem(15, getBrewingStand());
	    inv.setItem(16, getBeacon());
	    
	    inv.setItem(17, getGlassitem());
	    inv.setItem(18, getGlassitem());
	    inv.setItem(19, getGlassitem());
	    inv.setItem(20, getGlassitem());
	    inv.setItem(21, getGlassitem());
	    inv.setItem(22, getGlassitem());
	    inv.setItem(23, getGlassitem());
	    inv.setItem(24, getGlassitem());
	    inv.setItem(25, getGlassitem());
	    inv.setItem(26, getRetourItem());
		
		player.openInventory(inv);
	}
	
}
