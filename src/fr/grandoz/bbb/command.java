package fr.grandoz.bbb;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class command implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		Player player = (Player) sender;
	
	Inventory inv = Bukkit.createInventory(null, 27 , "§6BLOCKS");
     
		player.sendMessage("§cVous venez d'ouvrir le shop");
		

player.openInventory(inv);


		return false;
	}

}
