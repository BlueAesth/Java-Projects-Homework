package janoshelectronics;

/**
 *
 * @author Poten
 * This class gets it's information template from Portable electronics while allowing for ipod's own information
 */
/**Class derived from PortableElectronics*/
public class Ipod extends PortableElectronics
{
    /**Variables Declaration*/
    protected int capacity;
    protected String modelType;
   
/**
 * 
 * @param eManufacturer holds value for ipod's manufacturer
 * @param ePrice holds value for ipod's price
 * @param eWeight holds value for ipod's weight
 * @param mType holds value for ipod's model type
 * @param batteryType holds value for ipod's battery type
 * @param capacity holds value for ipod's capacity
 */
    public Ipod(String eManufacturer, double ePrice, double eWeight,
            String mType, String batteryType, int capacity)
    {
        super(eManufacturer, ePrice, eWeight, batteryType);         
           
        this.capacity = capacity;
        this.modelType = mType;
    }

    /**
     * 
     * @param capacity Sets capacity
     */
    public void setCapacity(int capacity) 
    {
        this.capacity = capacity;
    }

    /**
     * 
     * @param modelType Sets model type
     */
    public void setModelType(String modelType) 
    {
        this.modelType = modelType;
    }      
    
    /**
     * Overrides Portable Electronic's battery type method so that ipod may create it's own
     */
    @Override
    public void batteryType() 
    {
        batteryType = batteryType;        
    }
    
    /**
     * 
     * @return Ipod's information while using portable electronic's strong template
     */
    @Override
    public String toString() {
        return super.toString() + "Battery Type: " + batteryType + "\n" + "Capacity: " + capacity + 
                "\n" + "Model Type: " + modelType + "\n";
    }
        
    
}
