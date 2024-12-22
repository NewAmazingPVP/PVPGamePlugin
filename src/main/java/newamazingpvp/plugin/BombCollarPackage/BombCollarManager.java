package newamazingpvp.plugin.BombCollarPackage;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class BombCollarManager {




    public static ItemStack bombCollar(String controllerPlayer, boolean distanceTriggered){
        ItemStack corruptedMobSoul = new ItemStack(Material.DARK_OAK_TRAPDOOR);
        ItemMeta meta = corruptedMobSoul.getItemMeta();
        meta.setDisplayName("§4BOMB COLLAR");
        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        List<String> lore = new ArrayList<>();
        lore.add("§e[Can only be removed with controller]");
        lore.add("§e[Goes boom if triggered]");
        lore.add("§e[Captured by " + controllerPlayer + "]");

        if(distanceTriggered){
            lore.add("§eDistance triggered [TRUE]");
        }else{
            lore.add("§eDistance triggered [FALSE]");
        }

        meta.setLore(lore);
        corruptedMobSoul.setItemMeta(meta);
        return corruptedMobSoul;
    }

    public static ItemStack bombCollarController(String victim, boolean distanceTriggered){
        ItemStack corruptedMobSoul = new ItemStack(Material.TNT);
        ItemMeta meta = corruptedMobSoul.getItemMeta();
        meta.setDisplayName("§4Bomb collar controller");
        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        List<String> lore = new ArrayList<>();
        lore.add("§e[Shift RightClick] to trigger bomb");
        lore.add("§e[RightClick] to toggle distance mode");
        lore.add("§7if you are >50 blocks away, bomb triggers");
        lore.add("§e[Collar on  " + victim + "]");

        if(distanceTriggered){
            lore.add("§eDistance triggered [TRUE]");
        }else{
            lore.add("§eDistance triggered [FALSE]");
        }

        meta.setLore(lore);
        corruptedMobSoul.setItemMeta(meta);
        return corruptedMobSoul;
    }




}
