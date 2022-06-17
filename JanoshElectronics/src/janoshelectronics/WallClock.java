package janoshelectronics;

/**
 *
 * @author Poten
 */

/**
 * This is the Wall Clock class, it gets information template from the Clock class then displays it's own information instead.
 * 
 */
public class WallClock extends Clock
{
    /**
     * 
     * @param eManufacturer holds value for wall clock's manufacturer
     * @param ePrice holds value for wall clock's price.
     * @param eWeight holds value for wall clock's weight.
     * @param time holds value for wall clock's time.
     * @param room holds value for where the wall clock is.
     */
    public WallClock(String eManufacturer, double ePrice, double eWeight, String time, String room) 
    {
        super(eManufacturer, ePrice, eWeight, time, room);
    }
    
    /**
     * This method overrides the Clock classes room method so that Wall Clock can have it's own room name. 
     */
    @Override
    public void room() 
    {
        room = room;       
    }
    
    /**
     * 
     * @return allows wall clock to override clocks information so wall clock can display it's own information.
     */
    @Override
    public String toString() {
        return super.toString();
    }

}
