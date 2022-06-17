package nautical;

/**
 * 
 * @author Poten
 * This class defines a Cruise ship.
 * 
 */
public class CruiseShip extends Ship
{
    protected int maxPassangers;

    public CruiseShip() 
    {
    }
    
    /**
     * 
     * @param maxPassangers Holds the max number of passangers a cruise ship can hold
     * @param shipName Holds the cruise ship's name
     * @param shipYear Holds the cruise ship's year
     */
    public CruiseShip(int maxPassangers, String shipName, int shipYear) 
    {
        super(shipName, shipYear);
        this.maxPassangers = maxPassangers;
    }

    /**
     * 
     * @return's max passangers
     */
    public int getMaxPassangers() 
    {
        return maxPassangers;
    }

    /**
     * 
     * @param maxPassangers 
     * set's the max passangers
     */
    public void setMaxPassangers(int maxPassangers) 
    {
        this.maxPassangers = maxPassangers;
    }
    
}
