package words;

/**
 *
 * @author Poten
 */
public class Book 
{
    protected int pages = 1500;

    public Book() 
    {
        System.out.println("Book default contructor");
    }    
    
    public Book(int pages) 
    {
        System.out.println("Book contructor");
        this.pages = pages;        
    }       

    public int getPages() 
    {
        return pages;
    }

    public void setPages(int pages) 
    {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" + "pages=" + pages + '}';
    }
    
    
}
