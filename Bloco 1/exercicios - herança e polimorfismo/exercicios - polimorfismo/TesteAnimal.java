package ExerciciosPolimorfismo;

public class TesteAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cachorro cachorro = new Cachorro("Cachorro",8,"AU AU AU!","Cachorro correndo...");
		Cavalo cavalo = new Cavalo("Cavalo",6,"IRRRIINN","Cavalo correndo...");
		Preguica preguica = new Preguica("Preguiça",4,"AAAAAAHHHHZZZZ","Preguica subindo em arvores...");
		
		
		System.out.println("\nNome: "+cachorro.getNome()+"\nIdade: "+cachorro.getIdade()+"\nEmitindo Som: "+cachorro.getEmitirSom());
		System.out.println("\nNome: "+cavalo.getNome()+"\nIdade: "+cavalo.getIdade()+"\nEmitindo Som: "+cavalo.getEmitirSom());
		System.out.println("\nNome: "+preguica.getNome()+"\nIdade: "+preguica.getIdade()+"\nEmitindo Som: "+preguica.getEmitirSom());

	}

}
