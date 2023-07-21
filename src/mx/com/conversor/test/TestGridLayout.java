package mx.com.conversor.test;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestGridLayout {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(new GridLayout(3,3,10,10)); //El primer parametro es filas y el segundo columnas
		frame.setVisible(true);	              //Podemos darle otros dos parametros que son margen x y y
		
		JButton boton1 = new JButton("1");
		JButton boton2 = new JButton("2");
		JButton boton3 = new JButton("3");
		JButton boton4 = new JButton("4"); 
		JButton boton5 = new JButton("5");
		JButton boton6 = new JButton("6");
		JButton boton7 = new JButton("7");
		JButton boton8 = new JButton("8");
		JButton boton9 = new JButton("9");
	
		frame.add(boton1);
		frame.add(boton2);
		frame.add(boton3);
		frame.add(boton4);
		frame.add(boton5);
		frame.add(boton6);
		frame.add(boton7);
		frame.add(boton8);
		frame.add(boton9);
		
	}
	
	
	
}
