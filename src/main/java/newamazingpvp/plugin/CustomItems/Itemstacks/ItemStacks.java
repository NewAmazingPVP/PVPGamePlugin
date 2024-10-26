package newamazingpvp.plugin.CustomItems.Itemstacks;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemStacks {


    public static ItemStack mysticSword() {
        ItemStack corruptedMobSoul = new ItemStack(Material.GOLDEN_SWORD);
        ItemMeta meta = corruptedMobSoul.getItemMeta();
        meta.setDisplayName("§5§lMystic Sword §7[No Enchants]");
        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.LIGHT_PURPLE + "Used in the mystic well!");
        meta.setLore(lore);
        corruptedMobSoul.setItemMeta(meta);
        return corruptedMobSoul;
    }

}
