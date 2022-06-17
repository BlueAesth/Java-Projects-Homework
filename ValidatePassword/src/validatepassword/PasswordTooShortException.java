package validatepassword;

/**
 *
 * @author Poten
 * Custom exception for the password being too short
 */
public class PasswordTooShortException extends Exception
{
        public PasswordTooShortException (String message)
    {
        super(message);
    }
}
