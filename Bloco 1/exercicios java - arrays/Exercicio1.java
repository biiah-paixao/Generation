package ExerciciosArrays;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A[] = {1, 0, 5, -2, -5, 7};
		int soma;
		
		Scanner leia = new Scanner(System.in);
		
		soma = A[0] + A[1] + A[5];
		System.out.println("\nSoma dos valores das posições das posições A[0],A[1],A[5]: "+soma);
		
		A[4] = 100;
		
		for(int x=0;x<6;x++)
		{
			System.out.println("\n"+A[x]);
		}
		
			

	}

}
