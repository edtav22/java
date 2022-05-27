package fundamentos;

public class ConversaoNumeroParaString {

	public static void main(String[] args) {
		
		//convertendo numeros para string exemplos
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		
		int num2 = 100000;
		System.out.println(Integer.toString(num2));
		
		//outra forma de fazer a conversão de numero para string
		System.out.println(("" + num1).length());
		System.out.println(("" + num2).length());
	}
	
}
