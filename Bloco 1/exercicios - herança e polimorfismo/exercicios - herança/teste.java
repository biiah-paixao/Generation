package ExerciciosHerança;

public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cachorro bob = new Cachorro("Cachorro",8,"AU AU AU!","Cachorro correndo...");
		Cavalo lucky = new Cavalo("Cavalo",6,"IRRRIINN","Cavalo correndo...");
		Preguica zezim = new Preguica("Preguiça",4,"AAAAAAHHHHZZZZ","Preguica subindo em arvores...");
		
		System.out.println("\n\t\t--Animais--");
		bob.imprimir();
		lucky.imprimir();
		zezim.imprimir();

	}

}
