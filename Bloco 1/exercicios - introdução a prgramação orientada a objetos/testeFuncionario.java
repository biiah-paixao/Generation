package ExerciciosPOO;

public class testeFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Funcionario fun1 = new Funcionario("Roberto da Silva", "000", "Programador Pleno", 5000);
		
		System.out.println("\n\t\t*****Funcionário*****");
		fun1.imprimir();
		
		Funcionario fun2 = new Funcionario("Julia Souza", "123", "Design Gráfico", 3500);
		fun2.imprimir();
		
		System.out.println("\n\t\t*****Subida de Carg*****");
		fun1.setFuncao("Programador Senior");
		fun1.imprimir();
		

	}

}
