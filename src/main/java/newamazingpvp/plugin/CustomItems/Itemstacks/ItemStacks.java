package newamazingpvp.plugin.CustomItems.Itemstacks;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemStacks {


    public static ItemStack mysticSword() {
        ItemStack corruptedMobSoul = new ItemStack(Material.GOLDEN_SWORD);
        ItemMeta meta = corruptedMobSoul.getItemMeta();
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.DARK_PURPLE + "U$e To Cr" + ChatColor.MAGIC + "a" + ChatColor.DARK_PURPLE + "ft Extra Hearts!" + ChatColor.MAGIC + "L");
        lore.add(ChatColor.LIGHT_PURPLE + "Very rare drop from mobs!");
        meta.setLore(lore);
        corruptedMobSoul.setItemMeta(meta);
        return corruptedMobSoul;
    }

}
