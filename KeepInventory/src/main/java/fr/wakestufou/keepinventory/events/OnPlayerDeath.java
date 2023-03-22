package fr.wakestufou.keepinventory.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class OnPlayerDeath implements Listener {
    @EventHandler(priority = EventPriority.LOWEST)
    public void onPlayerDeath(PlayerDeathEvent e) {
        Player p = e.getPlayer();
       if (!p.getScoreboardTags().contains("KeepInventory"))
           return;

       e.setKeepInventory(true);
       e.setKeepLevel(true);
       e.setShouldDropExperience(false);
       e.getDrops().clear();
    }
}
