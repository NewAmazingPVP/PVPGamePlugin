package newamazingpvp.plugin.Commands.Wordle;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class WordleCMD implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player player = (Player) sender;

        WordleGame wordleGame = new WordleGame(player);




        return true;
    }


}
