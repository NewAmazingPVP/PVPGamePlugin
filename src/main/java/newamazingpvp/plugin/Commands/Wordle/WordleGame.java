package newamazingpvp.plugin.Commands.Wordle;

import org.bukkit.entity.Player;

import java.util.Arrays;
import java.util.List;

public class WordleGame {

    private static List<String> testREMOVETHIS = Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z");
    private Player player;

    private String word;


    public WordleGame(Player player) {
        this.player = player;

        for(int i=0; i<5; i++){

            word=word+testREMOVETHIS.indexOf((int)(Math.random()*27));
        }

        player.sendMessage(word);


    }








}
