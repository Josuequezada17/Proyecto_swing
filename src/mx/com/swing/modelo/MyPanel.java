package mx.com.swing.modelo;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MyPanel extends JPanel {

	private Image image;
	
	public MyPanel() {
		this.setPreferredSize(new Dimension(500,500));
	}

	public void paint(Graphics g) {

		Graphics2D g2D = (Graphics2D) g;
		image = new ImageIcon("6cc2987f-2f4a-4f31-a25d-19d939d2c3dc.png").getImage();

		g2D.setStroke(new BasicStroke(5));//Pixeles de la linea
		g2D.setPaint(Color.RED);
		//g2D.drawLine(0, 0, 500, 500)
		
		//g2D.drawRect(0, 0, 100, 200);
		//g2D.setPaint(Color.MAGENTA);
		//g2D.fillRect(105, 0, 100, 200);
		
		//g2D.drawOval(0, 0, 100, 100);
		//g2D.fillOval(0, 0, 100, 100);
	
		//g2D.drawArc(0, 0, 100, 100, 0, 180);
		//g2D.fillArc(0, 0, 100, 100, 0, 180);
		//g2D.setPaint(Color.WHITE);
		//g2D.fillArc(0, 0, 100, 100, 180, 180);
		
		int[] xPoints = {150,250,350};
		int[] yPoints = {300,150,300};
		
		//g2D.drawPolygon(xPoints, yPoints, 3);
		g2D.fillPolygon(xPoints, yPoints, 3);
		
		g2D.setFont(new Font("Century Gothic", Font.BOLD,30));
		
		g2D.drawString("U A R WINNER", 150, 150);
		
		g2D.drawImage( image, 0, 0, null);
		
		
	}
	

}
