package janoshelectronics;

/**
 *
 * @author Poten
 */
public class JanoshElectronics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here

        Ipod Ipod1 = new Ipod("Samsung", 50.00, 25.00, "Silences","Lithium",54);//, "Infinite", 756);
        
        System.out.println("Ipod" + "\n" + Ipod1);
        
        CellPhone CellPhone1 = new CellPhone("Apple", 126, 88, "3159406910",
                true, "Lithium Platinum");
        
        System.out.println("Cell Phone" + "\n" + CellPhone1);
        
        Clock Clock1 = new Clock("Timex", 500, 5, "3:45", "Kitchen");
        
        System.out.println("Clock" + "\n" + Clock1);
        
        Printer Printer1 = new Printer("Dell", 250.00, 50, 30, true, false, "Office");
        
        System.out.println("Printer" + "\n" + Printer1);
        
        WallClock WallClock1 = new WallClock("GM", 25, 2, "3:45", "Living Room");
        
        System.out.println("Wall Clock" + "\n" + WallClock1);
        
        AlarmClock AlarmClock1 = new AlarmClock("Logitech", 50, 3, "3:45", "7:00am", "Living Room");
        
        System.out.println("Alarm Clock" + "\n" + AlarmClock1);
    }
    
}
