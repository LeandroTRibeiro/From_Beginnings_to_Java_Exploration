package list1ex2;
import javax.swing.JOptionPane;

/*
2. Faça um algoritmo em Java que receba o salário-base de um
funcionário e mostre o salário a receber, sabendo-se que esse funcionário
tem gratificação de 5% sobre o salário-base e paga imposto de 7% sobre
o salário-base.
*/

public class list1ex2 {
	
    public static void main(String[] args) {
    	
    	Integer salary = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o salario do funcionario: "));
    	
        double tax = (salary * 7) / 100;
        
        double gratification = (salary * 5) / 100;
        
        double salaryResult = salary + gratification - tax;
    	    	
    	JOptionPane.showConfirmDialog(null, "O salario do funcionario com o acrescimo e o desconto e de: " +salaryResult);
    	
    };
    
};
