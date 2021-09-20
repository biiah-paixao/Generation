package ExerciciosPOO;

public class testeContaBancaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContaBancaria contas[] = new ContaBancaria[5];
		
		contas[0] = new ContaBancaria("Banco do Brasil","1584-9","00210169-6");
		contas[1] = new ContaBancaria("Santander","0189-0","01017417-9");
		contas[2] = new ContaBancaria("Caixa","2004-0","00100012448-6");
		contas[3] = new ContaBancaria("Bradesco","0123-4","0123456-7");
		contas[4] = new ContaBancaria("Itaú","2545-0","02366-1");
		
			for(ContaBancaria rodar:contas)
			{
				rodar.imprimir();
				System.out.println("\n**********************************************");
			}

		

	}

}
