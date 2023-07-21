package mx.com.conversor.test;

import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TestSwing {
	
	public static void main(String[] args){

	    // componente JFrame

	   JFrame miJFrame = new JFrame("Conversor");
	    miJFrame.setSize(1080, 720);;

	    // componente JPanel`

	    JPanel miJPanel = new JPanel();

	    miJPanel.setSize(10, 30);

	    // usamos este diseño para centrar los componentes de JPanel`

	    miJPanel.setLayout(new GridBagLayout());
	    //miJPanel.setLayout(new GridLayout());

	    // componente JTextField`

	    JLabel miJLabel = new JLabel();

	    miJLabel.setText("Dime tu opinión acerca de Java Swing:  ");

	    // componente JTextArea

	    JTextArea miJTextArea = new JTextArea(5,20);

	    // conecta los componentes JLabel y JTextField en JPanel`

	    miJPanel.add(miJLabel);

	    miJPanel.add(miJTextArea);

	    // conectar Jpanel a JFrame`

	    miJFrame.add(miJPanel);

	    // hacer visible JFrame

	    miJFrame.setVisible(true);

	  }
	
}
