package validatepassword;

/**
 *
 * @author Poten
 * Custom exception for no lower case letters in password
 */
public class NoLowerCaseException extends Exception
{
        public NoLowerCaseException (String message)
    {
        super(message);
    }
}
