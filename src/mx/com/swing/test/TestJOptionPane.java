package mx.com.swing.test;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TestJOptionPane {
 
	public static void main(String[] args) {
 
		JOptionPane.showMessageDialog(null, "Soy plain message", "Soy el titulo", JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null, "Soy information message", "Soy el titulo",
				JOptionPane.INFORMATION_MESSAGE); 
		JOptionPane.showMessageDialog(null, "Soy question message", "Soy el titulo", JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Soy warning message", "Soy el titulo", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "Soy error messge", "Soy el titulo", JOptionPane.ERROR_MESSAGE);

		int respuesta = JOptionPane.showConfirmDialog(null, "Elgie una opcion", "Confirm dialog",
				JOptionPane.YES_NO_CANCEL_OPTION);

		String name = JOptionPane.showInputDialog("Cual es tu nombre?");

		ImageIcon icon = new ImageIcon("alura_logo.png");
		String[] respuesta1 = {"Dolar", "Peso", "Euro", "Yen"};
		
		JOptionPane.showOptionDialog(null, 
									"Soy el mensaje", 
									"Soy titulo", 
									JOptionPane.YES_NO_CANCEL_OPTION,
									JOptionPane.ERROR_MESSAGE, 
									icon, 
									respuesta1,
									0);
	}

}
