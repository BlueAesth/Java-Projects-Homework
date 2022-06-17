package janoshelectronics;

/**
 *
 * @author Poten
 * This is the Alarm Clock class, it gets information template from the Clock class then displays it's own information instead, including the alarm's time.
 * 
 */
public class AlarmClock extends Clock
{

    protected String alarmTime;
    /**
     * 
     * @param eManufacturer holds value for alarm clock's manufacturer
     * @param ePrice holds value for alarm clock's price.
     * @param eWeight holds value for alarm clock's weight.
     * @param time holds value for alarm clock's time.
     * @param room holds value for where the alarm clock is.
     * @param aTime holds value for alarm clock's set alarm time.
     */
    public AlarmClock(String eManufacturer, double ePrice, double eWeight,
            String time, String aTime, String room)
    {
        super(eManufacturer, ePrice, eWeight, time, room);
        
        setAlarm(aTime);
    }    
    /**
     * This method sets the alarm time to the specified alarm time from main.
     * @param atime Alarm Time
     */
    public void setAlarm(String atime)
    {
        alarmTime = atime;
    }
    /**
     * This method overrides Clock's room method so that alarm clock can have it's own room.
     */
    @Override
    public void room() 
    {
        room = room;       
    }
    /**
     * 
     * @returns Alarm clock information using clock's toString while adding alarm clock's alarm time.
     */
    @Override
    public String toString() {
        return super.toString() + "Alarm Set For: " + alarmTime ;
    }
}
