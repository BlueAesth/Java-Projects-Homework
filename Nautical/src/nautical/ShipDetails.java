package nautical;

/**
 *
 * @author Poten
 */
public interface ShipDetails 
{
    /**
     * This method will display details about a ship.
     */
    public void DisplayShipDetails();
    
    /**
     * This method will compare two ships to determine which is older.
     * @param obj
     * @return 
     */
    public boolean isOlder(ShipDetails obj);
    
}
