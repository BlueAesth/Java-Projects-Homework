package recursionseven;
import java.util.Scanner;
/**
 * This program use three different methods with recursion
 * Multiplication recursion method
 * Powers recursion method
 * String reverse recursion method
 * @author Poten(Janosh)
 */
public class RecursionSeven 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        
        //Beginning of Multiplication Recursion
        System.out.println("Enter first number for recursive multiplication");
        int multNumOne = in.nextInt();
        System.out.println("Enter second number for recursive multiplication");
        int multNumTwo = in.nextInt();        
        System.out.println("The product of number one and number two is " + 
                (recursiveMult(multNumOne, multNumTwo)));
        //End of Multiplication Recursion
        
        System.out.println("\n");
        
        //Beginning of Powers Recursion
        System.out.println("Enter the base for power's recursion");
        int powNumOne = in.nextInt();
        System.out.println("Enter the exponent for power's recursion");
        int powNumTwo = in.nextInt();        
        System.out.println("The result of the base to the power of the exponent is " + 
                (recursivePowers(powNumOne, powNumTwo)));
        //End of Powers Recursion
        
        System.out.println("\n");
        
        //Beginning of Reverse String Recursion
        String phraseInput;
        System.out.println("Enter the phrase you'd like to reverse");
        phraseInput = in.next();         
        String phraseReversed = recursiveString(phraseInput);
        System.out.println("The phrase you entered in reverse is " + "\n" 
                + phraseReversed);
        //End of Reverse String Recursion        
    }    
    
        /**
         * This method will multiply two integers recursively
         * @param x First number to be multiplied 
         * @param y Second number to be multiplied
         * @returns The product of x and y
         */
        private static int recursiveMult(int x, int y)
        {
            //The product of 1 to x is x times the product of (x-1)            
            if (x == 0 || y == 0) //if either number is 0, the product is 0
            {
                return 0;
            }
            else if (y > 0) //multiply via recursion
            {
                return x + recursiveMult(x, y - 1);
            }
            return -recursiveMult(x, -y); //end all possibilities            
        }
    
        /**
         * This method provides the result of a base number and it's power
         * @param x Is the base number
         * @param y Is the power for the base number
         * @returns the result of the base number and it's inputted exponent
         */
        private static int recursivePowers(int x, int y)
        {
            if (x == 0)//Anything times zero is zero
            {
                return 0;
            }
            else if (y == 0) //Base case
            {
                return 1;//Anything with a power of 0 equals 1
            }
            else
            {
                return x * recursivePowers(x, y - 1); //Powers via Recursion
            }            
        }
        
        /**
         * This method will take a user's string input and reverse it using recursion
         * @param phrase Is the user's input
         * @returns The reserved version of the user's input
         */
        private static String recursiveString(String phrase)
        {
            if (phrase.isEmpty())//Base case
            {
                return phrase;
            }//This takes a string and creates a substring using chars.
            return recursiveString(phrase.substring(1)) + phrase.charAt(0);//Recursive calling
        }       
}
