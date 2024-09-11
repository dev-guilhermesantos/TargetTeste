package target_desafio;

import java.util.Scanner;

public class DesafioFIbonacci {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe um número para verificar se pertence à sequência de Fibonacci: ");
		int numero = scanner.nextInt();

		int a = 0, b = 1, fibonacci = 0;

		if (numero == 0 || numero == 1) {
			System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
		} else {

			while (fibonacci < numero) {
				fibonacci = a + b;
				a = b;
				b = fibonacci;
			}

			if (fibonacci == numero) {
				System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
			} else {
				System.out.println("O número " + numero + " NÃO pertence à sequência de Fibonacci.");
			}
		}

		scanner.close();

	}

}
