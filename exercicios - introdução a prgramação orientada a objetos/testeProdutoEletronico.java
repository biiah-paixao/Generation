package ExerciciosPOO;

public class testeProdutoEletronico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProdutoEletronico prod1 = new ProdutoEletronico("Ventilador","Arno Eole Infinite","Preto",220,470);
		prod1.imprimirDados();
		
		System.out.println("\n**************************************************");
		
		ProdutoEletronico prod2 = new ProdutoEletronico("Smart TV","LG OLED CX","Preto",220,8000);
		prod2.imprimirDados();
		
		

	}

}
