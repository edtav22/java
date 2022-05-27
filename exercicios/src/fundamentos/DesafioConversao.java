package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		//metodo scanner para eu digitar o que quero
		Scanner entrada = new Scanner(System.in);
		//variveis criadas como strings		
		String sal1;
		String sal2;
		String sal3;
		//aqui sera onde o programa ira receber o valor da variavel pelo teclado
		System.out.println("Digite o salario do primeiro funcionario: ");
		sal1 = entrada.nextLine().replace(",", "."); //para mudar de , para o .
		//aqui sera onde o programa ira receber o valor da variavel pelo teclado
		System.out.println("Digite o salario do segundo funcionario: ");
		sal2 = entrada.nextLine().replace(",", "."); //para mudar de , para o .
		//aqui sera onde o programa ira receber o valor da variavel pelo teclado
		System.out.println("Digite o salario do terceiro funcionario: ");
		sal3 = entrada.nextLine().replace(",", "."); //para mudar de , para o .
		//aqui será minha conversão de string para numero
		double salFunc1 = Double.parseDouble(sal1);
		double salFunc2 = Double.parseDouble(sal2);
		double salFunc3 = Double.parseDouble(sal3);
		//aqui sera o calculo pedido no desafio
		double soma = salFunc1 + salFunc2 + salFunc3;
		System.out.println("A soma dos Salrios é: " + soma);
		System.out.println("A media salarial é:" + soma / 3);
		
		entrada.close();
	}


}

