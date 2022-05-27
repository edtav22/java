package fundamentos;

public class ConversaoTiposPrimitivosNumericos {
	
	public static void main(String[] args) {
		
		//convertendo de double para inteiro
		double a = 1; //conversão implicita
		System.out.println(a);
		
		
		//convertendo de float para double, mais se colocar muitos numeros pode perder informação.
		float b = (float) 1.123456; //conversão explicita(CAST)
		System.out.println(b);
		
		int c = 127;
		byte d = (byte) c; // conversão explicita (CAST)
		System.out.println(d);
		
		double e = 1;
		int f = (int) e;
		System.out.println(f);
		
		
	}
	

}
