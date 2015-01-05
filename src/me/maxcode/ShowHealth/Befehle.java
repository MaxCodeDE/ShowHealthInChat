package me.maxcode.ShowHealth;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Befehle implements CommandExecutor  {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String arg2, String[] args) {
		
		Player p = (Player) sender;
		String herzrot = ChatColor.RED + "❤";
		
		
		if (cmd.getName().equalsIgnoreCase("shic")) {

				
			p.sendMessage(herzrot + " Ein Plugin von MaxCode");
			
		}
		
		
		
		
		
		
		return false;
	}

}
