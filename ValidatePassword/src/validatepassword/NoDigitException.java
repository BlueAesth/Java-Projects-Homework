package validatepassword;

/**
 *
 * @author Poten
 * Custom exception for missing digits in password
 */
public class NoDigitException extends Exception
{
    public NoDigitException (String message)
    {
        super(message);
    }
}
