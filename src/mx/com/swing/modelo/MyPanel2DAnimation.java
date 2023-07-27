package mx.com.swing.modelo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MyPanel2DAnimation extends JPanel implements ActionListener {

	private final int panelWidth = 500;
	private final int panelHeight = 500;
	private Image enemy;	
	private Image fondo;
	private Timer timer;
	private int xVelocidad = 2;
	private int yVelocidad = 1;
	private int x = 0;
	private int y = 0;
	
	public MyPanel2DAnimation() {
		this.setPreferredSize(new Dimension(panelWidth, panelHeight));
		this.setBackground(Color.BLACK);
		enemy = new ImageIcon("cohete.png").getImage();
		fondo = new ImageIcon("6cc2987f-2f4a-4f31-a25d-19d939d2c3dc.png").getImage();
		timer = new Timer(10, this); //Cada 1000 s
		timer.start();
	}

	public void paint(Graphics g) {
		
		super.paint(g);
		
		Graphics2D g2D = (Graphics2D)g;
		
		g2D.drawImage(fondo, 0, 0, null);
		g2D.drawImage(enemy, x, y, null);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(x >= (panelWidth-enemy.getWidth(null)) || x < 0) {
			xVelocidad *= -1;
		}
		
		x += xVelocidad;
		
		if(y >= (panelHeight-enemy.getHeight(null)) || y < 0) {
			yVelocidad *= -1;
		}
		
		y += yVelocidad;
		
		repaint();
	}
	
}
