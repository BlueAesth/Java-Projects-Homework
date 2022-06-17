/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame;

/**
 *
 * @author speciosr
 */
public class CardGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        DeckOfCards myDeck = new DeckOfCards();
        
        myDeck.DisplayDeck();
        myDeck.Shuffle();
        System.out.println("************************");
        myDeck.DisplayDeck();
        System.out.println("************************");
        
        System.out.println(myDeck.DealCard());
        System.out.println(myDeck.DealCard());
        System.out.println(myDeck.DealCard());
        System.out.println(myDeck.DealCard());
        System.out.println(myDeck.DealCard());
    }
    
}
