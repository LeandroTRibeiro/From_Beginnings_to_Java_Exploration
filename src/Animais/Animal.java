package Animais;

import javax.swing.JOptionPane;

public class Animal {
	String name;
	
	public Animal(String name) {
		this.name = name;
		
	}
	
	public void showName() {
		JOptionPane.showMessageDialog(null, this.name);
	}
}
