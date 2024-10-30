package newamazingpvp.plugin.QOL;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Collection;

import static newamazingpvp.plugin.PVPGame.world;

public class DropedItemNames {

    @EventHandler
    public void playerMove(PlayerMoveEvent e){


        Collection<Entity> entities = world.getEntities();

        for (Entity entity : entities) {

            if(entity instanceof Item){

                ItemMeta meta = ((Item) entity).getItemStack().getItemMeta();

                entity.setCustomNameVisible(true);

            }

        }

    }

}
