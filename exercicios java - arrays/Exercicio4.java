package ExerciciosArrays;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matriz1[][] = new int[2][2];
		int matriz2[][] = new int[2][2];
		int matrizSoma[][] = new int[2][2];
		int matrizDif[][] = new int[2][2];
		int l,c,op,valor,num;
		
		Scanner leia = new Scanner(System.in);
		
		for(l=0;l<2;l++)
		{
			for(c=0;c<2;c++)
			{
				System.out.printf("\nEntre com um número da Matriz 1 [%d][%d]: ",l,c);
				matriz1[l][c] = leia.nextInt();
			}
		}
		
		for(l=0;l<2;l++)
		{
			for(c=0;c<2;c++)
			{
				System.out.printf("\nEntre com um número da Matriz 2 [%d][%d]: ",l,c);
				matriz2[l][c] = leia.nextInt();
			}
		}
		
		do{
			
		System.out.println("\n\t\t -- Menu de Opções: -- ");
		System.out.println("\n1- Somar\n2- Subtrair\n3- Adicionar constante\n4- imprimir as matrizes");
		System.out.println("\nDigite sua opção: ");
		op = leia.nextInt();
		
		
	
		switch(op)
		{
			case 1:
				System.out.println("\nMatriz Soma:");
				for(l=0;l<2;l++)
				{
					for(c=0;c<2;c++)
					{
						matrizSoma[l][c] = matriz1[l][c] + matriz2[l][c];
						System.out.print(" [ "+matrizSoma[l][c]+" ] ");
					}
				System.out.print("\n");
				}
				break;
				
			case 2:
				System.out.println("\nMatriz Diferença: ");
				for(l=0;l<2;l++)
				{
					for(c=0;c<2;c++)
					{
						matrizDif[l][c] = matriz1[l][c] - matriz2[l][c];
						System.out.print(" [ "+matrizDif[l][c]+" ] ");
					}
				System.out.print("\n");
				}
				break;
				
			case 3:
				System.out.println("\nDigite um número: ");
				valor = leia.nextInt();
				
				System.out.println("\nMatriz 1: ");
				for(l=0;l<2;l++)
				{
					for(c=0;c<2;c++)
					{
						matriz1[l][c]+= valor;
						System.out.print(" [ "+matriz1[l][c]+" ] ");
					}
				System.out.print("\n");
				}
				System.out.println("\nMatriz 2: ");
				for(l=0;l<2;l++)
				{
					for(c=0;c<2;c++)
					{
						matriz2[l][c]+= valor;
						System.out.print(" [ "+matriz1[l][c]+" ] ");
					}
				System.out.print("\n");
				}
				break;
				
			case 4:
				System.out.println("\nImpressão das Matrizes");
				System.out.println("\nMatriz 1: ");
				for(l=0;l<2;l++)
				{
					for(c=0;c<2;c++)
					{
						System.out.print(" [ "+matriz1[l][c]+" ] ");
					}
				System.out.print("\n");
				}
				System.out.println("\nMatriz 2: ");
				for(l=0;l<2;l++)
				{
					for(c=0;c<2;c++)
					{
						System.out.print(" [ "+matriz2[l][c]+" ] ");
					}
				System.out.print("\n");
				}
				break;
				
			default:
					System.out.println("\nOpção Inválida!!!Digite outra opção: ");
					op = leia.nextInt();
					
		}
		System.out.println("\nDeseja continuar??\n1- Sim \n2-Não");
		num = leia.nextInt();
		
	}while(num==1);

	}

}
