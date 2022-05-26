package cursodiobasico;

public class Sobrecarga {
	
	public static void main(String[] args) {
		
		//quadrilatero
		System.out.println("Exercicio quadrilatero");
		Quadrilatero.area(3);
		Quadrilatero.area(5d, 5d);
		Quadrilatero.area(7, 8, 9);
		Quadrilatero.area(9f, 9f);
	}
	
}
