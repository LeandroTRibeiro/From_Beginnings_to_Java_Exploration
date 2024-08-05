package list1ex4;
import javax.swing.JOptionPane;

/*
4. Elabore um algoritmo que leia um número inteiro entre 1 e 12 e imprima
o mês correspondente. Caso seja digitado um valor fora desse intervalo,
deverá ser exibida uma mensagem informando que não existe mês com
esse número.

*/

public class list1ex4 {
	
    public static void main(String[] args) {
    	
    	Integer  med = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero de 1 a 12: "));
    	
    	switch(med) {
    		case 1:
    			JOptionPane.showConfirmDialog(null, "Janeiro");
    		break;
    		case 2:
    			JOptionPane.showConfirmDialog(null, "Fevereiro");
    		break;
    		case 3:
    			JOptionPane.showConfirmDialog(null, "Marco");
    		break;
    		case 4:
    			JOptionPane.showConfirmDialog(null, "Abril");
    		break;
    		case 5:
    			JOptionPane.showConfirmDialog(null, "Maio");
    		break;
    		case 6:
    			JOptionPane.showConfirmDialog(null, "Junho");
    		break;
    		case 7:
    			JOptionPane.showConfirmDialog(null, "Julho");
    		break;
    		case 8:
    			JOptionPane.showConfirmDialog(null, "Agosto");
    		break;
    		case 9:
    			JOptionPane.showConfirmDialog(null, "Setembro");
    		break;
    		case 10:
    			JOptionPane.showConfirmDialog(null, "Outubro");
    		break;
    		case 11:
    			JOptionPane.showConfirmDialog(null, "Novembro");
    		break;
    		case 12:
    			JOptionPane.showConfirmDialog(null, "Dezembro");
    		break;
    		default: 
    			JOptionPane.showConfirmDialog(null, "não existe mês com esse número");
    		break;
    	}
    	
    };
    
};
