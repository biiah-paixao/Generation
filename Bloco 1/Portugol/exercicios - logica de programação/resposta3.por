programa
{
	
	funcao inicio()
	{
		inteiro totalSegundos, horas, minutos, segundos

		escreva("\nEscreva o tempo de duração do evento em segundos: ")
		leia(totalSegundos)

		horas = totalSegundos / 3600
		minutos = (totalSegundos % 3600) / 60
		segundos = totalSegundos - (horas * 3600 + minutos * 60)
		
		escreva("A duração do evento foi de ", horas," horas ", minutos ," minutos e ", segundos ," segundos")

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 423; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */