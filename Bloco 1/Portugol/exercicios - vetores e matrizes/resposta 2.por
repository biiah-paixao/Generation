programa
{
	
	funcao inicio()
	{
		inteiro dado[10],cont=0,soma=0,maior=0,x

		para(x=0;x<10;x++)
		{1
			escreva("\nEscreva o valor do ",x+1,"º lançamento: ")
			leia(dado[x])

			se(dado[x] > 6 )
			{
				escreva("\nValor inválido! Jogue Nomamente o Dado")	
			}

			se(maior < dado[x])
			{
				maior = dado[x]
			}
			
			soma = soma + dado[x]
		
		}

		para(x=0;x<10;x++)
		{
			se(maior == dado[x])
			{
				cont++
			}
		}
		
		escreva("\nMédia Aritmétrica: ",soma / 10)
		escreva("\nO número ",maior," apareceu ",cont," vezes")

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 504; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */