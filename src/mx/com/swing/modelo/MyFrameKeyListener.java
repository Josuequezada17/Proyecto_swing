package mx.com.swing.modelo;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrameKeyListener extends JFrame implements KeyListener {

	private JLabel label = new JLabel();
	private ImageIcon cohete = new ImageIcon("cohete.png");
	private ImageIcon fondo = new ImageIcon("6cc2987f-2f4a-4f31-a25d-19d939d2c3dc.png");

	public MyFrameKeyListener() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.getContentPane().setBackground(Color.LIGHT_GRAY);
		this.setLayout(null);

		this.label.setBounds(0, 0, 65, 65);
		//this.label.setBackground(Color.RED);
		this.label.setIcon(cohete);
		this.label.setOpaque(true);

		this.addKeyListener(this);

		this.add(label);
		this.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		switch (e.getKeyChar()) {
		case 'a': //Izquierda - 1 en el eje x
			this.label.setLocation(label.getX()-10, label.getY());
			break;
		case 'd'://Derecha + 1 en el eje x
			this.label.setLocation(label.getX()+10, label.getY());
			break;
		case 's'://Abajo + 1 en el eje y
			this.label.setLocation(label.getX(), label.getY()+10);
			break;
		case 'w'://Arriba - 1 en el eje y
			this.label.setLocation(label.getX(), label.getY()-10);
			break;

		default:
			break;
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case 37: //Izquierda - 1 en el eje x
			this.label.setLocation(label.getX()-10, label.getY());
			break;
		case 39://Derecha + 1 en el eje x
			this.label.setLocation(label.getX()+10, label.getY());
			break;
		case 40://Abajo + 1 en el eje y
			this.label.setLocation(label.getX(), label.getY()+10);
			break;
		case 38://Arriba - 1 en el eje y
			this.label.setLocation(label.getX(), label.getY()-10);
			break;

		default:
			break;
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Tecla soltada keyChar " + e.getKeyChar());
		System.out.println("Tecla soltada keyCode " + e.getKeyCode());

	}

}
