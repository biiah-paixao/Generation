programa
{
	
	funcao inicio()
	{
		real custodefabrica,custoconsumidor, porcentagemdistribuidor, porcentagemimpostos

		escreva("\nDigite o custo de fábrica do carro: ")
		leia(custodefabrica)

		porcentagemdistribuidor = custodefabrica + (28 * custodefabrica) / 100
		porcentagemimpostos = custodefabrica + (45 * custodefabrica) / 100
		
		custoconsumidor = custodefabrica + porcentagemdistribuidor + porcentagemimpostos

		escreva("\nOvalor do custo ao consumidor é: ", custoconsumidor)
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 495; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */