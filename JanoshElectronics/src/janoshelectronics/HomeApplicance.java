package janoshelectronics;

/**
 *
 * @author Poten
 * This class gets it's information template from electronics while seeting up for subclasses to take on more specific information
 */

/**Class derived from Electronics*/
public abstract class HomeApplicance extends Electronics
{
    /**Variables Declaration*/
    protected String room;

    /**HomeAppliance Constructor*/
    /**
     * 
     * @param eManufacturer holds value for Home Appliance's manufacturer
     * @param ePrice holds value for Home Appliance's price
     * @param eWeight holds value for Home Appliance's weight
     * @param room holds value for Home Appliance's room (Not used)
     */
    public HomeApplicance(String eManufacturer, double ePrice, double eWeight, String room) 
    {
        super(eManufacturer, ePrice, eWeight);
        
        this.room = room;
    }
    
    /**
     * Set's up template for subclass to use room method
     */
    public abstract void room();

}
