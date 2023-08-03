package JavaS;

import java.util.Scanner;

public class LacoRepeticaoFOR1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub10
		// Escreva um algoritmo em Java, que leia 2 números inteiros via teclado, onde o
		// primeiro número deve ser menor do que o segundo número. Caso contrário, deve
		// ser
		// exibida uma mensagem na tela informando que o intervalo é inválido e sair do
		// programa. Dentro do intervalo informado, mostre na tela todes os números que
		// são
		// múltiplos de 3 e 5.

		int[] numeros = new int[2];

		Scanner leia = new Scanner(System.in);

		for (int i = 0; i < 2; i++) {
			System.out.println("\nDigite um número : ");
			numeros[i] = leia.nextInt();

		}
		if (numeros[0] >= numeros[1]) {
			System.out.println("\nO intervalo é inválido.");
			leia.close();
			System.exit(0);
		}
		System.out.println("\nNo Intervalo entre " + numeros[0] + " e " + numeros[1] + ":");

		for (int i = numeros[0]; i <= numeros[1]; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + " é mútiplo de 3 e 5.");
			}
			leia.close();
		}
	}
}