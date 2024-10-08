package newamazingpvp.plugin.Commands.Wordle;

import org.bukkit.entity.Player;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class WordleGame {

    private static List<String> testREMOVETHIS = Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z");
    private Player player;

    private String word;


    public WordleGame(Player player) {
        this.player = player;

        Random rand = new Random();

        for(int i=0; i<5; i++){

            word=word+testREMOVETHIS.get(rand.nextInt(testREMOVETHIS.size()));
        }

        player.sendMessage(" " + word);


    }








}
