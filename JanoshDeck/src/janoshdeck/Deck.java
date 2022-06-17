package janoshdeck;

/**
 *
 * @author Poten
 */
public class Deck 
{
    /**Creates 52 Card objects and stores them in Deck Array
    *Will have a method to shuffle the Deck Array
    *Will have a method to Deal a Card Object from Deck Array
    *Will have a method to determine the remaining Card objects in Deck Array
    */
    
    /**Data Declaration*/
    private Card[] deck; //52 Card objects in array, deck
    public int remainingCards; //How many cards have been dealt from deck Array

    /**Constructor; Creating the deck*/
    public Deck()
    {
        deck = new Card[52];
        int cardIndex = 0; //How many cards created
        for (int suit = 1; suit <=4; suit++)
        {
            for (int face = 1; face <=13; face++)
            {
                deck[cardIndex] = new Card(face, suit); //Putting the second card constructor's parameters; using the first constructor will give you multiple same cards
                cardIndex++;
            }               
        }
            remainingCards = 52;        
    }
    
    /**Shuffle Method*/
    public void shuffle()
    {
        //put all used cards in deck and shuffle randomly
        for (int index = 51; index > 0; index--) //you can actually shuffle more than 50 odd times, better shuffling.
        {
            int rand = (int)(Math.random()*(index*1)); //can also use two random numbers to shuffle through temp
            Card temp = deck[index]; //card temp should be created/ declared then use temp
            deck[index] = deck[rand];
            deck[rand] = temp;
        }
        remainingCards = 52;
    }    
    
    
    //Look at solved code for remainingcards error
    /**Deals a card*/
    public void dealCard() 
    {
        for(int index = 52; index >= 0; index--) 
            {
                shuffle();
                System.out.println("Your card is: " + deck[remainingCards-1]);
                remainingCards = index;
                cardsLeft();
            }
    }         
    
    /**Determines remaining cards left in the deck.*/
    public void cardsLeft() 
    {        
        System.out.println("Remaining Cards: " + remainingCards);
    }
    
}
