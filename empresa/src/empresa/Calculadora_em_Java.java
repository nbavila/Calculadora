package empresa;

import java.util.Scanner;

public class Calculadora_em_Java {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		int x = teclado.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		int y = teclado.nextInt();
		
		System.out.print("Escolha a opcao aritimetica: ");
		String opcao = teclado.next();
		
		if (opcao.equals("+")) {
			int soma = x + y;
			System.out.print("Resultado: "+ soma);
		}
		
		else if (opcao.equals("-")) {
			int soma = x - y;
			System.out.print("Resultado: "+ soma);
		}

		else if (opcao.equals("*")) {
			int soma = x * y;
			System.out.print("Resultado: "+ soma);
		}

		else if (opcao.equals("/")) {
			int soma = x / y;
			System.out.print("Resultado: "+ soma);
		}

	}

}
