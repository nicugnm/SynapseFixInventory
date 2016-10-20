package SynapseFixInventory;

import java.util.Map;

import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerJoinEvent;
import cn.nukkit.item.Item;
import cn.nukkit.plugin.PluginBase;

/*
 Credits : NycuRO & haniokasai . Thanks for help.
 */

public class MainClass extends PluginBase implements Listener {

    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    public void onDisable() {

    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
    	Player player = e.getPlayer();
    	if(player.getGamemode() == 1){
    		player.setGamemode(0);
    		player.setGamemode(1);
    	}else{
    		Map<Integer, Item> inv = player.getInventory().getContents();
    		Item[] arm= player.getInventory().getArmorContents();
    		if(player.getGamemode() == 2){
    			player.setGamemode(1);
    			player.setGamemode(2);
    		}else if(player.getGamemode() == 0){
    			player.setGamemode(1);
    			player.setGamemode(0);
    		}
    		player.getInventory().setContents(inv);
    		player.getInventory().setArmorContents(arm);
    		player.getInventory().sendArmorContents(player);
    		player.getInventory().sendContents(player);
    	}


    }
}
