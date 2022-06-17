package mainDriver;

import java.util.Arrays;

/**
 *
 * @author Poten
 */
public class AssignmentOne 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        //Deals each card from the shuffled deck, prints info about each card
        //when dealt
        
        //Instance of Deck
        DeckOfCard deck = new DeckOfCard();
        
        
        deck.shuffle(); //Shuffling the Deck
        
        /*Dealing a card and Printing it*/
        System.out.println(Card.dealCard() + Card.cardsLeft());
        
        
        

        
        
        
        
        
        
        
    } 
      
}
