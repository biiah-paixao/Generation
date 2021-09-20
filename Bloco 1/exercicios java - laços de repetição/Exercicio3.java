package ExerciciosLaçosRepetição;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade,contMenos21=0,contMais50=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com sua idade: ");
		idade = leia.nextInt();
		
		while(idade!=-99)
		{
			if(idade<21)
			{
				contMenos21++;
			}
			if(idade>50)
			{
				contMais50++;
			}
			
			System.out.println("\nEntre com sua idade: ");
			idade = leia.nextInt();
		}
		
		System.out.println("\nTotal de pessoas com menos de 21 anos: "+ contMenos21);
		System.out.println("\nTotal de pessoas com mais de 50 anos: "+ contMais50);

	}

}
