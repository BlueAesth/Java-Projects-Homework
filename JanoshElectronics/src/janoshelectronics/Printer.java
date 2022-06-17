package janoshelectronics;

/**
 *
 * @author Poten
 * This class gets it's information template from Home Appliance while adding more information needed for printer status.
 */

public class Printer extends HomeApplicance
{
protected int dotsPerInch;
protected boolean paperLoaded;
protected boolean inkLoaded;
protected String loaded;
protected String inked;
    
/**
 * 
 * @param eManufacturer holds value for printer's manufacturer
 * @param ePrice holds value for printer's price
 * @param eWeight holds value for printer's weight
 * @param dpi holds value for printer's dots per inch
 * @param paper holds value for printer's paper status
 * @param ink holds value for printer's ink status
 * @param room holds value for printer's location
 */
    public Printer(String eManufacturer, double ePrice, double eWeight,
            int dpi, boolean paper, boolean ink, String room) 
    {
        super(eManufacturer, ePrice, eWeight, room);
        
        this.dotsPerInch = dpi;
        this.paperLoaded = paper;
        this.inkLoaded = ink;
    }
    
    /**
     * 
     * @param status loads either true or false from main for paperLoaded to hold.
     */
    public void loadPaper(boolean status)
    {
        paperLoaded = paperLoaded;
    }
    
    /**
     * 
     * @param status loads either true or false from main for inkLoaded to hold.
     */
    public void loadInk(boolean status)
    {
        inkLoaded = inkLoaded;
    }

    /**
     * Overrides Home Appliance's room method so that it may carry it's own information
     */
    @Override
    public void room() 
    {
        room = room;
    }

    /**
     * 
     * @return Returns information about the Printer
     */
    @Override
    public String toString() {
        return super.toString() + "Dots Per Inch: " +
                dotsPerInch + "\n" + "Paper Loaded: " + paperLoaded + 
                 "\n" + "Ink Loaded: " + inkLoaded + "\n" + "Room: " + room + "\n";
    }    
        
}
