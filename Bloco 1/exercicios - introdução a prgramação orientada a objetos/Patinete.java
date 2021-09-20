package ExerciciosPOO;

public class Patinete {
	
	private String nome;
	private String modelo;
	private String cor;
	private int velocidadeMax; 
	private int potencia;
	
	public Patinete(String nome,String modelo, String cor, int velocidadeMax, int potencia)
	{
		this.nome = nome;
		this.modelo = modelo;
		this.cor = cor;
		this.velocidadeMax = velocidadeMax;
		this.potencia = potencia;
	}
	
	public void imprimir()
	{
		System.out.println("\nNome:"+nome+"\nModelo: "+modelo+"\nCor: "+cor+"\nVelocidade Máxima: "+velocidadeMax+"km/h \nPotencia: "+potencia+"W");
	}

	public String getMarca() {
		return nome;
	}

	public void setMarca(String marca) {
		this.nome = marca;
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

	public int getVelocidadeMax() {
		return velocidadeMax;
	}

	public void setVelocidadeMax(int velocidadeMax) {
		this.velocidadeMax = velocidadeMax;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	
	
	

}
