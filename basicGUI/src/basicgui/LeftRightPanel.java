package basicgui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Poten
 */
public class LeftRightPanel extends JPanel
{
    private JButton btnLeft, btnRight;
    private JLabel lblOutput;
    private JPanel panButtonPanel;
    
    public LeftRightPanel()
    {
        btnLeft = new JButton ("Left");
        btnRight = new JButton ("Right");
        lblOutput = new JLabel ("Push a button!");
        panButtonPanel = new JPanel();       
        
        panButtonPanel.setBackground(Color.CYAN); //Stick with the capital colors
        panButtonPanel.setPreferredSize(new Dimension(200,40));
        
        ButtonListener listener = new ButtonListener();
        btnLeft.addActionListener(listener);
        btnRight.addActionListener(listener);
        
        panButtonPanel.add(btnLeft);
        panButtonPanel.add(btnRight);
        
        this.setBackground(Color.GREEN); //Stick with the capital colors
        this.setPreferredSize(new Dimension(200,80));
        this.add(lblOutput);
        this.add(panButtonPanel);//this is referring to the main panel, in which we have added the button panel to.
        
        
        
    }
    
    private class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)//what cuased the event, holds info on the event
        {
            if(event.getSource() == btnLeft)//get source, what thing was touched, or asked for the event
                lblOutput.setText("Left!");
            else
                lblOutput.setText("Right!");
        }
    }
    
}
