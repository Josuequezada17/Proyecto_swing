package mx.com.swing.modelo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrameSelectFile extends JFrame implements ActionListener{

	private JButton boton = new JButton("Select file");
	
	public MyFrameSelectFile() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		this.boton.addActionListener(this);
		
		
		
		this.add(this.boton);
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.boton) {
			JFileChooser fileChooser = new JFileChooser();
			
			fileChooser.setCurrentDirectory(new File("."));
			//Usando el "." le damos la ubicacion donde se guarda nuestro proyecto
			//O podemos utilizar una ruta //Oracle//Eclipse//Proyecto-Swing ...
			int respuesta = fileChooser.showOpenDialog(null); //Selecciona un archivo y lo abre
			int respuesta1 = fileChooser.showSaveDialog(null);
			
			if(respuesta == JFileChooser.APPROVE_OPTION){
				File archivo = new File(fileChooser.getSelectedFile().getAbsolutePath());
				System.out.println("Ruta del archivo: " + archivo);
			}
			if(respuesta1 == JFileChooser.APPROVE_OPTION){
				File archivo = new File(fileChooser.getSelectedFile().getAbsolutePath());
				System.out.println("Ruta del archivo: " + archivo);
			}
			
		}
	}

	
	
}
