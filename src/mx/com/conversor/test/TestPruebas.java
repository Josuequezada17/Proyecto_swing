package mx.com.conversor.test;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import mx.com.conversor.modelo.MyFrame;

public class TestPruebas {

	public static void main(String[] args) {

//		String i = JOptionPane.showInputDialog("hollaaaa");
//		double entrada = Double.parseDouble(i);
//		entrada *= 16.9;
//		System.out.println(entrada);
//		JOptionPane.showMessageDialog(null, "Hola mundo");

//		//JFrame = Una ventana GUI para añadir componentes
//		JFrame frame = new JFrame(); //Crea un frame
//		frame.setTitle("Conversor"); //Titulo del frame
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cierra la aplicacion
//		frame.setResizable(false); //Para habilitar o desabilitar modif el tamaño
//		frame.setSize(1080, 720); // dimension en x, dimension en y del frame 
//		frame.setVisible(true); //Hace visible el fframe
//		
//		ImageIcon logoAlura = new ImageIcon("Alura_logo.jpeg"); //Crea un icono de imagen
//		frame.setIconImage(logoAlura.getImage()); //Cambiara a la imagen que elegimos
//		frame.getContentPane().setBackground(Color.BLUE);//Cambia el color del background

//		ImageIcon fondo = new ImageIcon("portada-javaswing.png");
//		
//		JLabel label = new JLabel(); //Crea un label
//		label.setText("Hola elige una opcion"); //Pone texto en label
//		label.setIcon(fondo);
//		label.setHorizontalTextPosition(JLabel.CENTER);

		new MyFrame();
		//ventana.add(label);
		

	}

}
