package ExerciciosPOO;

public class Paciente {
	
	private String nome;
	private int idade;
	private String convenio;
	private int numeroRegistro;
	
	
	public Paciente(String nome, int idade, String convenio, int numeroRegistro)
	{
		this.nome = nome;
		this.idade = idade;
		this.convenio =  convenio;
		this.numeroRegistro = numeroRegistro;
	}
	
	public void imprimir()
	{
		System.out.println("\nNome: "+nome+"\nIdade: "+idade+"\nConvenio: "+convenio+"\nNumero de Registro: "+numeroRegistro);
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

	public String getConvenio() {
		return convenio;
	}

	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}

	public int getNumeroRegistro() {
		return numeroRegistro;
	}

	public void setNumeroRegistro(int numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}
	
	
	
	

}
