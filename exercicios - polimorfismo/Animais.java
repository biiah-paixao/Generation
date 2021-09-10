package ExerciciosPolimorfismo;

public interface Animais {
	
	public String nomeInterface = "Animais";
	
	abstract public String getNome();
	abstract public void setNome(String nome);
	
	abstract public int getIdade();
	abstract public void setIdade(int idade);
	
	String getEmitirSom();
	

}
