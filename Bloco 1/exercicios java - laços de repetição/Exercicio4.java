package ExerciciosLaçosRepetição;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade,ops,opp,x=0,contPC=0,contMN=0,contHA=0,contOC=0,contNMais40=0,contCMenos18=0;
		
		Scanner leia = new Scanner (System.in);
		
		while(x<=8)
		{
			System.out.println("\nEntre com a sua idade: ");
			idade = leia.nextInt();
			System.out.println("\n\t\t--Sexo--");
			System.out.println("\n1-- Feminino\n2-- Masculino\n3-- Outros");
			System.out.println("\nEscolha uma opção:");
			ops = leia.nextInt();
		
			
			System.out.println("\n\t\t--Como você está se sentindo: ");
			System.out.println("\n1-- Calma\n2-- Nervosa\n3-- Agressiva");
			System.out.println("\nEscolha uma opção: ");
			opp = leia.nextInt();
			
			switch(opp)
		{
			case 1:
				contPC++;
				if(ops==3)
				{
					contOC++;
				}
				if(idade<18)
				{
					contCMenos18++;
				}
				break;
				
			case 2:
				if(ops==1)
				{
					contMN++;
				}
				if(idade>40)
				{
					contNMais40++;
				}
				break;
				
			case 3:
				if(ops == 2)
				{
					contHA++;
				}
				break;
			default:
					System.out.println("\nOpção Inválida!!!");
					
			
		}
			x++;
		}
			System.out.println("\nNúmero de pessoas calmas: "+contPC);
			System.out.println("\nNúmero de mulheres nervosas: "+contMN);
			System.out.println("\nNúmero de homens agressivos: "+contHA);
			System.out.println("\nNúmero de outros calmos: "+contOC);
			System.out.println("\nNúmero de pessoas nervosas com mais de 40 anos: "+contNMais40);
			System.out.println("\nNúmero de pessoas calmas com menos de 18 anos: "+contCMenos18);
		

	}

}
