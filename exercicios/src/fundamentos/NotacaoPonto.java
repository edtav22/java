package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		//tudo que é definido em roxo são palavras reservadas da linguagem
		double a = 2.3;
		String s = "Bom dia X";
		//substituiu o x por senhora
		s = s.replace("X" , "Senhora");
		//tornou todas as letras maiusculas
		s = s.toUpperCase();
		//acrescenta !!! ao meu texto
		s = s.concat("!!!");
		
		System.out.println(s);
		
		String x = "Leo".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X".replace("X", "GUI").toUpperCase().concat("!!!");
		System.out.println(y);
		
		//Tipos primitivos nao tem o operador .
		
		int h = 3;
		System.out.println(a + h);
		
		
	}
}
