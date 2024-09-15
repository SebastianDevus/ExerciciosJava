package exercicioswhile;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {
	// Faça um programa que leia 5 números e informe o maior número. 
	
	public static void main(String[] args) {
		// Inicia scanner como recurso
		// Quando o programa acaba, o recurso é fechado
		try (Scanner sc = new Scanner(System.in);) {
			// Ajustando Locale
			Locale.setDefault(Locale.US);

			// Variáveis
			int i = 1, numero, maior;

			// Coletando o primeiro número
			System.out.print("Digite o primeiro número: ");
			numero = Integer.parseInt(sc.nextLine());
			maior = numero;

			// Coleta os próximos 4 números
			do {
				// Entrada de dados
				System.out.print("Digite o próximo número: ");
				numero = Integer.parseInt(sc.nextLine());

				if (numero > maior) {
					maior = numero;
				}
				i++;
			} while (i <= 4);

			// Exibe o maior número entre os digitados
			System.out.println("O maior número entre os digitados é: " + maior);
		}
	}
	
}
