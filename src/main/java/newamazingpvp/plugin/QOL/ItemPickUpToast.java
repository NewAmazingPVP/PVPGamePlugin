package newamazingpvp.plugin.QOL;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
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

        player.sendMessage(itemName);

        player.sendTitle(" ", itemName, 10, 40, 5);



    }

}
