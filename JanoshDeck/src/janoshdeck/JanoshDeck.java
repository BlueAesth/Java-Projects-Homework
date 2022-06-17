package janoshdeck;

/**
 *
 * @author Poten
 */
public class JanoshDeck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        /**Deals a card and prints it's information*/
         
        Deck deck = new Deck(); //Instance of Deck  

        /**This do will deal a card till there are no cards left of 52*/
            do
            {
            deck.dealCard();
            }
            while (deck.remainingCards != 0);       
        
    }
    
}
