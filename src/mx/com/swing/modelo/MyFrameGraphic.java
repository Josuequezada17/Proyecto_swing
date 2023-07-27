package mx.com.swing.modelo;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

public class MyFrameGraphic extends JFrame{

	MyPanel panel = new MyPanel();
	
	public MyFrameGraphic() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.add(panel);
		this.pack();
		this.setLocationRelativeTo(null); //Para que aparezca en el centro de la pantalla
		this.setVisible(true);
	}
	
	
	
}
