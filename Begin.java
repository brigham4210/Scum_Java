import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Begin{
    Random rand = new Random();
    // Player player = new Player();

    public List<Integer> deck = new ArrayList<>();
    public int lastNumber = 0;
    public int lastQuantity = 0;
    public int pass = 0;

    public List<Integer> makeNewDeck(){
        
        for (int t = 1; t <= 4; t++){
            for (int card = 2; card <= 14; card++){
                this.deck.add(card);
            }
        }
        this.deck.add(15);
        this.deck.add(15);
        
        return this.deck;
    }

    public List<Integer> giveCards(Player player){
        
        for (int t = 1; t <= 9; t++){
            int i = rand.nextInt(this.deck.size());
            player.playerDeck.add(this.deck.get(i));
            this.deck.remove(i);
            
        }
        Collections.sort(player.playerDeck);
        
        
        return player.playerDeck;
    }

    public void pass3times(){
        if (pass == 3){
            reset();
        }
    }

    public void reset(){
        lastNumber = 0;
        lastQuantity = 0;
    }
    
}