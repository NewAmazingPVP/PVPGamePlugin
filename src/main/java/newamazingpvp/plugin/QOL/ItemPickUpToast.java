package newamazingpvp.plugin.QOL;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemPickUpToast implements Listener {

    @EventHandler
    public void playerPickUpItem(PlayerPickupItemEvent e){

        Player player = e.getPlayer();
        ItemStack item = e.getItem().getItemStack();
        ItemMeta meta = item.getItemMeta();
        String itemName = meta.getDisplayName();

        player.sendTitle(" ", itemName + " §2§l+", 0, 20, 0);


    }


    @EventHandler
    public void playerDropItem(PlayerDropItemEvent e){

        Player player = e.getPlayer();
        ItemStack item = e.getItemDrop().getItemStack();
        ItemMeta meta = item.getItemMeta();
        String itemName = meta.getDisplayName();

        player.sendTitle(" ", itemName + " §4§l+", 0, 20, 0);


    }

}
