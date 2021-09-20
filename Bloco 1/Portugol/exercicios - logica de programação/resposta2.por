programa
{
	inclua biblioteca Matematica--> mat
	
	funcao inicio()
	{
		inteiro idadeEmDias,anos,meses,dias

		escreva("\nEscreva sua idade em dias: ")
		leia(idadeEmDias)
		
		anos = idadeEmDias / 365
		meses = idadeEmDias % 12
		dias = idadeEmDias - ((anos * 365) + (meses * 30))
		
		escreva("\nIdade em Anos: ",anos)
		escreva("\nIdade em Meses: ",meses)
		escreva("\nIdade em Dias: ",dias)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 288; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */