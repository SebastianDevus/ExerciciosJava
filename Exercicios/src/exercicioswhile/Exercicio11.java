package exercicioswhile;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio11 {
	// Altere o programa anterior para mostrar no final a soma dos números. 
	
	public static void main(String[] args) {
		// Inicia scanner como recurso
		// Quando o programa acaba, o recurso é fechado
		try (Scanner sc = new Scanner(System.in);) {
			// Ajustando Locale
			Locale.setDefault(Locale.US);

			// Variáveis
			int i, numero1, numero2, soma = 0;

			// Entrada de dados
			System.out.print("Insira o primeiro número: ");
			numero1 = Integer.parseInt(sc.nextLine());
			System.out.print("Insira o segundo número: ");
			numero2 = Integer.parseInt(sc.nextLine());

			// Sa�da de dados

			System.out.println("Os números entre " + numero1 + " e " + numero2 + "s�o:");

			// Muda como os números são exibidos, dependendo se numero1 é maior ou menor que
			// numero2
			if (numero1 < numero2) {
				i = numero1 + 1;
				while (i < numero2) {
					System.out.print(i + " ");
					soma += i;
					i++;
				}
			} else {
				i = numero1 - 1;
				while (i > numero2) {
					System.out.print(i + " ");
					soma += i;
					i--;
				}
			}
			System.out.println("\nE a soma deles é igual a " + soma);
		}
	}

}