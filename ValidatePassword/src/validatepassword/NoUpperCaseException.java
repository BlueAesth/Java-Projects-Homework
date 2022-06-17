package validatepassword;

/**
 *
 * @author Poten
 * Custom exception for no upper case letters in password
 */
public class NoUpperCaseException extends Exception
{
        public NoUpperCaseException (String message)
    {
        super(message);
    }
}
