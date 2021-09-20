package ExerciciosPOO;

import java.text.NumberFormat;

public class Aviao {
	
	private String modelo;
	private int velocidadeMaxima;
	private int numeroMaximoPassageiros;
	private long preco;
	
	public Aviao(String modelo, int vm, int mxp, long preco)
	{
		this.modelo = modelo;
		this.velocidadeMaxima = vm;
		this.numeroMaximoPassageiros = mxp;
		this.preco = preco;
	}

	public String formatarMoeda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();//formata na moeda do pais
		nf.setMinimumFractionDigits(2); // indica a quantidade de digitos que terão depois da virgula
		String formatoMoeda = nf.format(preco);//formatação de saida moeda
		return formatoMoeda;
	}
	
	public void imprimirVal()
	{
		System.out.println("\nModelo: "+modelo+"\nVelocidade Máxima: "+velocidadeMaxima+" mil km"+"\nNúmero Máximo de Passageiros: "
		+numeroMaximoPassageiros+" passageiros"+"\nPreço-base: "+this.formatarMoeda());
		
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public int getNumeroMaximoPassageiros() {
		return numeroMaximoPassageiros;
	}

	public void setNumeroMaximoPassageiros(int numeroMaximoPassageiros) {
		this.numeroMaximoPassageiros = numeroMaximoPassageiros;
	}
	
	public long getPreço() {
		return preco;
	}

	public void setPreço(long preco) {
		this.preco = preco;
	}


}
