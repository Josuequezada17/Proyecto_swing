package mx.com.swing.modelo;

import java.awt.*;
import javax.swing.JFrame;

public class MyFrame2DAnimation extends JFrame {

	MyPanel2DAnimation panel2D;
	
	public MyFrame2DAnimation() {
	
		panel2D = new MyPanel2DAnimation();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(panel2D);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
	}
	
}
