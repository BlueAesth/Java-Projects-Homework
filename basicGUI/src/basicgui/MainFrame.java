package basicgui;

import javax.swing.*;

/**
 *
 * @author Poten
 */
public class MainFrame extends JFrame
{
    private PushCounterPanel panel1; //the frame needs a content panel
    private LeftRightPanel panel2;
    private JPanel mainPanel;
    private TextBoxPanel panel3;
    
    public MainFrame(String caption)
    {
        super(caption);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Closing main window(frame)        
        mainPanel = new JPanel();
        
        /*JFrame is the whole window, the panel is the content window of the jframe*/     
        panel1 = new PushCounterPanel();  
        
        panel2 = new LeftRightPanel();
        
        panel3 = new TextBoxPanel();
        
        mainPanel.add(panel1);
        mainPanel.add(panel2);
        mainPanel.add(panel3);
        
        this.getContentPane().add(mainPanel);//can only add on panel to frame, but you can add multiple panels to the panel that is attached to frame.
        //this.getContentPane().add(panel2);                
        /*Must do frame part(add panel) before panel(push) part*/
        //this.getContentPane().add(panel1);//asking the frame for its content pane, panel into the frame
        
        
        
        this.pack();//Package the gui to be displayed
        this.setVisible(true);//makes appear on screen
    }
}
