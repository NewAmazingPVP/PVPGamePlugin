package newamazingpvp.plugin.QOL;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Collection;

import static newamazingpvp.plugin.PVPGame.world;

public class DisplayedItemNames implements Listener {

    @EventHandler
    public void playerMove(PlayerMoveEvent e){


        Collection<Entity> entities = world.getEntities();

        for (Entity entity : entities) {

            if(entity instanceof Item){

                ItemMeta meta = ((Item) entity).getItemStack().getItemMeta();

                entity.setCustomName(meta.getItemName());

                entity.setCustomNameVisible(true);

            }

        }

    }

}
