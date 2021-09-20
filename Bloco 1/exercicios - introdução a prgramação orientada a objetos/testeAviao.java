package ExerciciosPOO;

public class testeAviao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aviao lista[] = new Aviao[3];
		
		lista[0] = new Aviao("Airbus A380",15,800,2357622060l);
		lista[1] = new Aviao("Boeing 747-8",14,410,2213709760l);
		lista[2] = new Aviao("Airbus A350-1000",14,366,193911240l);
		
		System.out.println("\n\t*********Aviões*********");
		
		for(Aviao rodar:lista)
		{
			rodar.imprimirVal();
			System.out.println("\n**********************************************");
		}

	}

}
