package fr.grandoz.bbb;

import org.bukkit.Material;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {

	
	
	@Override
	public void onEnable() {
		
		
		
		
		getServer().getPluginManager().registerEvents(new eventlisteners(), this);
		
		getCommand("shop").setExecutor(new command());
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
