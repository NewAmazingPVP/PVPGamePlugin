package newamazingpvp.plugin;


import newamazingpvp.plugin.Commands.AdminCMD.GiveCustomItem;
import newamazingpvp.plugin.Commands.AdminCMD.SetViewCMD;
import newamazingpvp.plugin.Mystics.MysticWell;
import newamazingpvp.plugin.QOL.DisplayedItemNames;
import newamazingpvp.plugin.QOL.ItemPickUpToast;
import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.plugin.java.JavaPlugin;

public final class PVPGame extends JavaPlugin {

    public static PVPGame PVPGame;
    public static Server SERVER;

    public static World world = Bukkit.getWorld("world");

    @Override
    public void onEnable() {

        PVPGame = this;
        SERVER = Bukkit.getServer();


        getServer().getPluginManager().registerEvents(new MysticWell(), this);
        getServer().getPluginManager().registerEvents(new ItemPickUpToast(), this);
        getServer().getPluginManager().registerEvents(new DisplayedItemNames(), this);

        getCommand("setview").setExecutor(new SetViewCMD());
        getCommand("givecustomitem").setExecutor(new GiveCustomItem());


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

