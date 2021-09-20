programa
{
	
	funcao inicio()
	{
		real ca, cb, cc, cd, ce, cf, x, y

		escreva("\nEscreva o valor do coeficiente A: ")//6
		leia(ca)
		escreva("\nEscreva o valor do coeficiente B: ")//5
		leia(cb)
		escreva("\nEscreva o valor do coeficiente C: ")//4
		leia(cc)
		escreva("\nEscreva o valor do coeficiente D: ")//3
		leia(cd)
		escreva("\nEscreva o valor do coeficiente E: ")
		leia(ce)
		escreva("\nEscreva o valor do coeficiente F: ")
		leia(cf)

		x = (cc*ce - cb*cf) / (ca*ce - cb*cd)
		y = (ca*cf - cc*cd) / (ca*ce - cb*cd)

		escreva("\nValor de X: ", x)
		escreva("\nValor de Y: ", y)

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 375; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */