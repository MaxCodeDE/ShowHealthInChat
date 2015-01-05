package me.maxcode.ShowHealth;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class ShowHealth extends JavaPlugin  {

	
	@Override
	public void onEnable() {
		
		FileChecker fc = new FileChecker();
		fc.checkFiles();
		
		
		System.out.println("[ShowHealth] wurde geladen!");
		
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new PlayerDE(), this);
		
		this.getCommand("shic").setExecutor(new Befehle());
		
	}
	
	
	
	@Override
	public void onDisable() {
		 
		System.out.println("[ShowHealth] wurde ungeladen!");
		
		
	}
	
	
	
}
