package exercicioswhile;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {
	// Faça um programa que leia 5 números e informe a soma e a média dos números. 
	
	public static void main(String[] args) {
		// Inicia scanner como recurso
		// Quando o programa acaba, o recurso é fechado
		try (Scanner sc = new Scanner(System.in);) {
			// Ajustando Locale
			Locale.setDefault(Locale.US);

			// Variáveis
			int i = 1;
			double numero, soma = 0, media;

			do {
				// Entrada de dados
				System.out.print("Digite o próximo número: ");
				numero = Double.parseDouble(sc.nextLine());
				soma += numero;

				i++;
			} while (i <= 5);

			media = soma / 5;

			// Exibe a soma e média dos números
			System.out
					.println(String.format("A soma dos números digitados é %.2f e a média é aprox. %.2f", soma, media));
		}
	}

}
