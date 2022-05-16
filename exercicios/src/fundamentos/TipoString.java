package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		
		System.out.println("Ola pessoal".charAt(2));
		
		//não conseguimos modificar o valor oiginal de uma string
		String s = "Boa tarde";
		s = s.toUpperCase();
		//adiciono os pontos de exclamação
		System.out.println(s.concat("!!!!"));
		//adiciono os pontos de exclamção
		System.out.println(s + "!!!!");
		//deixo todas as letras em minusculo
		System.out.println(s.toLowerCase().startsWith("boa"));
		//digo quantos caracteres tem minha palavra ou frase
		System.out.println(s.length());
		//deixo tudo em maiuscula
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		//comparo se esta igual ao que tem na variavel s
		System.out.println(s.equals("boa tarde"));
		//ignoro e deixo passar mesmo não sendoi igual o que tenho  na variavel s
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "pedro";
		var sobrenome = "santos";
		var idade = 33;
		var salario = 123456.123456;
		//\n para quebra de linha
		System.out.println("Nome: " + nome + " \nSobrenome: " + sobrenome + "\nIdade: " + idade + " \nSalario: " + salario);
		//%S coloca meu nome em maiusculo e separado como no exemplo abaixo
		//%D subistitui valores inteiros, %F substitui floats e 
		//colocando assim %2f define quantas casas decimais eu quero que apareca a virgula 
		System.out.printf("Nome: %s %s tem %d anos e ganha %.2f", nome, sobrenome, idade, salario);
		//ficou da mesma forma da de cima
		String frase = String.format("\nNome: %s %s tem %d anos e ganha %.2f", nome, sobrenome, idade, salario);
		System.out.println(frase);
		//ver se contem a palavra qual
		System.out.println("frase qualquer".contains("qual"));
		//achar a palavra quye esta no espaço 6
		System.out.println("frase qualquer".indexOf(6));
		//começa a escrever atraves do espaço 6
		System.out.println("frase qualquer".substring(6));
		//escrever a aprtir da parte 6 e terminar na 10
		System.out.println("frase qualquer".substring(6, 10));
	}

}
