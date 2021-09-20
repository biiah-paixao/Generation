programa
{
	
	funcao inicio()
	{
		real pontos[5],maiorPont=0.0
		inteiro x

		para(x=0;x<5;x++)
		{
			escreva("\nEntre com sua pontuação: ")
			leia(pontos[x])

			se(maiorPont<pontos[x])
			{
				maiorPont = pontos[x]
			}
		}

		escreva("\nOs números digitados foram: ")
		para(x=0;x<5;x++)
		{
			escreva(pontos[x]," / ")
		}
		escreva("\nMaior Pontuação: ",maiorPont)
		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 79; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */