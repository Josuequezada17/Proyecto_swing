package mx.com.swing.modelo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage implements ActionListener{

	private JFrame frame = new JFrame();
	private JButton myButton = new JButton("New Page");
	
	public LaunchPage() { 

		this.myButton.setBounds(100,160, 200, 40);
		this.myButton.setFocusable(true);
		this.myButton.addActionListener(this);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
		frame.add(this.myButton);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.myButton) {
			this.frame.dispose();
			new NewWindow();
		}
	}
	
}
