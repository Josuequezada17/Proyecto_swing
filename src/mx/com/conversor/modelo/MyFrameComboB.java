package mx.com.conversor.modelo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MyFrameComboB extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String[] divisas = {"Dolar", "Yen", "Euro"}; 
	protected JComboBox<String> comboBox; 
	private ImageIcon icon = new ImageIcon("alura_logo.png");
	
	public MyFrameComboB() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setTitle("Conversor");
		this.setIconImage(this.icon.getImage());

		this.comboBox = new JComboBox<String>(this.divisas);
		this.comboBox.addActionListener(this);
		//this.comboBox.setEditable(true); Nos deja por asi decirlo buscar o editar el nombre
		//System.out.println(this.comboBox.getItemCount()); //Numero de items
		//this.comboBox.addItem("Libra"); //Agrega un objeto, en este caso tipo String
		//this.comboBox.insertItemAt("Won", 2); //Añade un objeto en la posicion seleccionada
		//this.comboBox.setSelectedIndex(0); //Establece la posicion inicial, no muy util pq se selecciona solo
		//this.comboBox.removeItem("Yen"); //Elimina por nombre
		//this.comboBox.removeItemAt(1); //Elimina por posicion
		//this.comboBox.removeAll();//Delete all
		
		this.add(this.comboBox);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.comboBox) {
			JOptionPane.showMessageDialog(null, "Devuelve la cadena: " + this.comboBox.getSelectedItem());
			JOptionPane.showMessageDialog(null, "Devuelve la posicion: " + this.comboBox.getSelectedIndex());

		}
	}

}
