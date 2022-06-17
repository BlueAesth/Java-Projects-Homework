package words;

/**
 *
 * @author Poten
 */
public class Dictionary extends Book //Getting pages from book, inheriting form book//
{
    private int definitions = 52500;
    
    public Dictionary() 
    {
        System.out.println("Dictionary Default Constructor");
    }
    
    public Dictionary(int definitions, int pages) 
    {        
        //super(pages); //this has to be the first statement//
        this.pages = pages;
        this.definitions = definitions;
        System.out.println("Dictionary Constructor");
    }

    public double computeRatio()
    {
        return (double)definitions / pages; //(double is "casting" So that it is not int divide int, outputs douvle
    }
    
    public int getDefinitions() {
        return definitions;
    }

    public void setDefinitions(int definitions) {
        this.definitions = definitions;
    }

    @Override //Overriding Book's ToString
    public String toString() {
        return "Dictionary{" + "definitions=" + definitions + super.toString() + getPages() + '}'; //super tostring, dictionary
    }
    
    
}
