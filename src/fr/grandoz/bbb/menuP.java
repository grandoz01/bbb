package fr.grandoz.bbb;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public enum menuP {
	SEND(7 ,  new ItemStack(Material.GRASS , 1) , "§cEnd Stone" );


 private int Place;
 private ItemStack itinv;
 private String name;


menuP(int Place , ItemStack itinv , String name  ) {
		
		
	
	this.setPlace(Place);	
	this.setItinv(itinv);
	this.setName(name);
	
	
	
	
	}


public int getPlace() {
	return Place;
}


public void setPlace(int place) {
	Place = place;
}


public ItemStack getItinv() {
	return itinv;
}


public void setItinv(ItemStack itinv) {
	this.itinv = itinv;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}
	
	
	
}
