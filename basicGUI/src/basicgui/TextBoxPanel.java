package basicgui;

import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javafx.scene.paint.Color.color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 *
 * @author Poten
 */
public class TextBoxPanel extends JPanel
{
    private JLabel lblFirst, lblLast, lblFullName;
    private JTextField txtFirst, txtLast;
    private JButton cmdGo;
    
    public TextBoxPanel()
    {
        lblFirst = new JLabel("First");
        lblLast = new JLabel("Last");
        lblFullName = new JLabel("");
        
        txtFirst = new JTextField(10);
        txtLast = new JTextField(10);
        
        txtFirst.setText("John");
        txtLast.setText("Smith");
        
        
        cmdGo = new JButton("Go");
        cmdGo.addActionListener(new ButtonListener());
        
        this.add(lblFirst);
        this.add(txtFirst);
        this.add(lblLast);
        this.add(txtLast);
        this.add(cmdGo);
        this.add(lblFullName);
        
        this.setBackground(Color.RED);
        this.setPreferredSize(new Dimension(300,120));
    }
    
    private class ButtonListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) 
        {
            lblFullName.setText(txtFirst.getText() + " " + txtLast.getText());
        }
        
    }
    
}
