package JavaS;

import java.util.Scanner;

public class LacoRepeticaoFOR2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Escreva um algoritmo em Java, que leia 10 números inteiros via teclado e
		// mostre na
		// tela quantos números são pares e quantos número são ímpares
		int[] quantidadeNumeros = new int[10];
		int numerosPares = 0;
		int numerosImpares = 0;

		Scanner leia = new Scanner(System.in);

		System.out.println("\nDigite o primeiro número: ");
		quantidadeNumeros[0] = leia.nextInt();
		System.out.println("\nDigite o segundo número: ");
		quantidadeNumeros[1] = leia.nextInt();
		System.out.println("\nDigite o terceiro número: ");
		quantidadeNumeros[2] = leia.nextInt();
		System.out.println("\nDigite o quarto número: ");
		quantidadeNumeros[3] = leia.nextInt();
		System.out.println("\nDigite o quinto número: ");
		quantidadeNumeros[4] = leia.nextInt();
		System.out.println("\nDigite o sexto número: ");
		quantidadeNumeros[5] = leia.nextInt();
		System.out.println("\nDigite o sétimo número: ");
		quantidadeNumeros[6] = leia.nextInt();
		System.out.println("\nDigite o oitavo número: ");
		quantidadeNumeros[7] = leia.nextInt();
		System.out.println("\nDigite o nono número: ");
		quantidadeNumeros[8] = leia.nextInt();
		System.out.println("\nDigite o décimo número: ");
		quantidadeNumeros[9] = leia.nextInt();

		for (int i = 0; i < quantidadeNumeros.length; i++) {
			if (quantidadeNumeros[i] % 2 == 0) {
				numerosPares++;

			} else {
				numerosImpares++;

			}
		}
		System.out.println("Total de números pares: " + numerosPares);
		System.out.println("Total de números ímpares: " + numerosImpares);
		leia.close();
	}

}
