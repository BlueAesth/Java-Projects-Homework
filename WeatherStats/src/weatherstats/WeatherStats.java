package weatherstats;

/**
 *
 * @author Poten
 */
public class WeatherStats 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        WeatherStatsList myList = new WeatherStatsList();
        
        myList.addFront(new WeatherInfo(10,20,30)); //notice add front, so this line is actaully last in the list.
        myList.addFront(new WeatherInfo(45,55,65));
        myList.addFront(new WeatherInfo(4,5,6));
        
        WeatherInfo temp;
        
        temp = myList.GetWeatherInfo(0);
        System.out.println(temp);
        
        temp = myList.GetWeatherInfo(2);
        System.out.println(temp);
        
        temp = myList.GetWeatherInfo(1);
        System.out.println(temp);
        
    }
    
}
