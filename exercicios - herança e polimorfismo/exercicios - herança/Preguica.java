package ExerciciosHerança;

public class Preguica extends Animal{
	
	private String subirArvores;
	
	public Preguica(String nome,int idade, String emitirSom, String subirArvores)
	{
		super(nome,idade,emitirSom);
		this.subirArvores = subirArvores;
	}
	
	
	
	public String getSubirArvores() {
		return subirArvores;
	}



	public void setSubirArvores(String subirArvores) {
		this.subirArvores = subirArvores;
	}



	public void validarIdade()
	{
		if(getIdade()<1)
		{
			System.out.println("\nIdade Inválida!!");
		}
	}
	
	public void imprimir()
	{
		System.out.println("\nNome: "+getNome()+"\nIdade: "+getIdade()+"\nEmitindo Som: "+getEmitirSom()+"\nSubir em Arvores: "+subirArvores);
		
	}

}
