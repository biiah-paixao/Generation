package ExerciciosArrays;


import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int vetor[] = new int[6];
		int impar[] = new int[6];
		int par[] = new int[6];
		int somaPar=0,contPar=0,contImpar=0,y=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(int x=0;x<6;x++)
		{
			System.out.println("\nEntre com um número: ");
			vetor[x] = leia.nextInt();
		}
		
		for(int x=0;x<6;x++)
		{
			if(vetor[x] % 2 == 0)
			{
				somaPar+=vetor[x];
				par[y] = vetor[x];
				contPar++;
				y++;
				
			}
			else
			{
				contImpar++;
				impar[y] = vetor[x];
			}
			
		}
		//limpa()
		
		System.out.println("\nNumero pares: ");
		for(y=0;y<contPar;y++)
		{
			System.out.println(par[y]);
		}
		
		
		System.out.println("\nNumero impares: ");
		for(y=0;y<contImpar;y++)
		{
			System.out.println(impar[y]);
		}
		
		System.out.println("\nQuantidade de números impares: "+contImpar);
		System.out.println("\nSoma dos números pares: "+somaPar);

	}
	
}