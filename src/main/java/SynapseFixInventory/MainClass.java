package SynapseFixInventory;

import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerJoinEvent;
import cn.nukkit.plugin.PluginBase;

public class MainClass extends PluginBase implements Listener {

    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    public void onDisable() {

    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        e.getPlayer().setGamemode(1);
        e.getPlayer().setGamemode(0);
    }
}
