package ExerciciosLaçosDecisão;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float num1,num2,num3;
		
		try (Scanner leia = new Scanner(System.in)){
		
		System.out.println("\nEntre com o primeiro numero: ");
		num1 = leia.nextFloat();
		System.out.println("\nEntre com o segundo numero: ");
		num2 = leia.nextFloat();
		System.out.println("\nEntre com o terceiro numero: ");
		num3 = leia.nextFloat();
		
		if(num1>num2 && num1>num3)
		{
			System.out.println("\nO primeiro numero é: "+num1);
			if(num2>num3)
			{
				System.out.println("\nO segundo numero é: "+num2);
				System.out.println("\nO terceiro numero é: "+num3);
			}
			else
			{
				System.out.println("\nO segundo numero é: "+num2);
				System.out.println("\nO terceiro numero é: "+num3);
			}
		}
		
		else if(num2>num1 && num2>num3)
		{
			System.out.println("\nO primeiro numero é: "+num2);
			if(num1>num3)
			{
				System.out.println("\nO segundo numero é: "+num1);
				System.out.println("\nO terceiro numero é: "+num3);
			}
			else
			{
				System.out.println("\nO segundo numero é: "+num1);
				System.out.println("\nO terceiro numero é: "+num3);
			}
		}
		
		else
		{
			System.out.println("\nO primeiro numero é: "+num3);
			if(num2>num1)
			{
				System.out.println("\nO segundo numero é: "+num2);
				System.out.println("\nO terceiro numero é: "+num1);
			}
			else
			{
				System.out.println("\nO segundo numero é: "+num1);
				System.out.println("\nO terceiro numero é: "+num2);
			}
			
		}

	}

}
}
