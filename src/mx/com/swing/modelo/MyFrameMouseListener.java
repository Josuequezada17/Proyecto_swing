package mx.com.swing.modelo;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrameMouseListener extends JFrame implements MouseListener{

	private ImageIcon sonrisa = new ImageIcon("sonrisa.png");
	private ImageIcon rojo = new ImageIcon("rojo.png");
	private ImageIcon herido = new ImageIcon("herido.png");
	private ImageIcon fin = new ImageIcon("fin.png");
	
	private JLabel label = new JLabel();
	
	public MyFrameMouseListener() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 600);
		this.setLayout(new FlowLayout());
		
		this.label.setIcon(sonrisa);
		
		this.label.setOpaque(true);
		
		this.label.addMouseListener(this);
		
		
		this.add(label);
		this.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		this.label.setIcon(fin);
		
		this.label.setBackground(Color.MAGENTA);
		this.getContentPane().setBackground(Color.MAGENTA);
		this.label.setText("Presionado");
		

	}

	@Override
	public void mouseReleased(MouseEvent e) {

		this.label.setIcon(herido);

		this.label.setBackground(Color.YELLOW);
		this.getContentPane().setBackground(Color.YELLOW);
		this.label.setText("Soltaste");

	}

	@Override
	public void mouseEntered(MouseEvent e) {

		this.label.setIcon(rojo);
		
		this.label.setBackground(Color.BLACK);
		this.getContentPane().setBackground(Color.BLACK);
		this.label.setText("Adentro");

	}

	@Override
	public void mouseExited(MouseEvent e) {
		
		this.label.setIcon(sonrisa);
		
		this.label.setBackground(Color.BLUE);
		this.getContentPane().setBackground(Color.BLUE);
		this.label.setText("Afuera");

	}
	
}
