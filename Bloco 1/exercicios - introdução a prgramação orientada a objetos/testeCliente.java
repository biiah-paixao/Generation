package ExerciciosPOO;

public class testeCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente lista[] = new Cliente[3];
		
		lista[0] = new Cliente("João Victor", 18,"Santos",3000);
		lista[1] = new Cliente("Maria Cristina",39,"Praia Grande",1200);
		lista[2] = new Cliente("Seu Zé",67,"Ipanema",6000);
		
		
		System.out.println("\n\t****Clientes****");
		
		for(Cliente rodar:lista)
		{
			rodar.imprimirInfo();
			System.out.println("\n**********************************************");
		}
		

	}

}
