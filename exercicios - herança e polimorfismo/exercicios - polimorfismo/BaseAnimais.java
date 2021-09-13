package ExerciciosPolimorfismo;

public class BaseAnimais {
	
	protected String nome;
	protected int idade;
	protected String nomeClasse;
	
	BaseAnimais(String nome, int idade, String emitirSom)
	{
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome()
	{//tem na interface
		return nome;
	}
	
	public void setNome(String nome)
	{//set do getNome que está na interface
		this.nome = nome;
	}
	
	public int getIdade(){
		return idade;}
	
	public void setIdade(int idade){
		this.idade = idade;
		}
	
	public String getNomeClasse() {
		return nomeClasse;
	}

	public void setNomeClasse(String nomeClasse) {
		this.nomeClasse = nomeClasse;
	}
	
	

}
