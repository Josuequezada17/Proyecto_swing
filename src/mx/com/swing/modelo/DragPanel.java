package mx.com.swing.modelo;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class DragPanel extends JPanel {

	private ImageIcon smile = new ImageIcon("rojo.png");
	private final int width = smile.getIconWidth();
	private final int height = smile.getIconHeight();
	private Point imageCorner;
	private Point prevPoint;
	
	
	
	public DragPanel() {
		imageCorner = new Point(0,0);
		ClikListener clickListener = new ClikListener();
		DragListenr dragListener = new DragListenr();
		this.addMouseListener(clickListener);
		this.addMouseMotionListener(dragListener);
		
		
	}

	public void paintComponent(Graphics g) { 
		super.paintComponent(g); //Si dejamos paintComponents hace un efecto difuminado
		this.smile.paintIcon(this, g, (int)imageCorner.getX(),(int) imageCorner.getY()); //JPanel, Foto, PosicionX, PosicionY
	}
	
	private class ClikListener extends MouseAdapter{
		
		public void mousePressed(MouseEvent e) {
			prevPoint = e.getPoint();
		}
		
	}
	
	private class DragListenr extends MouseMotionAdapter{
		
		public void mouseDragged(MouseEvent e) {
			Point currentPoint  = e.getPoint();
			imageCorner.translate(
					
					(int)(currentPoint.getX() - prevPoint.getX()),
					(int)(currentPoint.getY() - prevPoint.getY())					
					
					);
			prevPoint = currentPoint;
			repaint();
			
		}
		
	}
	
}
