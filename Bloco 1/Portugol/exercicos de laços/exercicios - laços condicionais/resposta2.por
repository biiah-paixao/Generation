programa
{
	
	funcao inicio()
	{
		real c,n,s,E

		escreva("\nEntre com o código: ")
		leia(c)
		escreva("\nEntre com o número de horas trabalhadas: ")
		leia(n)

		se( n>= 50 e n>=0)
		{	
			E = n - 50
			s = (n - E) * 10
			escreva("\nSalário Excedente: ",E * 20)
			escreva("\nSalário Total: ",s + E*20)
		}
		senao
		{
			E = 0.0
			s = n * 10
			escreva("\nExcesso de Pagamento: ",E)
			escreva("\nSalário Total: ",s)
		}
		
	}
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 122; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */