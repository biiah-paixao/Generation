package ExerciciosLaçosRepetição;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float num,somaNum=0;
		
		Scanner leia = new Scanner (System.in);
		
		do
		{
			System.out.println("\nEntre com um numero do teclado: ");
			num = leia.nextFloat();
			somaNum+=num;
		}
		while(num!=0);
		
		System.out.printf("\nSoma de todos os numeros digitados: %.2f",somaNum);

	}

}
