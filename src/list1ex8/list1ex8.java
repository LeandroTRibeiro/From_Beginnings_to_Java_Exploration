package list1ex8;

/*8. Elabore um algoritmo que imprima todos os números ímpares de 250 a
500 e também a soma destes números.**/

public class list1ex8 {
	public static void main(String[] args) {
		Integer sum = 0;
		
		for(int i = 250; i <= 500; i++) {
			if(i % 2 != 0) {
				sum += i;
				System.out.println(i);
			};
		};
		System.out.println("A soma dos numero impares e de: " +sum);
	};
};