package mx.com.swing.modelo;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow implements ActionListener {

	private JFrame frame = new JFrame();
	private JButton myButton = new JButton("Return");
	private JLabel label = new JLabel("Hola");

	public NewWindow() {

		this.myButton.setBounds(100, 160, 200, 40);
		this.myButton.setFocusable(true);
		this.myButton.addActionListener(this);

		this.label.setBounds(0, 0, 100, 50);
		this.label.setFont(new Font(null, Font.PLAIN, 25));

		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.setSize(500, 500);
		this.frame.setLayout(null);
		this.frame.setVisible(true);
 
		this.frame.add(this.myButton);
		this.frame.add(this.label);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.myButton) {
			this.frame.dispose(); // Para cerrar las ventanas anteriores
			LaunchPage launchPage = new LaunchPage();
		}
	}

}
