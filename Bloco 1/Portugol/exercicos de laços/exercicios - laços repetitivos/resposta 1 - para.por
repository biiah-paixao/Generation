programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		real salario,somasalario=0.0,somafilhos= 0.0,mediasalario,mediafilhos,per,salario100=0.0,maiorsalario=0.0
		inteiro filhos,x


		para(x=1;x<=20;x++)
		{
			escreva("\nEntre com o seu salário: ")
			leia(salario)
			escreva("\nEntre com o numero de filhos: ")
			leia(filhos)

			somasalario = somasalario + salario
			somafilhos = somafilhos + filhos 

			se(salario>maiorsalario)
			{
				maiorsalario = salario
			}
			senao
			{}
		
		
			se(salario <= 100.0)
			{
				salario100++
			}
			senao
			{}
		}
		
		mediasalario = somasalario / x
		escreva("\nMédia Salário ds População: ",mat.arredondar(mediasalario, 2))
		mediafilhos = somafilhos / x
		escreva("\nMédia do número de filhos: ",mat.arredondar(mediafilhos, 2))

		escreva("\nO maior salário é: ",maiorsalario)

		per = salario100 * 100 / x
		escreva("\nPercentual de Pessoas com salário até R$100,00: ",mat.arredondar(per, 2))
		
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 460; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */