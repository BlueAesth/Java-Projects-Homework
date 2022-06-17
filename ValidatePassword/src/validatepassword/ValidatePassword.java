package validatepassword;

/**
 *
 * @author Poten
 */
import java.util.Scanner;

public class ValidatePassword 
{

    /**
     * @param args the command line arguments
     * Creating method for user input via scanner class
     * Setting up a string variable for the user's password
     * prompts and gets user password
     * Tries to validate password and throws exception if invalid
     */
    public static void main(String[] args)
    {
       Scanner scan = new Scanner(System.in);
       
       String password;
       
       System.out.println("Please enter your password.");
       
       password = scan.nextLine();  
       
       try
       {
            //Sending the password to be validated
            validatePassword(password); 
       }
       catch(NoDigitException | PasswordTooShortException | NoLowerCaseException
               | NoUpperCaseException ex)
               {
                   System.out.println(ex.getMessage());
               }

    }   
    
    /**
     * 
     * @param triedPassword
     * @throws NoDigitException
     * @throws PasswordTooShortException
     * @throws NoLowerCaseException
     * @throws NoUpperCaseException 
     * 
     * Compares the user's password to see if it meets program's requirements
     * Uses exception classes to prompt the user as to what the password is missing.
     */
    public static void validatePassword(String triedPassword) throws 
            NoDigitException, PasswordTooShortException, NoLowerCaseException, 
            NoUpperCaseException
    {
        boolean valid = true;
        String upperChars = "(.*[A-Z].*)";
        String lowerChars = "(.*[a-z].*)";
        String digits = "(.*[0-9].*)";
        
        if (triedPassword.length() < 8)
        {
            valid = false;
            throw new PasswordTooShortException("The password is too short.");           
        }
        
        if (!triedPassword.matches(upperChars))
        {
            valid = false;
            throw new NoUpperCaseException("The password has no upper case letters.");
        }
        
        if (!triedPassword.matches(lowerChars))
        {
            valid = false;
            throw new NoLowerCaseException("The password has no lower case letters.");
        }
        
        if (!triedPassword.matches(digits))
        {
            valid = false;
            System.out.println("The password has no digits.");
        }
        
        if (valid)
            System.out.println("The password is valid!");
        
            
    }
    
}
