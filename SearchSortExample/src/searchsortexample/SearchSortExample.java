package searchsortexample;

/**
 *
 * @author Poten
 */
public class SearchSortExample 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int data[] = new int[5];
      
        data[0] = 66;
        data[1] = 8;
        data[2] = 16;
        data[3] = 60;
        data[4] = 6;
        
        int posistion = linearSearch(data, 0 ,4, 3333);
        if (posistion !=1)
        
        if(linearSearch(data, 0, 4, 333))
        {
            System.out.println("Found value");
        }
        else
        {
            System.out.println("Value not found");
        }
        
    }        
        
        
        public static int linearSearch (int[] data, int min, int max, int target)
        {
                int index = min;
                boolean found = false;
                int pos = -1;                
                
                while(!found && index <=max)
                {
                    if(data[index] == target)
                    {
                        found = true;
                        pos = index;
                    }
                    else
                    {
                        
                    index++;
                    }
                    
                }
                return pos;
    }
    
}
