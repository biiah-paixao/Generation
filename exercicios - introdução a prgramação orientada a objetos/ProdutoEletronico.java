package ExerciciosPOO;

import java.text.NumberFormat;

public class ProdutoEletronico {
	
	private String nome;
	private String modelo;
	private String  cor;
	private int tensao;
	private int preco;
	
	public ProdutoEletronico(String nome, String modelo, String cor, int tensao, int preco)
	{
		this.nome = nome;
		this.modelo = modelo;
		this.cor = cor;
		this.tensao = tensao;
		this.preco = preco;
	}
	
	public String formatarMoeda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(preco);
		return formatoMoeda;
	}
	
	public void imprimirDados()
	{
		System.out.println("Nome: "+nome+"\nModelo: "+modelo+"\nCor: "+cor+"\nTensão: "+tensao+"\nPreço: "+this.formatarMoeda());
	}
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getTensao() {
		return tensao;
	}

	public void setTensao(int tensao) {
		this.tensao = tensao;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}
	
	
	
}
	
	
	