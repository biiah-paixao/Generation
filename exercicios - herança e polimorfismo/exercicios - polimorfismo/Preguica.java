package ExerciciosPolimorfismo;

public class Preguica extends BaseAnimais implements Animais{
	
	protected String emitirSom;
	protected String subirArvores;
	
	
	Preguica(String nome, int idade, String emitirSom, String subirArvores)
	{
		super(nome,idade,emitirSom);
		this.emitirSom = emitirSom;
		this.subirArvores = subirArvores;
		nomeClasse = "Cachorro";
		
	}
	
	
	@Override
	public String getEmitirSom() {
		return emitirSom;
	}
	
	public void setEmitirSom(String emitirSom) {
		this.emitirSom = emitirSom;
	}


	public String getSubirArvores() {
		return subirArvores;
	}


	public void setSubirArvores(String subirArvores) {
		this.subirArvores = subirArvores;
	}



	
	

}
