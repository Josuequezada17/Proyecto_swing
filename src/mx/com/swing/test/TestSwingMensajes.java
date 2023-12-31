package mx.com.swing.test;

import java.awt.Frame;
import java.awt.event.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.*;

public class TestSwingMensajes {

	public static void main(String[] args) {
		final JOptionPane optionPane = new JOptionPane("The only way to close this dialog is by\n"
				+ "pressing one of the following buttons.\n" + "Do you understand?", JOptionPane.QUESTION_MESSAGE,
				JOptionPane.YES_NO_OPTION);

		Frame frame = null;
		final JDialog dialog = new JDialog(frame, "Click a button", true);
		dialog.setContentPane(optionPane);
		dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		dialog.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				setLabel("Thwarted user attempt to close window.");
			}
		});
		optionPane.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent e) {
				String prop = e.getPropertyName();

				if (dialog.isVisible() && (e.getSource() == optionPane) && (prop.equals(JOptionPane.VALUE_PROPERTY))) {
					// If you were going to check something
					// before closing the window, you'd do
					// it here.
					dialog.setVisible(false);
				}
			}
		});
		dialog.pack();
		dialog.setVisible(true);

		int value = ((Integer) optionPane.getValue()).intValue();
		if (value == JOptionPane.YES_OPTION) {
			setLabel("Good.");
		} else if (value == JOptionPane.NO_OPTION) {
			setLabel("Try using the window decorations to close the non-auto-closing dialog. You can't!");
		}
	}

	protected static void setLabel(String string) {
		System.out.println(string);
	}

}
