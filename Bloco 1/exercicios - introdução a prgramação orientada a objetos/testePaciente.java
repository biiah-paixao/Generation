package ExerciciosPOO;

public class testePaciente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Paciente(String nome,int idade, String convenio, int numeroRegistro)
		
		Paciente pacientes[] = new Paciente[2];
		
		pacientes[0] = new Paciente("Dalila",6,"UNIMED",185460);
		pacientes[1] = new Paciente("Vanda",50,"Bradesco",123456);
		
			System.out.println("\n\t*********Pacientes*********");
		
				for(Paciente rodar:pacientes)
				{
					rodar.imprimir();
					System.out.println("\n**********************************************");
				}

	}

}
