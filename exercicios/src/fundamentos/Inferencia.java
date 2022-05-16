package fundamentos;

public class Inferencia {

	public static void main(String[] args) {
		
		double a = 4.5; //declaracao e inicializacao
		System.out.println(a); 
		
		//posso colocar so var que o propio programa ira identificar qual o tipo de variavel
		var b = 4.5;
		System.out.println(b);
		
		//posso mudar a variavel so se for do mesmo tipo
		var c = "texto";
		System.out.println(c);
		c = "outro texto";
		System.out.println(c);
		
		double d; //variavel foi declarada
		d = 123.65; //variavel foi inicializada
		System.out.println(d); //variavel foi usada
		
		/*isso eu não posso fazer pois ele precisa reconhecer o tipo de variavel na primeira linha.
		var e;
		e = 123.05;
		*/
	}
}
