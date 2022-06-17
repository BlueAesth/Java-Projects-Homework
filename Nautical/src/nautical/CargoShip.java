package nautical;

/**
 *
 * @author Poten
 * Basic concept of a cargo ship that uses ship for structure
 */
public class CargoShip extends Ship
{
    protected int tonCapacity;

    public CargoShip() 
    {
    }
    
    /**
     * 
     * @param tonCapacity The weight capacity of a cargo ship.
     * @param shipName
     * @param shipYear 
     * Sets up the details of a cargo ship
     */
    public CargoShip(int tonCapacity, String shipName, int shipYear) 
    {
        super(shipName, shipYear);
        this.tonCapacity = tonCapacity;
    }

    /**
     * 
     * @return's the weight capacity of a cargo ship
     */
    public int getTonCapacity() 
    {
        return tonCapacity;
    }

    /**
     * 
     * @param tonCapacity gets set
     */
    public void setTonCapacity(int tonCapacity) 
    {
        this.tonCapacity = tonCapacity;
    }    
    
}
