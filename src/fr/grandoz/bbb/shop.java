package fr.grandoz.bbb;

import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;;
public enum shop {

	BOIS(0 , "§bAchetez 8 de bois pour 1pp" , new ItemStack(Material.WOOD , 8) , "§cBois" , new ItemStack(Material.GOLD_NUGGET , 1 ) , 1),
	COBEL(1 , "§bAchetez 32 de cobel pour 1pp" ,new ItemStack(Material.COBBLESTONE , 32) , "§cCobel" ,  new ItemStack(Material.GOLD_NUGGET ) , 1),
	ARGILE(2 , "§bAchetez 8 d'argile pour 1pp" , new ItemStack(Material.ORANGE_GLAZED_TERRACOTTA , 8) , "§cArgile" , new ItemStack(Material.GOLD_NUGGET , 1)  , 1),
	ICE(3 , "§bAchetez 8 de ice pour 16pp" , new ItemStack(Material.ICE , 8) , "§cICE" , new ItemStack(Material.GOLD_NUGGET , 16) , 1),
	PACKED(4, "§bAchetez 8 de packed ice pour 32pp" , new ItemStack(Material.PACKED_ICE , 8) , "§cPacked Ice" , new ItemStack(Material.GOLD_NUGGET , 32) , 32),
	MYC(5 , "§bAchetez 1 de mycélium pour 16pp" , new ItemStack(Material.MYCEL , 1) , "§CMycélium" ,  new ItemStack(Material.GOLD_NUGGET , 16) , 16),
	OPSI(6 , "§bAchetez 1 d'opsidienne pour 32pp" , new ItemStack(Material.OBSIDIAN , 1) , "§cObsidienne" , new ItemStack(Material.GOLD_NUGGET , 32) , 32),
	SEND(7 , "§bAchetez 8 end stone pour 32pp" , new ItemStack(Material.ENDER_STONE , 8) , "§cEnd Stone" ,new ItemStack(Material.GOLD_NUGGET , 32) , 32);
	
	private int amount;
	private ItemStack itemReq;
		private String name;
	private String desc;
	private int Place;
	private ItemStack itinv;
	
	
	shop(int Place , String desc , ItemStack itinv , String name , ItemStack itemReq , int amount) {
		
		this.setItinv(itinv);
	this.desc = desc;
	this.Place = Place;	
	this.setItemReq(itemReq);
	this.name = name;
	this.amount = amount;
	
	
	
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getPlace() {
		return Place;
	}
	public void setPlace(int amount) {
		this.Place = amount;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ItemStack getItinv() {
		
		this.itinv = itinv;
		
		ItemMeta m = itinv.getItemMeta();
		m.setDisplayName(name);
		m.setLore(Arrays.asList(desc));
		itinv.setItemMeta(m);
		return itinv;
	}
	public void setItinv(ItemStack itinv) {
		this.itinv = itinv;
	}
	public ItemStack getItemReq() {
		return itemReq;
	}
	public void setItemReq(ItemStack itemReq) {
		this.itemReq = itemReq;
	}
	
	public boolean isitem(ItemStack curr){
		if(curr.getType() == itinv.getType()) {
		return true;
		
		}
		return false;
	
	
	
	
	}
	
	public boolean achat(Player player , ItemStack curr , InventoryClickEvent event) {
		this.itemReq = itemReq;
	if(player.getInventory().containsAtLeast(itemReq , amount) && curr.getType() == itinv.getType() ) {
		player.sendMessage("§6achat effectué");
	
		player.getInventory().addItem(itinv);
		player.getInventory().removeItem(itemReq);
		player.sendMessage("§6achat effectué");

		
		return true;
	}else {
		player.sendMessage("§6Vous navez pas les Items requis");
		event.setCancelled(true);
	}
	
	return false;
	
	}
	
	public int getamount() {

	return amount;
	
	
	}
	
	
	
	
	
	
	
	
            
        
    
 
	
	
	public void createmenu(Inventory inv) {
	
	
	
	for(shop item : shop.values() ) {
	
	inv.setItem(item.getPlace(), item.getItinv());
	}
		
	}
	
	
}