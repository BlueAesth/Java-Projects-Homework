/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame;

import java.util.Random;

/**
 *
 * @author speciosr
 */
public class DeckOfCards 
{
    private Card deck[];
    private int cardCount;
    private final int NUMBER_OF_CARDS = 52;
    
    public DeckOfCards()
    {
        deck = new Card[NUMBER_OF_CARDS];
        
        int count = 0;
        for (int suit = 1; suit <= 4; suit++)
        {
            for (int face = 1; face <= 13; face++)
            {
                deck[count] = new Card(face, suit);
                count++;
            }
        }
    }
    
    public void DisplayDeck()
    {
        for(Card temp : deck)
        {
            System.out.println(temp);
        }
    }
    
    public void Shuffle()
    {
        Random generator = new Random();
        
        int ran1, ran2;
        Card temp;
        cardCount = 0;
        
        for(int count = 0; count < 1000; count++)
        {
            ran1 = generator.nextInt(NUMBER_OF_CARDS);
            ran2 = generator.nextInt(NUMBER_OF_CARDS);
         
            temp = deck[ran1];
            deck[ran1] = deck[ran2];
            deck[ran2] = temp;
        }
    }
    
    public Card DealCard()
    {
        Card temp = null;
        
        if(cardCount < deck.length)
        {
            temp = deck[cardCount++];
        }
        
        return temp;
    }
}
