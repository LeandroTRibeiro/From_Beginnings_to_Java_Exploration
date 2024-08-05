package list1ex9;

import javax.swing.JOptionPane;
import java.util.ArrayList;

/*9. Elabore um algoritmo que entre com números enquanto forem positivos
e imprimir os números positivos digitados.*/

public class list1ex9 {
	public static void main(String[] args) {
		ArrayList<Integer> positiveNumber = new ArrayList<>();
		int number;
		
		do {
			
			number = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
			
			if(number > 0) {
				positiveNumber.add(number);
			}
			
		} while(number > 0);
		
		if(!positiveNumber.isEmpty()) {
			String msg = "Os numeros posivos foram: \n";
			
			for(int num : positiveNumber) {
				msg += num + "\n";
			};
			
			JOptionPane.showMessageDialog(null, msg);
		} else {
			JOptionPane.showMessageDialog(null, "Nenhum numero positivo digitado!");
		};
	};
};