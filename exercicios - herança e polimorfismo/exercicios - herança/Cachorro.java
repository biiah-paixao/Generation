package ExerciciosHerança;

public class Cachorro extends Animal {
	
	private String correr;
	
	public Cachorro(String nome, int idade, String emitirSom, String correr)
	{
		super(nome,idade,emitirSom);
		this.correr = correr;
	}
	
	public String getCorrer() {
		return correr;
	}



	public void setCorrer(String correr) {
		this.correr = correr;
	}



	public void imprimir()
	{
		System.out.println("\nNome: "+getNome()+"\nIdade: "+getIdade()+"\nEmitindo Som: "+getEmitirSom()+"\nCorrer: "+correr);
		
	}

}
