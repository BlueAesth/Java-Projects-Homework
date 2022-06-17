package mainDriver;

/**
 *
 * @author Poten
 */
public class DeckOfCard 
{ 
/*Stores 52 OBJECTS of card class
 Add methods to: Shuffle, Deal card, report numofCard left in deck
 */   
    private Card[] deck; //52 Card objects in array, deck
    private int remainingCards; //How many cards have been dealt from deck Array
    
    /**
     *
     */
    public DeckOfCard() //Creating Deck
    {
        deck = new Card[52];
        int cardIndex = 0; //How many cards created
        for (int suit = 0; suit <=3; suit++)
        {
            for (int face = 1; face <=13; face++)
            {
                deck[cardIndex] = new Card(face, suit);
                cardIndex++;
            }               
        }
        remainingCards =0;        
    }
    
    public void shuffle()
    {
        //put all used cards in deck and shuffle randomly
        for (int index = 51; index > 0; index--)
        {
            int rand = (int)(Math.random()*(index*1));
            Card temp = deck[index];
            deck[index] = deck[rand];
            deck[rand] = temp;
        }
        remainingCards = 0;
    }
    
    
    public int cardsLeft() {
          // As cards are dealt from the deck, the number of cards left
          // decreases.  This function returns the number of cards that
          // are still left in the deck.
        return 52 - remainingCards;
    }
    
    public Card dealCard() {
          // Deals one card from the deck and returns it.
        if (remainingCards == 52)
           shuffle();
        remainingCards++;
        return deck[remainingCards - 1];
    }
    
}