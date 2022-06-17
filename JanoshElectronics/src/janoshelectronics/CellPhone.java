package janoshelectronics;

/**
 *
 * @author Poten
 * Cell phone class inherits from Portable electronics, cell phone class will carry portable's information template over but allows to store own information.
 */

public class CellPhone extends PortableElectronics
{
    //Protected variables phonenumber, hascamera
    private String phoneNumber;
    private Boolean hasCamera;

    /**
     * 
     * @param eManufacturer holds value for cellphone's manufacturer
     * @param ePrice holds value for cellphone's price
     * @param eWeight holds value for cellphone's weight
     * @param number holds value for cellphone's number
     * @param camera holds value for cellphone's ability to have camera
     * @param batteryType holds value for cellphone's battery type
     */
    public CellPhone(String eManufacturer, double ePrice, double eWeight,
             String number, boolean camera, String batteryType)
    {
        super(eManufacturer, ePrice, eWeight, batteryType);
        
        this.phoneNumber = number;
        this.hasCamera = camera;
    }

/**
 * 
 * @return Gets phone number
 */
    public String getPhoneNumber() 
    {
        return phoneNumber;
    }

    /**
     * 
     * @return Gets Camera information
     */
    public Boolean getHasCamera() 
    {
        return hasCamera;
    }
        
    /**
     * Override's portable's battery type method so that cellphone may have it's own
     */
    @Override
    public void batteryType() 
    {
        batteryType = batteryType;
    }
    
    /**
     * 
     * @return Information about Cellphone
     */
    @Override
    public String toString() {
        return super.toString() + "Battery Type: " + batteryType + "\n" + 
                "Phone Number: " + phoneNumber + "\n" +
                "Camera: " + hasCamera + "\n";
    }
    
}
