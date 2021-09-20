programa
{
	
	funcao inicio()
	{
		real p,E,m

		escreva("\nEntre com a quantidade de quilos: ")
		leia(p)

		se(p>=50 e p>0)
		{
			E = p - 50
			m = E * 4
			escreva("\nExcedente: ",E)
			escreva("\nMulta: ",m)
			
		}
		senao
		{
			escreva("\nExcedente: 0","\nMulta: 0")

			
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 291; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */