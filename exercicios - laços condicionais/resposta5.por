programa
{
	
	funcao inicio()
	{
		real ind1,ind2,ind3,indice

		escreva("\nEscreva o indice de poluição do primerio grupo de industria: ")
		leia(ind1)
		escreva("\nEscreva o indice de poluição do segundo grupo de industria: ")
		leia(ind2)
		escreva("\nEscreva o indice de poluição do tercerio grupo de industria: ")
		leia(ind3)

		indice = (ind1 + ind2 + ind3) / 3

		se(indice >=0.05 e indice <=0.25)
		{
			escreva("\nO indice de poluição está aceitavel")
		}
		senao se(indice > 0.25 e indice <= 0.39)
		{
			escreva("\nEmpresas do grupo 1 precisam suspender suas atividades")
		}
		senao se(indice >= 0.4 e indice <= 0.49)
		{
			escreva("\nEmpresas dos grupos 1 e 2 precisam suspender suas atividades")
		}
		senao se(indice >0.5 )
		{
			escreva("\nTodas as empresas precisam paralisar suas atividades")
		}
		senao
		{
			escreva("\nAs atividades de todos os grupos devem permanecer ativas")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 373; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */