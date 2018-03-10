package de.junkdarc.socialcommands.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

import de.junkdarc.socialcommands.main.SocialCommandsMain;
import mkremins.fanciful.FancyMessage;

public class SocialCommandsBefehle implements CommandExecutor {
	
private SocialCommandsMain plugin;
	
	public SocialCommandsBefehle(SocialCommandsMain instance) {
		this.plugin=instance;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		String prefix = "§6[Mining-Royal] ";
		String tsip = this.plugin.getConfig().getString("teamspeakip");
		String hp = this.plugin.getConfig().getString("forum");
		
	
/////////////////Befehl : /ts \\\\\\\\\\\\\\\\\\
/////////////////Permission : Junkdarc.Socials.ts \\\\\\\\\\\\\\\\\\

		if(cmd.getName().equalsIgnoreCase("ts")) {
			String perm = "Junkdarc.Socials.ts";
			
			if(sender instanceof ConsoleCommandSender) {
				Bukkit.broadcastMessage(prefix + "§aDie Teamspeak IP lautet : §c" + tsip + "§a!");
				System.out.println("Den Spielern wurde die Teamspeak IP mitgeteilt!");
				return true;
			}

			Player spieler = (Player) sender;
			if(!(spieler.hasPermission(perm))) {
	
				spieler.sendMessage(prefix + "§4Du hast dazu keine Berechtigung. Es fehlt die Permission §3" + perm);
				System.out.println("Dem Spieler " + sender.getName() + " wurde mitgeteilt, dass Permission " + perm + " fehlt!");
				return true;
			}
			
			new FancyMessage("§aDie Teamspeak IP lautet : §c" + tsip + "§a!\n")
			.then("§bKlicke hier um direkt verbunden zu werden!")
			.link("http://mining-royal.de/index.php?link-forums/teamspeak-verbinder.67/")
			.tooltip("§9Klicke um direkt mit dem Server verbunden zu werden!")
			.send(spieler);

			System.out.println("Dem Spieler " + sender.getName() + " wurde die Teamspeak IP mitgeteilt!");
			return true;
		}

/////////////////Befehl : /ts3 \\\\\\\\\\\\\\\\\\
/////////////////Permission : Junkdarc.Socials.ts3 \\\\\\\\\\\\\\\\\\

		if(cmd.getName().equalsIgnoreCase("ts3")) {
			String perm = "Junkdarc.Socials.ts3";

			if(sender instanceof ConsoleCommandSender) {
				Bukkit.broadcastMessage(prefix + "§aDie Teamspeak IP lautet : §c" + tsip + "§a!");
				System.out.println("Den Spielern wurde die Teamspeak IP mitgeteilt!");
				return true;
			}

			Player spieler = (Player) sender;
			if(!(spieler.hasPermission(perm))) {
				spieler.sendMessage(prefix + "§4Du hast dazu keine Berechtigung. Es fehlt die Permission §3" + perm);
				System.out.println("Dem Spieler " + sender.getName() + " wurde mitgeteilt, dass Permission " + perm + " fehlt!");
				return true;
			}
	
			new FancyMessage("§aDie Teamspeak IP lautet : §c" + tsip + "§a!\n")
			.then("§bKlicke hier um direkt verbunden zu werden!")
			.link("http://mining-royal.de/index.php?link-forums/teamspeak-verbinder.67/")
			.tooltip("§9Klicke um direkt mit dem Server verbunden zu werden!")
			.send(spieler);
			
			System.out.println("Dem Spieler " + sender.getName() + " wurde die Teamspeak IP mitgeteilt!");
			return true;
		}

/////////////////Befehl : /teamspeak \\\\\\\\\\\\\\\\\\
/////////////////Permission : Junkdarc.Socials.teamspeak \\\\\\\\\\\\\\\\\\

		if(cmd.getName().equalsIgnoreCase("teamspeak")) {
			String perm = "Junkdarc.Socials.teamspeak";

			if(sender instanceof ConsoleCommandSender) {
				Bukkit.broadcastMessage(prefix + "§aDie Teamspeak IP lautet : §c" + tsip + "§a!");
				System.out.println("Den Spielern wurde die Teamspeak IP mitgeteilt!");
				return true;
			}

			Player spieler = (Player) sender;
			if(!(spieler.hasPermission(perm))) {
				spieler.sendMessage(prefix + "§4Du hast dazu keine Berechtigung. Es fehlt die Permission §3" + perm);
				System.out.println("Dem Spieler " + sender.getName() + " wurde mitgeteilt, dass Permission " + perm + " fehlt!");
				return true;
			}
	
			new FancyMessage("§aDie Teamspeak IP lautet : §c" + tsip + "§a!\n")
			.then("§bKlicke hier um direkt verbunden zu werden!")
			.link("http://mining-royal.de/index.php?link-forums/teamspeak-verbinder.67/")
			.tooltip("§9Klicke um direkt mit dem Server verbunden zu werden!")
			.send(spieler);
			System.out.println("Dem Spieler " + sender.getName() + " wurde die Teamspeak IP mitgeteilt!");
			return true;
		}

/////////////////Befehl : /homepage \\\\\\\\\\\\\\\\\\
/////////////////Permission : Junkdarc.Socials.homepage \\\\\\\\\\\\\\\\\\

		if(cmd.getName().equalsIgnoreCase("homepage")) {
			String perm = "Junkdarc.Socials.homepage";

			if(sender instanceof ConsoleCommandSender) {
				Bukkit.broadcastMessage(prefix + "§aDie Forum URL lautet : §c" + hp + "§a!");
				System.out.println("Den Spielern wurde die Forum URL mitgeteilt!");
				return true;
			}

			Player spieler = (Player) sender;
			if(!(spieler.hasPermission(perm))) {
				spieler.sendMessage(prefix + "§4Du hast dazu keine Berechtigung. Es fehlt die Permission §3" + perm);
				System.out.println("Dem Spieler " + sender.getName() + " wurde mitgeteilt, dass Permission " + perm + " fehlt!");
				return true;
			}
	
			new FancyMessage("§aDie Forum URL lautet : §c" + hp + "§a!\n")
			.then("§bKlicke hier um das Forum zu öffnen!")
			.link("http://mining-royal.de/")
			.tooltip("§9Klicke um direkt auf die Homepage zu gelangen!")
			.send(spieler);
			System.out.println("Dem Spieler " + sender.getName() + " wurde die Forum URL mitgeteilt!");
			return true;
		}

/////////////////Befehl : /hp \\\\\\\\\\\\\\\\\\
/////////////////Permission : Junkdarc.Socials.hp \\\\\\\\\\\\\\\\\\

		if(cmd.getName().equalsIgnoreCase("hp")) {
			String perm = "Junkdarc.Socials.hp";

			if(sender instanceof ConsoleCommandSender) {
				Bukkit.broadcastMessage(prefix + "§aDie Forum URL lautet : §c" + hp + "§a!");
				System.out.println("Den Spielern wurde die Forum URL mitgeteilt!");
				return true;
			}

			Player spieler = (Player) sender;
			if(!(spieler.hasPermission(perm))) {
				spieler.sendMessage(prefix + "§4Du hast dazu keine Berechtigung. Es fehlt die Permission §3" + perm);
				System.out.println("Dem Spieler " + sender.getName() + " wurde mitgeteilt, dass Permission " + perm + " fehlt!");
				return true;
			}
	
			new FancyMessage("§aDie Forum URL lautet : §c" + hp + "§a!\n")
			.then("§bKlicke hier um das Forum zu öffnen!")
			.link("http://mining-royal.de/")
			.tooltip("§9Klicke um direkt auf die Homepage zu gelangen!")
			.send(spieler);
			System.out.println("Dem Spieler " + sender.getName() + " wurde die Forum URL mitgeteilt!");
			return true;
		}

/////////////////Befehl : /forum \\\\\\\\\\\\\\\\\\
/////////////////Permission : Junkdarc.Socials.forum \\\\\\\\\\\\\\\\\\

		if(cmd.getName().equalsIgnoreCase("forum")) {
			String perm = "Junkdarc.Socials.forum";

			if(sender instanceof ConsoleCommandSender) {
				Bukkit.broadcastMessage(prefix + "§aDie Forum URL lautet : §c" + hp + "§a!");
				System.out.println("Den Spielern wurde die Forum URL mitgeteilt!");
				return true;
			}

			Player spieler = (Player) sender;
			if(!(spieler.hasPermission(perm))) {
				spieler.sendMessage(prefix + "§4Du hast dazu keine Berechtigung. Es fehlt die Permission §3" + perm);
				System.out.println("Dem Spieler " + sender.getName() + " wurde mitgeteilt, dass Permission " + perm + " fehlt!");
				return true;
			}
	
			new FancyMessage("§aDie Forum URL lautet : §c" + hp + "§a!\n")
			.then("§bKlicke hier um das Forum zu öffnen!")
			.link("http://mining-royal.de/")
			.tooltip("§9Klicke um direkt auf die Homepage zu gelangen!")
			.send(spieler);
			System.out.println("Dem Spieler " + sender.getName() + " wurde die Forum URL mitgeteilt!");
			return true;
		}

		return false;
	}


}

