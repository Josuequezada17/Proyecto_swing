package mx.com.conversor.test;

import java.awt.Component;

import javax.swing.JOptionPane;


public class TestSwingMenu {

	public static void main(String[] args) {

//		Component frame = null;
//		// JOptionPane.showMessageDialog(frame, "Conversor de divisas");
//		// JOptionPane.showInternalMessageDialog(frame, "hoosfopsdgñlk");
//		JOptionPane.showMessageDialog(frame, "Eggs are not supposed to be green.", "Conversor",
//				JOptionPane.INFORMATION_MESSAGE);
//
//		// Custom button text
//		Object[] options = { "DIVISAS", "TEMPERATURAS", "MASAS" };
//		int n = JOptionPane.showOptionDialog(frame, "Elija una opcion", "CONVERSOR", JOptionPane.YES_NO_CANCEL_OPTION,
//				JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
//
//		/*
//		final JOptionPane optionPane = new JOptionPane("The only way to close this dialog is by\n"
//				+ "pressing one of the following buttons.\n" + "Do you understand?", JOptionPane.QUESTION_MESSAGE,
//				JOptionPane.YES_NO_OPTION);
//*/
//		// default icon, custom title
//		int n2 = JOptionPane.showConfirmDialog(frame, "Would you like green eggs and ham?", "An Inane Question",
//				JOptionPane.YES_NO_OPTION);
//
//		Object[] options1 = { "Yes, please", "No way!" };
//		int n1 = JOptionPane.showOptionDialog(frame, "Would you like green eggs and ham?", "A Silly Question",
//				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, // do not use a custom Icon
//				options1, // the titles of buttons
//				options1[0]); // default button title

		
		//Este es el que debo de utilizar :)
		Object[] possibilities = { "Divisas", "Temperatura"};
		String s = (String) JOptionPane.showInputDialog(null, "Select an option:\n", // Texto arriba de las opciones
				"CONVERSOR", // Nombre de paguina
				JOptionPane.WARNING_MESSAGE, // Icono de la ventana
				null, possibilities, // idk
				"Divisas"); // Para decir en que opcion este por default

		// If a string was returned, say so.
		if ((s != null) && (s.length() > 0)) {
			setLabel("Conversor de: " + s + "!");
			return;
		} else {
			setLabel("Come on, finish the sentence!");
		}


	}

	private static void setLabel(String string) {
		System.out.println(string);
	}

}
