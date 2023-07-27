package mx.com.swing.test;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class TestJLayeredPane {

	public static void main(String[] args) {
		
		JLabel panel1 = new JLabel();
		panel1.setOpaque(true);
		panel1.setBackground(Color.RED);
		panel1.setBounds(50, 50, 200, 200);
		
		JLabel panel2 = new JLabel();
		panel2.setOpaque(true);
		panel2.setBackground(Color.BLUE);
		panel2.setBounds(100, 100, 200, 200);
		
		JLabel panel3 = new JLabel();
		panel3.setOpaque(true);
		panel3.setBackground(Color.YELLOW);
		panel3.setBounds(150, 150, 200, 200);
		
		
		JLayeredPane layerPane = new JLayeredPane();
		layerPane.setBounds(0, 0, 500, 500);
		
		layerPane.add(panel1, Integer.valueOf(0));
		layerPane.add(panel2, Integer.valueOf(1));
		layerPane.add(panel3, Integer.valueOf(0));
		
		JFrame frame = new JFrame();

		frame.add(layerPane); //Aqui agregamos
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500); 
		frame.setLayout(null);
		frame.setVisible(true);	
		
	}
	
}
