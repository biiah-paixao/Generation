package ExerciciosHeran�a;

public class Cavalo extends Animal {
	
	private String correr;
	
	public Cavalo(String nome, int idade, String emitirSom, String correr)
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



	public void validarIdade()
	{
		if(getIdade()<1)
		{
			System.out.println("\nIdade Inv�lida!!");
		}
	}
	
	public void imprimir()
	{
		System.out.println("\nNome: "+getNome()+"\nIdade: "+getIdade()+"\nEmitindo Som: "+getEmitirSom()+"\nCorrer: "+correr);
		
	}

}