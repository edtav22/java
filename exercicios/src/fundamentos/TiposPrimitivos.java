package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		
		//8 tipos primitivos temos no java 
		//representam valores numericos 
		//representam inteiros byte, short, int , long
		//byte = 1 byte = 8 bits  -128 até 127
		//short = 2 bytes = 16 bits  32.767
		//int = 4 bytes = 32 bits 2 000 000 700
		//long = 8 bytes = 64 bits 
		//float = 4 bytes = 32 bits
		//double = 8 bytes = 64 bits 
		//char = '', '?', 'a', '1'
		//boolean = true e false
		
		//informaçoes do funcionario
		//tipos numericos
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		//quando passa dos 3 bilhoes precisa coloca o L maiusculo no final.
		long pontosAcumulados = 3_234_845_223L;
		
		//tipos numericos reais
		//preciso colocar o F no final para dizer que é um float
		float salario = 11_445.45F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//tipo booleano
		boolean estaDeFerias = false; // true
		
		// tipo caractere
		char status = 'a'; //ativo
		
		//dias de empresa
		
		//dias de empresa
		System.out.println(anosDeEmpresa * 365 + " dias de empresa");
		//numero de viagens
		System.out.println(numeroDeVoos / 2);
		//pontos por real
		System.out.println(pontosAcumulados/vendasAcumuladas + " id do funcionario " + id);
		//salario
		System.out.println(salario);
		//esta de ferias
		System.out.println(estaDeFerias);
		//sistema
		System.out.println("O sistema esta " + status);
		
		
		
		
		
	}

}
