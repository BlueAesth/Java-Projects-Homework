package janoshelectronics;

/**
 *
 * @author Poten
 * This class helps set up subclasses pertaining to it. 
 */

public class Electronics 
{
    /**Variable Declaration*/
    protected String manufacturer;
    protected double price;
    protected double weight;

    /**Electronics Constructor*/
    /**
     * 
     * @param eManufacturer creates a spot for electronic's manufacturer
     * @param ePrice create a spot for electronic's price
     * @param eWeight creates a spot for electronic's price
     */
    public Electronics(String eManufacturer, double ePrice, double eWeight) 
    {
        this.manufacturer = eManufacturer;
        this.price = ePrice;
        this.weight = eWeight;
    }        
    
    /**To print Electronics information*/
    /**
     * 
     * @return Set up format for other electornic's toStrings
     */
    public String toString() {
        return "Manufacturer: " + manufacturer + "\n" + "Price: " + price +
                "\n" + "Weight: " + weight + "\n";
    }
    
}
