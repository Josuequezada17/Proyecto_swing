package mx.com.conversor.modelo;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class MyFrameCheckB extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ImageIcon icon = new ImageIcon("alura_logo.png");
	private JCheckBox checkBox = new JCheckBox();
	private JButton button = new JButton();
	private ImageIcon check = new ImageIcon("check.jpeg");
	private ImageIcon xCheck = new ImageIcon("x.png");

	public MyFrameCheckB() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout(30, 10, 50));
		this.setTitle("Conversor");
		this.setIconImage(this.icon.getImage());

		this.checkBox.setText("No soy un bot");
		this.checkBox.setFocusable(false);
		this.checkBox.setFont(new Font("Century Gothic", Font.BOLD, 25));
		this.checkBox.setIcon(this.xCheck);
		this.checkBox.setSelectedIcon(this.check);

		this.button.setText("SEND");
		this.button.addActionListener(this);

		this.add(this.checkBox);
		this.add(this.button);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.button) {
			this.dispose();
			boolean opc = true;
			if (checkBox.isSelected() == opc) {
				JOptionPane.showMessageDialog(null, "Click: " + checkBox.isSelected(), "Check Box",
						JOptionPane.INFORMATION_MESSAGE);

			} else {
				JOptionPane.showMessageDialog(null, "Click: " + checkBox.isSelected(), "Check Box",
						JOptionPane.WARNING_MESSAGE);
			}
		}
	}

}
