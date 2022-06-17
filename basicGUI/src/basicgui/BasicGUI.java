package basicgui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Poten
 */
public class BasicGUI 
{

    private static MainFrame frame; //Object JFrame(updated:MainFrame), variable is frame, gets from swing    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        frame = new MainFrame("Push Counter");
        
    }
    

    
}
