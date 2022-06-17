package janoshelectronics;

/**
 *
 * @author Poten
 * this class takes on electronics information while seeting up to give more specific information to subclasses
 */
/**Class derived from Electronics*/
public abstract class PortableElectronics extends Electronics
{
    /**Variables Declaration*/
    protected String batteryType;

    /**PortableElectronics Constructor*/
    /**
     * 
     * @param eManufacturer holds value for portable electronic's manufacturer
     * @param ePrice  holds value for portable electronic's price
     * @param eWeight  holds value for portable electronic's weight
     * @param type  holds value for portable electronic's battery type
     */
    public PortableElectronics(String eManufacturer, double ePrice, 
            double eWeight, String type) 
    {
        super(eManufacturer, ePrice, eWeight);
        
        this.batteryType = type;
    }
    
    /**
     *Abstract method, created so that each
     *subclass is required to create a battery type method
     */
    public abstract void batteryType();
}
