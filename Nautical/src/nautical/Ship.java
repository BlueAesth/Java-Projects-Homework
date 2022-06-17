package nautical;

/**
 *
 * @author Poten
 * A basic concept/template for a ship, uses ship details interface
 */
public class Ship implements ShipDetails
{
    protected String shipName;
    protected int shipYear;

    public Ship() 
    {
    }
    
    /**
     * 
     * @param shipName
     * @param shipYear 
     * Sets up details about a general ship
     */
    public Ship(String shipName, int shipYear) 
    {
        this.shipName = shipName;
        this.shipYear = shipYear;        
    }

    /**
     * 
     * @return's a ship's name
     */
    public String getShipName() 
    {
        return shipName;
    }

    /**
     * 
     * @param shipName gets set
     */
    public void setShipName(String shipName) 
    {
        this.shipName = shipName;
    }

    /**
     * 
     * @return's a ship's year.
     */
    public int getShipYear() 
    {
        return shipYear;
    }

    /**
     * 
     * @param shipYear gets set
     */
    public void setShipYear(int shipYear) 
    {
        this.shipYear = shipYear;
    }
    
    /**
     * Displays the ship name and year
     */
   @Override
    public void DisplayShipDetails()
    {
        System.out.println(shipName + shipYear);
    }
    
    /**
     * 
     * @param shipYear holds the value of the requested ship's year.
     * @return's true is a ship is older, false if the ship is younger
     */
    @Override
    public boolean isOlder(ShipDetails shipYear)
    {
        boolean result;
        Ship temp = (Ship)shipYear;
        
        if (this.shipYear > temp.shipYear)
            result = true;
        else
            result = false;

        return result;
    }

}
