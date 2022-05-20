package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		//print mantem na mesma linha
		System.out.print("bom");
		System.out.print(" dia \n");
		//print quebra a linha 
		System.out.println(" Bom");
		System.out.println(" dia");
		
		//print formatado
		System.out.printf("Mensasgem %d %d %d %d %d %d", 1,2,3,4,5,6);
		//define quantas casas decimais meu salario vai ficar
		System.out.printf(" Salario: %.3f", 12354.456465);
		//print com string
		System.out.printf("Nome: %s%n", "Joao");
		
		//minha entrada que sera digitada pelo teclado 
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("digite o seu Sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("digite o seu idade: ");
		int idade = entrada.nextInt();
		
		
		System.out.printf("%s %s tem %d anos. %n", nome, sobrenome, idade);
		
		entrada.close();
		
		
		
		
		
	}
	
}
