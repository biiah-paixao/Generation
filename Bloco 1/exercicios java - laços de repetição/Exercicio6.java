package ExerciciosLa�osRepeti��o;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,soma=0,media,cont=0;
		
		Scanner leia = new Scanner(System.in);
		
		do
		{
			System.out.println("\nEntre com um n�mero inteiro: ");
			num = leia.nextInt();
			if(num % 2 == 1)
			{
				soma+=num;
				cont++;
			}
		}
		while(num!=0);
		
		media = soma / cont;
		System.out.println("\nM�dia dos n�meros multiplos de 3: "+ media);

	}

}
