package me.maxcode.ShowHealth;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class FileChecker {

	
	public void checkFiles() {
		
		
		File file = new File("plugins/ShowHealthInChat/" + "Config.yml");
		FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);
		
		if (!file.exists()) {
		
			try {
				cfg.set("Nachricht", "Leben des Gegners:");
				cfg.save(file);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		
		
		
	}
	}
	
	
}
