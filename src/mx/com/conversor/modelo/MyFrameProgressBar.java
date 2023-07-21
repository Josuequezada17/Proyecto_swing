package mx.com.conversor.modelo;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class MyFrameProgressBar extends JFrame {

	
	private JProgressBar pBar = new JProgressBar();
	
	public MyFrameProgressBar() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(420,420);
		this.setLayout(null);
		
		this.pBar.setValue(0); //Valor minimo de la barra
		this.pBar.setBounds(0,0,420,50); //Tamaño de la barra ya que setLayout es null
		this.pBar.setStringPainted(true);//Muestra el progreso de la barra
		this.pBar.setFont(new Font("Century Gothic", Font.BOLD,20));//Letra
		this.pBar.setForeground(Color.BLACK);//Color de la barra
		
		this.add(this.pBar);
		this.setVisible(true);
		
		fill();
	}
	
	
	private void fill() {
		int i = 0;
		
		while(i <= 100) {
			this.pBar.setValue(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			i++;
			
		}
		this.pBar.setString("Bye");
	}
}
