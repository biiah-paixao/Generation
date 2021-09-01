package ExerciciosLaçosDecisão;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1,num2,num3,maior=0;
		
		try (Scanner leia = new Scanner (System.in)){
		
				System.out.println("\nEntre com o primeiro numero: ");
				num1 = leia.nextInt();
				System.out.println("\nEntre com o segundo numero: ");
				num2 = leia.nextInt();
				System.out.println("\nEntre com o terceiro numero: ");
				num3 = leia.nextInt();
		
		if(num1>num2 && num1>num3)
		{
			maior = num1;
		}
		else if(num2>num3)
		{
			maior = num2;
		}
		else
		{
			maior = num3;
		}
		
		System.out.println("\nO maior numero é o numero: "+ maior);

	}

	}
}
