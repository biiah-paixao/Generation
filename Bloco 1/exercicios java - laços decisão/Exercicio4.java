package ExerciciosLa�osDecis�o;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float num;
		
		try( Scanner leia =  new Scanner (System.in)) {
		
		System.out.println("\nInsira um n�mero: ");
		num = leia.nextFloat();
		
		if(num % 2 == 0)
		{
			System.out.printf("\nO numero " + num + " � par e a raiz quadrada dele �: %.2f",Math.sqrt(num));
		}
		else
		{
			System.out.println("\nO numero " + num + " � impar e o quadrado dele �: "+ Math.pow(num,2));
		}
		

	}

	}
}
