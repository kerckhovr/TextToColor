/*
 * Developer : Richard Kerckhove (kerckhovr@sou.edu)
 * Date : 01/21/2013
 * All code (c)2013 Richard Kerckhove All Rights Reserved
 */

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.tree.*;
import javax.swing.event.*;

public class TextToColorGUI extends JFrame implements ActionListener {

    JTextField  textField;
    Container   content;
    JFrame      mainWindow;
    JPanel      rightPanel;
    JPanel      leftPanel;
    JCheckBox   lightOptionBox;
    JCheckBox   darkOptionBox;
    JLabel      lightButtonLabel;
    JLabel      darkButtonLabel;
    
    public TextToColorGUI() {
        super("Text to Color");             
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        mainWindow       = new JFrame("Text to Color");
        rightPanel       = new JPanel();
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.PAGE_AXIS));
        leftPanel        = new JPanel();
        lightOptionBox   = new JCheckBox("Make Colors Lighter");
        darkOptionBox    = new JCheckBox("Make Colors Darker");
       
        
        rightPanel.add(lightOptionBox);

        rightPanel.add(Box.createHorizontalGlue());
        rightPanel.add(darkOptionBox);

        
        
        mainWindow.setSize(400, 400);
        content = mainWindow.getContentPane();
        content.setBackground(Color.white);
        content.setLayout(new BorderLayout()); 
        content.add(new JButton("Button 1"), BorderLayout.NORTH);
        content.add(new JTextField(), BorderLayout.CENTER);
        content.add(new JButton("Colorize"), BorderLayout.SOUTH);
        content.add(rightPanel, BorderLayout.EAST);
        content.add(leftPanel,  BorderLayout.WEST);
        
       
        mainWindow.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){
        
    }
}
