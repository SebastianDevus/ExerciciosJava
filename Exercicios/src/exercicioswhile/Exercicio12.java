package exercicioswhile;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio12 {
	// Faça um programa que implemente um menu onde o usurário deverá selecionar 1 ou 
	// 0.  Caso  seja  entrado  um  número  diferente,  o  programa  deverá  solicitar  uma  nova 
	// opção.
	 
	public static void main(String[] args) {
		// Inicia scanner como recurso
		// Quando o programa acaba, o recurso é fechado
		try (Scanner sc = new Scanner(System.in);) {
			// Ajustando Locale
			Locale.setDefault(Locale.US);

			// Variável
			int numero;

			do {
				// Entrada de dados
				System.out.print("0 ou 1? ");
				numero = Integer.parseInt(sc.nextLine());

				if (numero != 1 && numero != 0) {
					System.out.println("O número deve ser 0 ou 1!!!\n");
				}
			} while (numero != 1 && numero != 0);

			// Sinalizando fim do programa
			System.out.println("FIM");
		}
	}

}
