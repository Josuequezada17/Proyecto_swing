package mx.com.swing.modelo;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.Border;


public class MyFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MyFrame() {  
		
		ImageIcon fondo = new ImageIcon("portada-javaswing.png");
		Border border = BorderFactory.createLineBorder(Color.ORANGE, 1);//Color del borde
		
		JLabel label = new JLabel(); //Crea un label
		label.setText("Hola elige una opcion"); //Pone texto en label
		label.setIcon(fondo);//Imagen de fondoo
		label.setHorizontalTextPosition(JLabel.CENTER);//Pone el texto en, izq, der, centro
		label.setVerticalTextPosition(JLabel.CENTER);//Pone el texto en top, centro, bottom
		label.setForeground(Color.BLACK); //Color de la letra
		label.setFont(new Font("Century Gothic", Font.BOLD,40));
		//label.setIconTextGap(300); Para alejar o acercar el texto de la imagen
		//label.setBackground(Color.black); //Color del fondo
		//label.setOpaque(true); //Para reyenar todo del color que demos al background
		label.setBorder(border); //Para aplicar el borde
		label.setVerticalAlignment(JLabel.CENTER); //Para poner el texto y imagen al centro
		label.setHorizontalAlignment(JLabel.CENTER); //Puede servir para las ventanas?
		
		this.setTitle("Conversor"); // Titulo del frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cierra la aplicacion
		this.setResizable(true); // Para habilitar o desabilitar modif el tamaño
		this.setSize(1280, 720); // dimension en x, dimension en y del frame
		this.setVisible(true); // Hace visible el fframe
		ImageIcon logoAlura = new ImageIcon("alura_logo.png"); // Crea un icono de imagen
		this.setIconImage(logoAlura.getImage()); // Cambiara a la imagen que elegimos
		this.getContentPane().setBackground(Color.BLUE);// Cambia el color del background
		//this.pack();
		
		this.add(label);//Agregar la imagen de fondo a el frame
		
		Object[] possibilities = { "Divisas", "Temperatura"};
		String s = (String) JOptionPane.showInputDialog(null, "Select an option:\n", // Texto arriba de las opciones
				"CONVERSOR", // Nombre de paguina
				JOptionPane.WARNING_MESSAGE, // Icono de la ventana
				null, possibilities, // idk
				"Divisas"); // Para decir en que opcion este por default

		// If a string was returned, say so.
		if ((s != null) && (s.length() > 0)) {
			setLabel("Conversor de: " + s + "!");
			return;
		} else {
			setLabel("Come on, finish the sentence!");
		}		
				
	}
	
	public void setLabel(String s) {
		String n = JOptionPane.showInputDialog(s);
		Double cantidad  = Double.parseDouble(n);
		cantidad *= 16;
		JOptionPane.showInputDialog(cantidad, " $");
	}
	
	public Component getComponent(String n) {
		return getComponent(n);
	}
	
}
