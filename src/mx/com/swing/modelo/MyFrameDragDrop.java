package mx.com.swing.modelo;

import javax.swing.JFrame;

public class MyFrameDragDrop extends JFrame {

	DragPanel dragPanel = new DragPanel();
	
	
	public MyFrameDragDrop() {
	
		this.add(dragPanel);
		
		this.setTitle("Drag & Drop");
		this.setSize(600,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
}
