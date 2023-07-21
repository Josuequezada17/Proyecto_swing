package mx.com.conversor.modelo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MyFrameTF extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JTextField textField = new JTextField();
	private JButton button = new JButton();
	private JLabel label = new JLabel();
	private ImageIcon icon = new ImageIcon("alura_logo.png");
	
	public MyFrameTF() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout(30,10,50));
		this.setTitle("Conversor");
		this.setIconImage(this.icon.getImage());
		
		this.textField.setPreferredSize(new Dimension(250,40));
		this.textField.setFont(new Font("Century Gothic", Font.BOLD,20));
		this.textField.setForeground(Color.BLUE);
		this.textField.setBackground(Color.WHITE);
		this.textField.setCaretColor(Color.BLACK);
		//this.textField.setText("0.0");
		
		this.button.setText("Submit");
		this.button.addActionListener(this);	
		
		this.label.setText("Ingresa la cantidadd");
	
		this.add(this.label);
		this.add(this.textField);
		this.add(this.button);
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.button) {
			//textField.getText();
			this.textField.setEditable(false);
			this.button.setEnabled(false);
			this.dispose();
			JOptionPane.showMessageDialog(null, 
					                      "Resultado: " + textField.getText(),
					                      "Conversor",
					                      JOptionPane.QUESTION_MESSAGE);
		}
	}

	
	
}
