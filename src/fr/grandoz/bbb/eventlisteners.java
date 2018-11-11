package fr.grandoz.bbb;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;
import net.minecraft.server.v1_12_R1.PlayerInventory;

public class eventlisteners implements Listener {
@EventHandler
public void onbreak(PlayerDropItemEvent e) {
	
	
	Player player = e.getPlayer();
	
	
	
	}

@EventHandler

	public void onlic(InventoryClickEvent event ) {


Player player = (Player) event.getWhoClicked();
ItemStack current = event.getCurrentItem();
Inventory inv = event.getInventory();

if(inv.getName().equalsIgnoreCase("§6BLOCKS")) {

for(shop item : shop.values() ) {
	
	if(item.getItinv().getType() == current.getType() && !(current==null) && player.getInventory().containsAtLeast(item.getItemReq(), item.getamount()))
	{
		
		player.getInventory().addItem(item.getItinv() );
		player.getInventory().removeItem(item.getItemReq() );
		event.setCancelled(true);
	}else {
	player.sendMessage("§6Vous n'avez pas les items requis pour faire cela");
	event.setCancelled(true);
	}
}

	}
	

	





}

}
		
	 
	
	
		 


