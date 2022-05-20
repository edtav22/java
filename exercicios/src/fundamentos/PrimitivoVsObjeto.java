package fundamentos;

public class PrimitivoVsObjeto {

	public static void main(String[]args) {
		
		String s = new String("texto");
		s.toUpperCase();
		
		//Wrappers são a vaersão objeto dos tipos
		//primitivos
		int a = 123;
		System.out.println(a);
		System.out.println(s);
		
	}
	
}
