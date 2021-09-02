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
		
		if(num1<num2 && num1<num3)
		{
			if(num2<num3)
			{
				System.out.println("\nOs numeros em ordem crescente é: "+num1 + " / " + num2 + " / " + num3);
			}
			else
			{
				System.out.println("\nOs numeros em ordem crescente é: "+num1 + " / " + num3 + " / " + num2);
			}
		}
		
		else if(num2<num1 && num2<num3)
		{
			if(num1<num3)
			{
				System.out.println("\nOs numeros em ordem crescente é: "+ num2 + " / " + num1 + " / " + num3);
			}
			else
			{
				System.out.println("\nOs numeros em ordem crescente é: "+ num2 + " / " + num3 + " / " + num1);
			}
		}
		
		else
		{
			if(num2>num1)
			{
				System.out.println("\nOs numeros em ordem crescente é: "+ num3 + " / " + num2 + " / " + num1);
			}
			else
			{
				System.out.println("\nOs numeros em ordem crescente é: "+num3 + " / " + num1 + " / " + num2);
			}
			
		}

	}

}
}
