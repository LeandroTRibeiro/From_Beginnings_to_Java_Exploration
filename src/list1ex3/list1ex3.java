package list1ex3;
import javax.swing.JOptionPane;

/*
3. Faça um programa em Java que leia a média final de um aluno e
forneça uma mensagem associada ao conceito obtido. Utilize "if/else”.
Informações a serem apresentadas:
- Se a média é menor que 7, “Você precisa estudar mais”;
- Se a média é igual a 7, “Você foi aprovado”;
- Se a média está entre 7 e 8, ou seja de 7.1 à 7.99 “Parabéns, suas notas
ficaram acima da média”;
- Se a média é maior ou igual a 8 e menor que 9, “Parabéns,sua média
ficou próxima da nota máxima”;
- Se a média é maior ou igual a 9, “Parabéns, você é um excelente aluno”;
*/

public class list1ex3 {
	
    public static void main(String[] args) {
    	
    	Double  med = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a media final: "));
    	
    	if(med >= 9) {
    		JOptionPane.showConfirmDialog(null, "Parabéns, você é um excelente aluno");
    		return;
    	};
    	if(med >= 8) {
    		JOptionPane.showConfirmDialog(null, "Parabéns,sua média ficou próxima da nota máxima");
    		return;
    	};
    	if(med >= 7.1) {
    		JOptionPane.showConfirmDialog(null, "Parabéns, suas notas ficaram acima da média");
    		return;
    	};
    	if(med == 7) {
    		JOptionPane.showConfirmDialog(null, "Você foi aprovado");
    		return;
    	};
    	if(med < 7) {
    		JOptionPane.showConfirmDialog(null, "Você precisa estudar mais");
    		return;
    	};
    };
    
};
