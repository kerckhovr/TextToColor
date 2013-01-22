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

    private Container   content;
    private JMenuBar    menuBar;
    private JMenu       fileMenu, editMenu;
    private JMenuItem   openItem, saveItem, closeItem;
    private JMenuItem   copyItem, cutItem, pasteItem;
    private JTextField  textField;    
    private JFrame      mainWindow;
    private JPanel      rightPanel, leftPanel;
    private JCheckBox   lightOptionBox, darkOptionBox;

    
    public TextToColorGUI() {
        super("Text to Color");             
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menuBar          = new JMenuBar();
        initializeFileMenu();
        initializeEditMenu();
        mainWindow       = new JFrame("Text to Color");
        rightPanel       = new JPanel();
        leftPanel        = new JPanel();
        lightOptionBox   = new JCheckBox("Make Colors Lighter");
        darkOptionBox    = new JCheckBox("Make Colors Darker");
                
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.PAGE_AXIS));
        mainWindow.setJMenuBar(menuBar);
        
        rightPanel.add(lightOptionBox);
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
    
    private void initializeFileMenu() {
        fileMenu         = new JMenu("File");
        openItem         = new JMenuItem("Open");
        saveItem         = new JMenuItem("Save");
        closeItem        = new JMenuItem("Close");
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator();
        fileMenu.add(closeItem);
        menuBar.add(fileMenu);
    }
    
    private void initializeEditMenu() {
        editMenu         = new JMenu("Edit");
        copyItem         = new JMenuItem("Copy");
        cutItem          = new JMenuItem("Cut");
        pasteItem        = new JMenuItem("Paste");
        editMenu.add(copyItem);
        editMenu.add(cutItem);
        editMenu.add(pasteItem);
        menuBar.add(editMenu);
    }
    
    public void actionPerformed(ActionEvent e){
        
    }
}
