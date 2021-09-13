package ExerciciosHerança;

public class Animal {
	
	private String nome;
	private int idade;
	private String emitirSom;
	
	public Animal(String nome, int idade, String emitirSom)
	{
		super();
		this.nome = nome;
		this.idade = idade;
		this.emitirSom = emitirSom;
	}
	
	public void validarIdade()
	{
		if(idade<1)
		{
			System.out.println("\nIdade Inválida!!");
		}
	}
	
	
	public void imprimir()
	{
		System.out.println("\nNome: "+nome+"\nIdade: "+idade+"\nEmitindo Som: "+emitirSom);
		System.out.println("\n*******************************************");
		
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmitirSom() {
		return emitirSom;
	}

	public void setEmitirSom(String emitirSom) {
		this.emitirSom = emitirSom;
	}
	
	

}
