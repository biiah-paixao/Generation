package ExerciciosCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <String> estoque = new ArrayList<String>();
		int op;
		
		Scanner leia = new Scanner(System.in);
		
		do {
		System.out.println("Lista de opções!");
		System.out.println("\n1-- Adicionar Dados\n2-- Remover Dados\n3-- Atualizar Dados\n4-- Apresentar Dados \n0-- Sair do Programa");
		op = leia.nextInt();
		
		switch(op)
		{
		case 1:
			leia.nextLine();//limpa o cache de memoria
			System.out.println("\nDigite o produto para adicionar ao estoque:");
			String produto = leia.nextLine();
			estoque.add(produto);
			break;
			
		case 2:
			leia.nextLine();
			System.out.println("\nEscreva o produto que você deseja remover: ");
			String produtor = leia.nextLine();
			
			if(estoque.contains(produtor))
			{
				estoque.remove(produtor);
				System.out.println("\nProduto removido com Sucesso!");
			}
			else
			{
				System.out.println("\nProduto não existe!!!");
			}
			break;
			
		case 3:
			leia.nextLine();
			System.out.println("\nDigite o produto que quer atualizar"); 
			String verifica = leia.nextLine();
			System.out.println("\nDigite o nome do produto que entrará do lugar do produto "+verifica);
			String novo = leia.nextLine();
			
			if(estoque.contains(verifica))
			{
				estoque.remove(verifica);
				estoque.add(novo);
			
			}
			else
			{
				System.out.println("\nProduto não existe!!!");
			}
			System.out.println(estoque);
			break;
			
		case 4:
			for(int i=0;i<estoque.size();i++)
			{
				System.out.println("\nOs produtos do estoque são");
				System.out.println(estoque);
			}
			break;
		case 0:
			System.out.println("\nPrograma Finalizado!");
			break;
			default:
				System.out.println("\nOpção inválida!!");
		}
		
			} while(op!=0);
		

	}

}
