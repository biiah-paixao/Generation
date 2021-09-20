programa
{
	
	funcao inicio()
	{
		inteiro idade

		escreva("\nClassificação por idade")
		escreva("\nInsira uma idade: ")
		leia(idade)

		se(idade >=5 e idade<=7)
		{
			escreva("\nVocê está na categoria Infantil A = 5 a 7 anos")
		}
		senao se(idade >=8 e idade<=11)
		{
			escreva("\nVocê está na categoria Infantil B = 8 a 11 anos")
		}
		senao se(idade >=12 e idade<=13)
		{
			escreva("\nVocê está na categoria Junenil A = 12 a 13 anos")
		}
		senao se(idade >=14 e idade<=17)
		{
			escreva("\nVocê está na categoria Junenil B = 14 a 17 anos")
		}
		senao
		{
			escreva("\nVocê está na categoria Adulto = Maiores de 18 anos")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 632; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */