package list1ex10;

/*10. Elabore um algoritmo que imprima todos os números pares de 500 a
250 e também a soma destes números.*/

public class list1ex10 {
	public static void main(String[] args) {
		Integer sum = 0;
		
		for(int i = 500; i >= 250; i--) {
			if(i % 2 == 0) {
				sum += i;
				System.out.println(i);
			};
		};
		
		System.out.println("A soma dos numeros pares e de: " +sum);
	};
};