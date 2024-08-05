package list1ex5;

import javax.swing.JOptionPane;

/*5. Elabore um algoritmo que leia dois números e faça uma das quatro
operações. A operação (soma, subtração, multiplicação ou divisão) será
escolhida pelo usuário.*/

public class list1ex5 {
	public static void main(String[] args) {
		int[] numbers = new int[2];
		
		for(int i = 0; i < 2; i++) {
			numbers[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero: "));
		};
		
		String[] options = {"Soma", "Subtracao", "Multiplicacao", "Divisao"};
		
		Integer option = JOptionPane.showOptionDialog(
				null, 
				"Escolha uma opcao!", 
				"Operacao", 
				JOptionPane.DEFAULT_OPTION, 
				JOptionPane.QUESTION_MESSAGE, 
				null,
				options, 
				options[0]
		);
		
		switch(option) {
			case 0:
				JOptionPane.showConfirmDialog(null, "A Soma dos dois numeros e de: " + (numbers[0] + numbers[1]));
			break;
			case 1:
				JOptionPane.showConfirmDialog(null, "A Subtracao dos dois numeros e de: " + (numbers[0] - numbers[1]));
			break;
			case 2:
				JOptionPane.showConfirmDialog(null, "A Multiplicacao dos dois numeros e de: " + (numbers[0] * numbers[1]));
			break;
			case 3:
				JOptionPane.showConfirmDialog(null, "A Divisao dos dois numeros e de: " + (numbers[0] / numbers[1]));
			break;
			default: 
				JOptionPane.showConfirmDialog(null, "Nenhuma opcao selecionada encerrando!");
			break;
		}
		
		
		
	};
};