package ExerciciosPOO;

public class ContaBancaria {
	
	private String nomeBanco;
	private String numAgencia;
	private String numConta;
	
	public ContaBancaria(String nomeBanco,String numAgencia, String numConta)
	{
		this.nomeBanco = nomeBanco;
		this.numAgencia = numAgencia;
		this.numConta = numConta;
	}
	
	public void imprimir()
	{
		System.out.println("Banco: "+nomeBanco+"\nAgência: "+numAgencia+"\nConta Bancária: "+numConta);
	}

	public String getNomeBanco() {
		return nomeBanco;
	}

	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}

	public String getNumAgencia() {
		return numAgencia;
	}

	public void setNumAgencia(String numAgencia) {
		this.numAgencia = numAgencia;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	
	
}
