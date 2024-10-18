package newamazingpvp.plugin.Mystics;


import newamazingpvp.plugin.PVPGame;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.scheduler.BukkitRunnable;

import static newamazingpvp.plugin.PVPGame.SERVER;

public class MysticWell implements Listener {


    @EventHandler
    public void openCraftingTable(PlayerInteractEvent e) {

        Player player = e.getPlayer();
        Block clickedBlock = e.getClickedBlock();

        if (e.getAction() == Action.RIGHT_CLICK_BLOCK && clickedBlock.getType() == Material.ENCHANTING_TABLE) {
            e.setCancelled(true);

            openCustomWellMenu(player);

        }
    }

    @EventHandler
    public void closeMenu(InventoryCloseEvent e) {

        Player player = (Player) e.getPlayer();
        Inventory inv = e.getInventory();

        if (e.getView().getTitle() == "§d§l[Mystic Well]") {
            player.playSound(player.getLocation(), Sound.BLOCK_ENDER_CHEST_CLOSE, 1.0f, 1.0f);
            mysticWellIDLE.cancel();
        }

    }

    public static BukkitRunnable mysticWellIDLE;

    public static void openCustomWellMenu(Player player) {

        player.playSound(player.getLocation(), Sound.BLOCK_ENDER_CHEST_OPEN, 1.0f, 1.0f);
        Inventory mysticWell = Bukkit.createInventory(player, 45, "§d§l[Mystic Well]");

        mysticWell.setItem(0, grayGlassGUI());
        mysticWell.setItem(1, grayGlassGUI());
        mysticWell.setItem(2, grayGlassGUI());
        mysticWell.setItem(3, grayGlassGUI());
        mysticWell.setItem(4, grayGlassGUI());
        mysticWell.setItem(5, grayGlassGUI());
        mysticWell.setItem(6, grayGlassGUI());
        mysticWell.setItem(7, grayGlassGUI());
        mysticWell.setItem(8, grayGlassGUI());

        mysticWell.setItem(9, grayGlassGUI());
        //mysticWell.setItem(10,grayGlassGUI());
        //mysticWell.setItem(11,grayGlassGUI());
        //mysticWell.setItem(12,grayGlassGUI());
        mysticWell.setItem(13, grayGlassGUI());
        mysticWell.setItem(14, grayGlassGUI());
        mysticWell.setItem(15, grayGlassGUI());
        mysticWell.setItem(16, grayGlassGUI());
        mysticWell.setItem(17, grayGlassGUI());

        mysticWell.setItem(18, grayGlassGUI());
        //mysticWell.setItem(19,grayGlassGUI());
        //mysticWell.setItem(20,grayGlassGUI()); //enter slot
        //mysticWell.setItem(21,grayGlassGUI());
        mysticWell.setItem(22, grayGlassGUI());
        //mysticWell.setItem(23,grayGlassGUI()); //sacrifice slot
        mysticWell.setItem(24, grayGlassGUI());
        //mysticWell.setItem(25,grayGlassGUI()); // output slot
        mysticWell.setItem(26, grayGlassGUI());

        mysticWell.setItem(27, grayGlassGUI());
        //mysticWell.setItem(28,grayGlassGUI());
        //mysticWell.setItem(29,grayGlassGUI());
        //mysticWell.setItem(30,grayGlassGUI());
        mysticWell.setItem(31, grayGlassGUI());
        mysticWell.setItem(32, grayGlassGUI());
        mysticWell.setItem(33, grayGlassGUI());
        mysticWell.setItem(34, grayGlassGUI());
        mysticWell.setItem(35, grayGlassGUI());

        mysticWell.setItem(36, grayGlassGUI());
        mysticWell.setItem(37, grayGlassGUI());
        mysticWell.setItem(38, grayGlassGUI());
        mysticWell.setItem(39, grayGlassGUI());
        mysticWell.setItem(40, grayGlassGUI());
        mysticWell.setItem(41, grayGlassGUI());
        mysticWell.setItem(42, grayGlassGUI());
        mysticWell.setItem(43, grayGlassGUI());
        mysticWell.setItem(44, grayGlassGUI());

        player.openInventory(mysticWell);


        mysticWellIDLE = new BukkitRunnable() {


            @Override
            public void run() {

                Bukkit.broadcastMessage("test1");



            }
        };
        mysticWellIDLE.runTaskTimer(PVPGame.PVPGame, 0L, 10L); // Start immediately and repeat every second



    }


    //Animations


    public static void updateMysticWellMenuIDLE(int frame, Inventory inv) {




    }



    //GUI Items
    public static ItemStack grayGlassGUI() {
        ItemStack ITEM = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);
        ItemMeta META = ITEM.getItemMeta();
        META.setDisplayName(" ");
        ITEM.setItemMeta(META);
        return ITEM;
    }



}
