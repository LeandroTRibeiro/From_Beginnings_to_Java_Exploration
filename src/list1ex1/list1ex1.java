package list1ex1;
import javax.swing.JOptionPane;

//1. Faça um algoritmo em Java que receba três notas e seus respectivos
// pesos, calcule e mostre a média ponderada dessas notas.

public class list1ex1 {
	
    public static void main(String[] args) {
    	
    	Integer n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a primeira nota: "));
    	Integer p1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o peso da primeira nota: "));
    	Integer n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a segunda nota: "));
    	Integer p2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o peso da segunda nota: "));
    	Integer n3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a terceira nota: "));
    	Integer p3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o peso da terceira nota: "));
    	
    	double med = (n1 * p1 + n2 * p2 + n3 * p3) / (double)(p1 + p2 + p3);
    	
    	JOptionPane.showConfirmDialog(null, "A media ponderada das notas e de: " +med);
    	
    };
    
};
