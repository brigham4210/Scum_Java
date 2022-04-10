import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Player {
    static Begin begin = new Begin();
    static Scanner input = new Scanner(System.in);

    public List<Integer> playerDeck = new ArrayList<>();
    private String name;
    private Integer number = 0;
    // public List<Integer> cards = new ArrayList<>();
    
    public Player(String name){
        this.name = name;
    }
    

    private void play(){
    
        number = card();

        while (number < begin.lastNumber || this.playerDeck.contains(number) == false || Collections.frequency(this.playerDeck, number) < begin.lastQuantity){
            number = card();
        }

        int quantity = quantity(number);
        while (quantity < begin.lastQuantity){
            quantity = quantity(number);
        }

        playCards(number, quantity);
        
        
        begin.lastNumber = number;
        begin.lastQuantity = quantity;
        
         
           
    }

    public void round() {
        System.out.println();
        System.out.println(name + ", it is your turn.");
        System.out.println("Needs to be bigger than: "+ begin.lastNumber);
        System.out.println("how many cards: "+ begin.lastQuantity);
        int response = ask();
        if (response != 0 && response != 1){
            round();
        } else if (response == 1){
            begin.pass += 1;
        } else if (response == 0){
            play();
            begin.pass = 0;
        }

        this.ace();
        begin.pass3times();
        
    }

    private int ask() {
        System.out.println("Pass or Not(1/0): ");
        int response = input.nextInt();

        return response;
    }

    private int card() {
        System.out.println("Pick the card: ");
        return number= input.nextInt(); 
    }

    private int quantity(int number) {
        System.out.println("How many: ");
        int quantity = input.nextInt();
        
        return quantity;
    }

    private void playCards(int number, int quantity) {
        List <Integer> cards = new ArrayList<>();
        for (int t = 1; t <= quantity; t++){
            cards.add(number);
            this.playerDeck.remove(Integer.valueOf(number));
        }
    }
        
    private void ace() {
        if (number >= 14){
            begin.reset();
            play();
        }
        
    }


}

    
        

        
    


