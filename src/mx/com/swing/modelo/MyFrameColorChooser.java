package mx.com.swing.modelo;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrameColorChooser extends JFrame implements ActionListener{

	private JButton boton = new JButton("Selecciona un color");
	private JLabel label = new JLabel();
	
	public MyFrameColorChooser() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		this.label.setBackground(Color.white);
		this.label.setText("Hola soy el texto");
		this.label.setFont(new Font("Century Gothic", Font.BOLD, 120));
		this.label.setOpaque(true);
		
		this.boton.addActionListener(this);
		
		this.add(this.boton);
		this.add(this.label);
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.boton) {
			JColorChooser colorChooser = new JColorChooser();
			
			Color color = JColorChooser.showDialog(null, "Escoge un color", Color.BLACK);
			//this.label.setBackground(color); // Fondo del label
			this.label.setForeground(color); //Texto del label
		}
	}

	
	
}
