public class Main {

    static boolean end = false;

    static Begin begin = new Begin();
    static Player firstPlayer = new Player("Aaron");
    static Player secondPlayer = new Player("Ben");
    static Player thirdPlayer = new Player("Carl");
    static Player fourthPlayer = new Player("Dan");
    static Player fifthPlayer = new Player("Ethan");
    static Player sixthPlayer = new Player("Frank");
    public static void main(String[] args) {
        begin.makeNewDeck();
        begin.giveCards(firstPlayer);
        begin.giveCards(secondPlayer);
        begin.giveCards(thirdPlayer);
        begin.giveCards(fourthPlayer);
        begin.giveCards(fifthPlayer);
        begin.giveCards(sixthPlayer);
        

        while (end != true){
            
            if (firstPlayer.playerDeck.size() != 0){
                System.out.println(firstPlayer.playerDeck);
                firstPlayer.round();
            }
            if (secondPlayer.playerDeck.size() != 0){
                System.out.println(secondPlayer.playerDeck);
                secondPlayer.round();
            }
            if (thirdPlayer.playerDeck.size() != 0){
                System.out.println(thirdPlayer.playerDeck);
                thirdPlayer.round();
            }
            if (fourthPlayer.playerDeck.size() != 0){
                System.out.println(fourthPlayer.playerDeck);
                fourthPlayer.round();
            }
            if (fifthPlayer.playerDeck.size() != 0){
                System.out.println(fifthPlayer.playerDeck);
                fifthPlayer.round();
            }
            if (sixthPlayer.playerDeck.size() != 0){
                System.out.println(sixthPlayer.playerDeck);
                sixthPlayer.round();
            }
            
        }
        
        
    }
}
