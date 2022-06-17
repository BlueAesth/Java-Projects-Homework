package janoshelectronics;

/**
 *
 * @author Poten
 * this class gets it's information template from home appliance, while setting up to give more specific information to it's subclasses.
 */
/**Class derived from HomeAppliance*/
public class Clock extends HomeApplicance
{
    protected String currentTime;

    /**
     * 
     * @param eManufacturer  holds value for portable clock's manufacturer
     * @param ePrice holds value for portable clock's price
     * @param eWeight holds value for portable clock's weight
     * @param time holds value for portable clock's time
     * @param room holds value for portable clock's room
     */
    public Clock(String eManufacturer, double ePrice, double eWeight,
            String time, String room) 
    {
        super(eManufacturer, ePrice, eWeight, room);
        
        this.currentTime = time;
    }     
        
    /**
     * 
     * @return Gets time
     */
    String getTime()
    {
        return currentTime;
    }
    
    /**
     * Sets time
     * @param time 
     */
    void setTime(String time)
    {
        currentTime = time;
    }
    
    /**
     * Overrides home appliance's room method so that clock may create its own
     */
    @Override
    public void room() 
    {
        room = room;       
    }

    /**
     * 
     * @return Allows clock to display information using its own information and a template from home appliance
     */
    @Override
    public String toString() {
        return super.toString() + "Current Time: " + currentTime + "\n" + "Room: " + room + "\n";
    }

   
}
