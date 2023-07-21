package mx.com.conversor.modelo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrameButton extends JFrame implements ActionListener{


	/**
	 * 
	 */
	private static final long serialVersionUID = -5060629286546777257L;
	 
	private JButton button = new JButton();
	private JLabel label = new JLabel();

	public MyFrameButton() {
				
		ImageIcon image = new ImageIcon("Alura_logo.jpeg");
		
		this.button.setBounds(200, 10, 250, 215);
		this.button.setText("Aceptar");
		this.button.addActionListener(this);
		//this.button.addActionListener(e -> System.out.println("hi")); otra opcion
		this.button.setIcon(image);
		this.button.setHorizontalTextPosition(JButton.CENTER);
		this.button.setVerticalTextPosition(JButton.BOTTOM);
		this.button.setFont(new Font("Century Gothic", Font.BOLD, 15));
		this.button.setIconTextGap(-10);
		this.button.setForeground(Color.BLUE);
		this.button.setBackground(Color.darkGray);
		this.button.setBorder(BorderFactory.createEtchedBorder());
		
		this.label.setBounds(450, 10, 120, 80);
		this.label.setText("Hola");
		this.label.setVisible(false);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		this.add(button);
		this.add(label);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.button) {
			System.out.println("hi");
			this.label.setVisible(true);
		}
	}
	
}
