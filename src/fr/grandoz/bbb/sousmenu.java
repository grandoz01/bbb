package fr.grandoz.bbb;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

public enum sousmenu {

	PRINCIPALE ("SHOP" , 27);
	
	private String name;
	
	sousmenu(String name, int size) {
	
		this.setName(name);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Inventory GetInventory() {
		
		Inventory inv = Bukkit.createInventory(null, 27 , name);
		
		for(menuP item : menuP.values()) {
		
			inv.setItem(item.getPlace(), item.getItinv());
		}
		return inv;
		
	}
}
