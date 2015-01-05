package me.maxcode.ShowHealth;

import java.io.File;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Damageable;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class PlayerDE implements Listener {

	
	@EventHandler
	public void onDeath(PlayerDeathEvent e) {
		
		
		if (e.getEntity().getKiller() instanceof Player) {
		if (e.getEntity().getPlayer() instanceof Player) {
			
			
			Player p = e.getEntity().getPlayer();
			Damageable killer = p.getKiller().getPlayer();
			
			double leben = killer.getHealth();
			
			String lebenchat = "";
			
			String herzrot = ChatColor.RED + "❤";
			String herzgrau = ChatColor.GRAY + "❤";
			
			leben = leben/2;
			double herzgrauint = 10 - leben;
			
			for (int i=0; leben > i; i++) {	
				lebenchat += herzrot;		
			}
			
			for (int i = 0; herzgrauint > i; i++) {
				lebenchat += herzgrau;
			}
			
			

			
			File file = new File("plugins/ShowHealthInChat/" + "Config.yml");
			FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);
			
			String nachricht = cfg.getString("Nachricht");
			
			
			
			p.sendMessage("");
			p.sendMessage(nachricht);
			p.sendMessage(lebenchat);
			p.sendMessage("");
			
		}
		}
		
		
	}
	
	
	
	
}
