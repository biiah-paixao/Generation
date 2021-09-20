package ExerciciosPOO;

import java.text.NumberFormat;

public class Funcionario {
	
	private String nome;
	private String cpf;
	private String funcao;
	public double salario;
	
	public Funcionario(String nome, String cpf, String funcao, double salario)
	{
		this.nome = nome;
		this.cpf = cpf;
		this.funcao = funcao;
		this.salario = salario;
	}
	
	public String formatarMoeda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(salario);
		return formatoMoeda;
	}
	
	public void imprimir()
	{
		System.out.println("\nNome: "+nome+"\nCPF: "+cpf+"\nFunção: "+funcao+"\nSalario: "+ this.formatarMoeda());
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

}
