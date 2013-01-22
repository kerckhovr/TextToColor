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

public class TextToColorGUI extends JFrame implements ItemListener, 
                                                      ActionListener {

	private Container   content;
	private JMenuBar    menuBar;
	private JMenu       fileMenu, editMenu;
	private JMenuItem   openItem, saveItem, closeItem;
	private JMenuItem   copyItem, cutItem, pasteItem;
	private JTextArea   textArea;    
	private JFrame      mainWindow;
	private JPanel      rightPanel, leftPanel;
	private JCheckBox   lightOptionBox, darkOptionBox;
	private JLabel      optionStatus;
	private JLabel      optionsLabel;

	public TextToColorGUI() {
		
		super("Text to Color");             
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWindow       = new JFrame("Text to Color");
		menuBar          = new JMenuBar();
		mainWindow.setJMenuBar(menuBar);
		initFileMenu();
		initEditMenu();
		initTextArea();
		initOptionsPanel();
		
		optionStatus     = new JLabel(" ");
		optionStatus.setOpaque(true);
		leftPanel        = new JPanel();
        
		mainWindow.setSize(700, 600);
		content = mainWindow.getContentPane();
		content.setBackground(Color.white);
		content.setLayout(new BorderLayout()); 
		content.add(optionStatus, BorderLayout.NORTH);
		content.add(textArea, BorderLayout.CENTER);
		content.add(new JButton("Colorize"), BorderLayout.SOUTH);
		content.add(rightPanel, BorderLayout.EAST);
		content.add(leftPanel,  BorderLayout.WEST);

		mainWindow.setVisible(true);
	}
    
	private void initOptionsPanel() {
		rightPanel       = new JPanel();
		optionsLabel     = new JLabel("OPTIONS");
		lightOptionBox   = new JCheckBox("Make Colors Lighter");
		darkOptionBox    = new JCheckBox("Make Colors Darker");
		rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.PAGE_AXIS));
		
		rightPanel.add(optionsLabel);		
		rightPanel.add(lightOptionBox);
		rightPanel.add(darkOptionBox);
		lightOptionBox.addItemListener(this);
		darkOptionBox.addItemListener(this);
		lightOptionBox.addActionListener(this);
		darkOptionBox.addActionListener(this);
		
	}
	
	private void initTextArea() {

		textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);

	}
    
	private void initFileMenu() {
        
		fileMenu    = new JMenu("File");
		openItem    = new JMenuItem("Open");
		saveItem    = new JMenuItem("Save");
		closeItem   = new JMenuItem("Close");
		fileMenu.add(openItem);
		fileMenu.add(saveItem);
		fileMenu.addSeparator();
		fileMenu.add(closeItem);
		closeItem.addActionListener(this);
		menuBar.add(fileMenu);

	}
    
	private void initEditMenu() {

		editMenu    = new JMenu("Edit");
		copyItem    = new JMenuItem("Copy");
		cutItem     = new JMenuItem("Cut");
		pasteItem   = new JMenuItem("Paste");
		editMenu.add(copyItem);
		editMenu.add(cutItem);
		editMenu.add(pasteItem);
		menuBar.add(editMenu);
        
	}
	
	public void itemStateChanged(ItemEvent e) {
		if (darkOptionBox.isSelected()){
			optionStatus.setText("Dark Colors");
		}
		if(lightOptionBox.isSelected()){
			optionStatus.setText("Light Colors");
		}
		
	}
    
	public void actionPerformed(ActionEvent e){
        if(e.getSource() == closeItem){
        	dispose();
        	System.exit(0);
        } else if (e.getSource() == lightOptionBox) {
        	darkOptionBox.setSelected(false);
        } else  if (e.getSource() == darkOptionBox) {
        	lightOptionBox.setSelected(false);
        }
	}
}
