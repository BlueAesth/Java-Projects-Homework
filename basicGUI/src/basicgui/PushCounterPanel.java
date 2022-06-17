package basicgui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Poten
 */
public class PushCounterPanel extends JPanel
{
        private JButton push;  //button!
        private JLabel label; //Label!
        private int count = 0;       
                
        public PushCounterPanel()
        {
            push = new JButton("Push Me Please!"); 
            label = new JLabel("Pushes: " + count);
            
            push.addActionListener(new ButtonListener());//creating a instance for buttonlistener class, connects the button, connects the event
            /*side note:Add any content to pane(panel)*/
            this.add(push); //add(part of JPanel) button to panel      
            this.add(label);//add(part of JPanel) label to panel              
        }
        
        private class ButtonListener implements ActionListener//just cause called buttomn doesnt necessarily mean for button
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                count++;
                label.setText("Pushes: " + count);
            }        
    }
}
