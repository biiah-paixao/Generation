package ExerciciosLa�osRepeti��o;

import java.util.Scanner;

public class AjustesdoExercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade,ops,opp,x=0,contPC=0,contMN=0,contHA=0,contOC=0,contNMais40=0,contCMenos18=0;
		
		Scanner leia = new Scanner (System.in);
		
		while(x<=3)
		{
			System.out.println("\nEntre com a sua idade: ");
			idade = leia.nextInt();
			while(idade<1 || idade>130)
			{
				System.out.println("\nIdade Invalida!! Entre com uma nova idade: ");
				idade = leia.nextInt();
			}
			
			System.out.println("\nEntre com o seu Gen�ro: \n1-- Feminino\n2-- Masculino\n3-- Outros");
			ops = leia.nextInt();
			while(ops<1 || ops>3)
			{
				System.out.println("\nOp��o Invalida!! Entre com uma nova op��o: ");
				ops = leia.nextInt();
			}
			
			System.out.println("\nEntre com a sua caracteristica psicol�gica: \n1-- Calma\n2-- Nervosa\n3-- Agressiva");
			System.out.println("\nEscolha uma op��o: ");
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
					System.out.println("\nOp��o Inv�lida!!!Digite outra op��o: ");
					opp = leia.nextInt();
					
		}
			x++;
		}
			System.out.println("\nN�mero de pessoas calmas: "+contPC);
			System.out.println("\nN�mero de mulheres nervosas: "+contMN);
			System.out.println("\nN�mero de homens agressivos: "+contHA);
			System.out.println("\nN�mero de outros calmos: "+contOC);
			System.out.println("\nN�mero de pessoas nervosas com mais de 40 anos: "+contNMais40);
			System.out.println("\nN�mero de pessoas calmas com menos de 18 anos: "+contCMenos18);
		

	}

}