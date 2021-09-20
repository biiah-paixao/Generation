package ExerciciosArrays;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matriz[][] = new int[3][3];
		int l,c,cont=0,val=0;
		
		Scanner leia = new Scanner (System.in);
		
		for(l=0;l<3;l++)
		{
			for(c=0;c<3;c++)
			{
				System.out.println("\nEntre com um número: ");
				matriz[l][c] = leia.nextInt();
				
			}
		}
		
		System.out.printf("\nValores maiores que 1%d: ",val);
		for(l=0;l<3;l++)
		{
			for(c=0;c<3;c++)
			{
				if(matriz[l][c] > 10)
				{
					cont++;
					System.out.println(matriz[l][c]);
				}
				
			}
		}
		
		System.out.println("\nQuantidade de valores maior que 10: "+cont);
		
		

	}

}
