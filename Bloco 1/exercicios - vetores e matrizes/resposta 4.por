programa
{
	
	funcao inicio()
	{
		inteiro matriz[3][3],linha,coluna,x,soma,somadiag=0,somatotal=0

		para(linha=0;linha<3;linha++)
		{
			para(coluna=0;coluna<3;coluna++)
			{
				escreva("\nEntre com um número: ")
				leia(matriz[linha][coluna])
			}
		}

		para(linha=0;linha<3;linha++)
		{
			para(coluna=0;coluna<3;coluna++)
			{
				se(linha == coluna)
				{ 
					soma = matriz[linha][coluna]
					somadiag = somadiag + soma 
					
				}
				senao
				{
					soma = matriz[linha][coluna]
					somatotal = somatotal + soma
				}
				
			}
		}

		escreva("\nSomatório dos Valores da Martriz: ",somatotal + somadiag)
	
		escreva("\nSomatório dos Valores da diagonal principal: ",somadiag)
	}	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 624; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 6, 10, 6}-{soma, 6, 38, 4}-{somadiag, 6, 43, 8}-{somatotal, 6, 54, 9};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */