package janoshcontactdirectory;

/**
 *
 * @author Poten
 */
public class ContactInfo 
{
    String cName;
    String cAddress;
    String cEmail;
    String cWorkNumber;
    String cCellNumber;
    
    public ContactInfo() 
    {
        
    }
    
    public ContactInfo(String cName, String cAddress, String cEmail, String cWorkNumber, String cCellNumber)
    {
        this.cName = cName;
        this.cAddress = cAddress;
        this.cEmail = cEmail;
        this.cWorkNumber = cWorkNumber;
        this.cCellNumber = cCellNumber;
    }

    
}
