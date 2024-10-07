package newamazingpvp.plugin;

import newamazingpvp.plugin.Mystics.MysticWell;
import org.bukkit.plugin.java.JavaPlugin;

public final class PVPGame extends JavaPlugin {

    @Override
    public void onEnable() {

        getServer().getPluginManager().registerEvents(new MysticWell(), this);


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
