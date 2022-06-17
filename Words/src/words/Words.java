package words;

/**
 *
 * @author Poten
 */
public class Words 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Book dictionary1 = new Dictionary(100,2);
        
        System.out.println("Number of pages " + dictionary1.getPages());
        System.out.println("Number of definitons " + ((Dictionary)dictionary1).getDefinitions());//polymorphism
        System.out.println("Definitions per page " + ((Dictionary)dictionary1).computeRatio());
        
        System.out.println(dictionary1);
        
        dictionary1 = new Book(10000);//casting
        
        System.out.println(dictionary1);
    }
    
}
