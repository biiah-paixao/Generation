programa
{
	inclua biblioteca Matematica -->mat
	
	funcao inicio()
	{
		real num1,num2,num3,num4

		escreva("\nEntre com o primeiro numero: ")
		leia(num1)
		escreva("\nEntre com o segundo numero: ")
		leia(num2)
		escreva("\nEntre com o terceiro numero: ")
		leia(num3)
		escreva("\nEntre com o quarto numero: ")
		leia(num4)

		se(mat.potencia(num3,2.0)>= 1000)
		{
			escreva("\nO quadrado do terceiro numero é: ", mat.potencia(num3, 2.0))
		}
		senao
		{
			escreva("\nO do quadrado do numero: ",num1, " é ",(mat.potencia(num1, 2.0)))
			escreva("\nO do quadrado do numero: ",num2, " é ",(mat.potencia(num2, 2.0)))
			escreva("\nO do quadrado do numero: ",num3, " é ",(mat.potencia(num3, 2.0)))
			escreva("\nO do quadrado do numero: ",num4, " é ",(mat.potencia(num4, 2.0)))
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 793; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */