package de.junkdarc.socialcommands.main;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import de.junkdarc.socialcommands.commands.SocialCommandsBefehle;

public class SocialCommandsMain extends JavaPlugin {

	@Override
	public void onEnable() {
		Commands();
		Config();
		
		System.out.println("Mining-Royal Social Commands v" + this.getDescription().getVersion() + " wurde erfolgreich geladen!");
	}
	
	private void Commands() {
		SocialCommandsBefehle socials = new SocialCommandsBefehle(this);
		getCommand("ts").setExecutor(socials);
		getCommand("ts3").setExecutor(socials);
		getCommand("teamspeak").setExecutor(socials);
		getCommand("hp").setExecutor(socials);
		getCommand("homepage").setExecutor(socials);
		getCommand("forum").setExecutor(socials);
}
	
	private void Config() {
		FileConfiguration cfg = this.getConfig();
		cfg.options().copyDefaults(true);
		this.saveConfig();
		System.out.println("Mining-Royal Social Commands - Config wurde erfolgreich erstellt!");
	}
	
	@Override
	public void onDisable() {
		
		System.out.println("Mining-Royal Social Commands v" + this.getDescription().getVersion() + " wurde erfolgreich geschlossen!");
	}
	
}
