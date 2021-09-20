package ExerciciosLaçosRepetição;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float num;
		int x,contPar=0,contImpar=0;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEntre com um numero: ");
		num = leia.nextFloat();
		
		for(x=1;x<10;x++)
		{
			if(num % 2 == 0)
			{
				contPar++;
			}
			else
			{
				contImpar++;
			}
			
			System.out.println("\nEntre com um numero: ");
			num = leia.nextFloat();
			
		}
		
		System.out.println("\nQuantidade de numeros pares:"+contPar);
		System.out.println("\nQuantidade de numeros impares:"+contImpar);
		
		
	}
	
	
}
	