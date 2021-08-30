programa
{
	funcao inicio()
	{
		real base,altura

		escreva("\nEscreva um valor base: ")
		leia(base)
		escreva("\nEscreva um valor de altura: ")
		leia(altura)

		se(base >=0 e altura>=0)
		{
			escreva("\nArea do triangulo: ",base * altura)
		}
		senao
		{
			se(base != 0 e base < 0 e altura>=0)
			{
				escreva("\nO valore de base não é válido")
			}
			senao se(altura != 0 e altura < 0 e base >=0)
			{
				escreva("\nO valore de altura não é válido")
			}
			senao
			{
				escreva("\nOs valores de base e/ou altura não são válidos")
			}
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 150; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */