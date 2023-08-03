package JavaS;

import java.util.Scanner;

public class LacoRepeticaoWHILE3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		// Escreva um algoritmo em Java, que leia a idade de várias pessoas (números
		// inteiros), via teclado e mostre na tela o total de pessoas cuja idade seja
		// menor que 21 anos e o total de pessoas cuja idade seja maior que 50 anos. A
		// leitura dos dados deve ser finalizada ao digitar uma idade negativa
		Scanner leia = new Scanner(System.in);
		int idade = 0, menor = 0, maior = 0;

		while (idade >= 0) {
			System.out.println("\nDigite a sua idade: ");
			idade = leia.nextInt();

			if (idade >= 0 && idade < 21) {
				menor++;
			} else if (idade > 50) {
				maior++;
			}
		}
		System.out.println("Total de pessoas menores de 21 anos: " + menor);
		System.out.println("Total de pessoas maiores de 50 anos: " + maior);
		leia.close();
	}
}
