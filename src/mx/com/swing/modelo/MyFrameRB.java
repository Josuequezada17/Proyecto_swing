package mx.com.swing.modelo;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class MyFrameRB extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JRadioButton radioButton0 = new JRadioButton();
	private JRadioButton radioButton1 = new JRadioButton();
	private JRadioButton radioButton2 = new JRadioButton();
	private JRadioButton radioButton3 = new JRadioButton();
	//private ImageIcon pizzaIcon = new ImageIcon("pizza.png"); //CheckBox con imagen

	private ButtonGroup group = new ButtonGroup(); // Sirve para solo seleccionar un item

	public MyFrameRB() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());

		this.radioButton0.setText("Pizza");
		this.radioButton1.setText("Hamburguesa");
		this.radioButton2.setText("Tacos");
		this.radioButton3.setText("Hot Dog");

		this.radioButton0.addActionListener(this);
		this.radioButton1.addActionListener(this);
		this.radioButton2.addActionListener(this);
		this.radioButton3.addActionListener(this);

		this.radioButton0.setFont(new Font("Century Gothic", Font.BOLD, 30));
		this.radioButton1.setFont(new Font("Century Gothic", Font.BOLD, 30));
		this.radioButton2.setFont(new Font("Century Gothic", Font.BOLD, 30));
		this.radioButton3.setFont(new Font("Century Gothic", Font.BOLD, 30));
		
		//this.radioButton0.setIcon(pizzaIcon); //Para agregar una imagen al icono

		// Se debe de agregar a este boton para que solo se seleccione una opcion
		this.group.add(radioButton0);
		this.group.add(radioButton1);
		this.group.add(radioButton2);
		this.group.add(radioButton3);

		this.add(this.radioButton0);
		this.add(this.radioButton1);
		this.add(this.radioButton2);
		this.add(this.radioButton3);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//this.dispose();
		if (e.getSource() == this.radioButton0) {
			JOptionPane.showMessageDialog(null, "Mama mia", "Pizza", JOptionPane.WARNING_MESSAGE);
		
		} else if (e.getSource() == this.radioButton1) {
			JOptionPane.showMessageDialog(null, "Western Baccon", "Hamburguesa", JOptionPane.WARNING_MESSAGE);
		
		}else if(e.getSource() == this.radioButton2) {
			JOptionPane.showMessageDialog(null, "Viva Mexico", "Taco 4Life", JOptionPane.WARNING_MESSAGE);

		}else if(e.getSource() == this.radioButton3) {
			JOptionPane.showMessageDialog(null, "Perro caliente", "Hot Dog", JOptionPane.WARNING_MESSAGE);

		}

	}

}
