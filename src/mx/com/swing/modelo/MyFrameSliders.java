package mx.com.swing.modelo;

import java.awt.*;

import javax.swing.*;
import javax.swing.event.*;

public class MyFrameSliders extends JFrame implements ChangeListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel panel = new JPanel();
	private JLabel label = new JLabel();
	private JLabel fLabel = new JLabel();
	private JLabel kLabel = new JLabel();
	private JSlider slider = new JSlider(0, 100, 50);//Minimo, Maximo, Inicio 
	private ImageIcon icon = new ImageIcon("alura_logo.png");

	public MyFrameSliders() {

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setTitle("Slider");
		this.setIconImage(this.icon.getImage());
		
		this.slider.setFont(new Font("Century Gothic", Font.BOLD,15));
		this.label.setFont(new Font("Century Gothic", Font.BOLD, 25));
		this.fLabel.setFont(new Font("Century Gothic", Font.BOLD, 25));
		this.kLabel.setFont(new Font("Century Gothic", Font.BOLD, 25));
		
		this.slider.setPreferredSize(new Dimension(400, 200));
		this.slider.setPaintTicks(true);//Para habilitar los intervalso de valores
		this.slider.setMinorTickSpacing(10);//Espaciamiento entre cada valor pequeños
		this.slider.setPaintTrack(true);//Habilitar espaciamientos grandes
		this.slider.setMajorTickSpacing(25); //Espaciamientos mas grandes
		this.slider.setPaintLabels(true);//Agrega numeros
		this.slider.setOrientation(SwingConstants.VERTICAL); //Orientacion del slider
		this.slider.addChangeListener(this);
		
		this.panel.setBackground(Color.GREEN);
		
		this.label.setText("°C = " + this.slider.getValue());
		this.fLabel.setText(" °F = " + ((this.slider.getValue() * 9/5) + 32));
		this.kLabel.setText(" °K = " + (this.slider.getValue() + 273));
		
		
		this.panel.add(slider);
		this.add(panel);
		this.add(label);
		this.add(fLabel);
		this.add(kLabel);

		this.pack();
		this.setSize(520, 520);
		this.setVisible(true);
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		this.label.setText("°C = " + this.slider.getValue());
		this.fLabel.setText("°F = " + ((this.slider.getValue() * 9/5) + 32));
		this.kLabel.setText("°K = " + (this.slider.getValue() + 273 ));
	}

}
