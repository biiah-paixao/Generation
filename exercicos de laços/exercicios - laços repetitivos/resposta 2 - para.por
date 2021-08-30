programa
{
	
	funcao inicio()
	{
		inteiro i,somaimpar=0

		para(i=0;i<=500;i = i + 3)
		{
			se(i % 2 != 0)
			{
				somaimpar = somaimpar +  i
			}
			senao
			{}
			 
		}

		escreva("\nSoma de todos os números ímpares: ",somaimpar)

			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 179; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */