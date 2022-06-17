package weatherstats;

import linkedlistadt.LinkedListADT;
import linkedlistadt.Node;

/**
 *
 * @author Poten
 */
public class WeatherStatsList extends LinkedListADT<WeatherInfo>
{
    public WeatherInfo GetWeatherInfo(int item)
    {
        WeatherInfo temp = null;
        
        if (item <= size && item >=0)
        {
            Node<WeatherInfo> current = front;

            for (int count = 0; count < item; count++)
            {
                current = current.getNext();
            }
            temp = current.getValue();
        }
        return temp;
    }
}
