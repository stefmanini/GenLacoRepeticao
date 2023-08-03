package JavaS;

import java.util.Scanner;

public class LacoRepeticaoDoW5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Escreva um algoritmo em Java, que leia números inteiros via teclado, até que
		// o
		// número zero seja digitado. Ao final, mostre na tela a soma de todos os
		// números
		// digitados, que sejam positivos.

		Scanner leia = new Scanner(System.in);

		int numero = 0, soma = 0;

		do {
			System.out.println("\nDigite um número: ");
			numero = leia.nextInt();

			if (numero >= 0) {
				soma += numero;

			}
		} while (numero != 0);
		System.out.println("\nO valor total da soma foi: " + soma);
		leia.close();
	}
}
