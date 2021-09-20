package ExerciciosPOO;

import java.text.NumberFormat;

public class Cliente {
	
	private String nome;
	private int idade;
	private String cidade;
	private double orcamento;
	
	public Cliente(String nome, int idade, String cidade, double orcamento)
	{
		this.nome = nome;
		this.idade = idade;
		this.cidade = cidade;
		this.orcamento = orcamento;
	}
	
	public String formatarMoeda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumIntegerDigits(2);
		String formatoMoeda = nf.format(orcamento);
		return formatoMoeda;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nNome: "+nome+"\nIdade: "+idade+" anos"+"\nCidade: "+cidade+"\nOrçamento: "+ this.formatarMoeda());
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

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public double getOrcamento() {
		return orcamento;
	}

	public void setOrçamento(double orcamento) {
		this.orcamento = orcamento;
	}
	
	
	

}
