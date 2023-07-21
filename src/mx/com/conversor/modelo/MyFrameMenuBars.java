package mx.com.conversor.modelo;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

public class MyFrameMenuBars extends JFrame implements ActionListener {

	JMenuBar mb = new JMenuBar(); // Es la que almacena a los JMenu

	JMenu fileMenu = new JMenu(); // Opciones en JMenuBar
	JMenu editMenu = new JMenu();
	JMenu helpMenu = new JMenu();

	JMenuItem loadItem = new JMenuItem(); // Item que aparece en JMenu
	JMenuItem saveItem = new JMenuItem();
	JMenuItem exitItem = new JMenuItem();

	public MyFrameMenuBars() {

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLayout(new FlowLayout());
		this.setVisible(true);

		/***Nombres de menu principal ***/
		this.fileMenu.setText("File");
		this.editMenu.setText("Edit");
		this.helpMenu.setText("Help");

		/***Nombres de opciones en menu principal -> File ***/
		this.loadItem.setText("Load");
		this.saveItem.setText("Save");
		this.exitItem.setText("Exit");

		this.loadItem.addActionListener(this);
		this.saveItem.addActionListener(this);
		this.exitItem.addActionListener(this);
		
		/*** Atajos para las opciones en el menu principal***/
		this.fileMenu.setMnemonic(KeyEvent.VK_F); //Alt + F para File
		this.editMenu.setMnemonic(KeyEvent.VK_E); //Alt + E para Edit
		this.helpMenu.setMnemonic(KeyEvent.VK_H); //Alt + H para Help
		
		/*** Atajos para las opciones en file***/
		this.loadItem.setMnemonic(KeyEvent.VK_L); //L para Load
		this.saveItem.setMnemonic(KeyEvent.VK_S); //S para Save
		this.exitItem.setMnemonic(KeyEvent.VK_E); //E para Exit

		this.fileMenu.add(this.loadItem);
		this.fileMenu.add(this.saveItem);
		this.fileMenu.add(this.exitItem);

		this.mb.add(this.fileMenu);
		this.mb.add(this.editMenu);
		this.mb.add(this.helpMenu);

		this.setJMenuBar(this.mb);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.loadItem) {
			JOptionPane.showMessageDialog( null,"Loading...");
		}
		if(e.getSource() == this.saveItem) {
			JOptionPane.showMessageDialog( null,"Saving...");
		}
		if(e.getSource() == this.exitItem) {
			JOptionPane.showMessageDialog( null,"Exit...");
			System.exit(0);
		}
	}

}
