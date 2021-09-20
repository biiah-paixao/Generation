programa
{
	
	funcao inicio()
	{
		inteiro valor,somatotal=0, media, lidos=0
		
		escreva("\nDigite um valor numérico: ")
		leia(valor) 
		
		enquanto(valor>0)
		{
			somatotal = somatotal + valor
			lidos = lidos + 1
			escreva("\nDigite um valor numérico: ")
			leia(valor) 
		}

		media = somatotal / lidos 
		escreva("\nTotal do somatório: ",somatotal)
		escreva("\nMédia dos valores numéricos: ",media)
		escreva("\nTotal de valores lidos: ",lidos)
	 
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 269; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */