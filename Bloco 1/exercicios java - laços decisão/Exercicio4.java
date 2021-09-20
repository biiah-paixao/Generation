package ExerciciosLaçosDecisão;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float num;
		
		try( Scanner leia =  new Scanner (System.in)) {
		
		System.out.println("\nInsira um número: ");
		num = leia.nextFloat();
		
		if(num % 2 == 0)
		{
			System.out.printf("\nO numero " + num + " é par e a raiz quadrada dele é: %.2f",Math.sqrt(num));
		}
		else
		{
			System.out.println("\nO numero " + num + " é impar e o quadrado dele é: "+ Math.pow(num,2));
		}
		

	}

	}
}
