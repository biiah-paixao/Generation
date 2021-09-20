package ExerciciosLaçosDecisão;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade;
		
		try(Scanner leia = new Scanner (System.in)) {
		
		System.out.println("\nEntre com a sua idade: ");
		idade = leia.nextInt();
		
		if(idade<=14 && idade>=10)
		{
			System.out.println("\nEncontra-se na categoria Infantil 10-14 anos");
		}
		else if(idade<=17 && idade>=15)
		{
			System.out.println("\nEncontra-se na categoria Juvenil 15-17 anos");
		}
		else if(idade<=25 && idade>=18)
		{
			System.out.println("\nEncontra-se na categoria Adulto 18-25 anos");
		}
		else
		{
			System.out.println("\nVocê não se encontra em nenhuma categoria!");
		}

	}

	}
}
