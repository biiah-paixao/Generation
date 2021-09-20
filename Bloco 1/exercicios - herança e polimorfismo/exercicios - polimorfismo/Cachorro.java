package ExerciciosPolimorfismo;

public class Cachorro extends BaseAnimais implements Animais{
	
	protected String emitirSom;
	protected String correr;
	
	
	Cachorro(String nome, int idade, String emitirSom, String correr)
	{
		super(nome,idade,emitirSom);
		this.emitirSom = emitirSom;
		this.correr = correr;
		nomeClasse = "Cachorro";
		
	}
	
	
	@Override
	public String getEmitirSom() {
		return emitirSom;
	}
	
	public void setEmitirSom(String emitirSom) {
		this.emitirSom = emitirSom;
	}

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}


	
	

}
