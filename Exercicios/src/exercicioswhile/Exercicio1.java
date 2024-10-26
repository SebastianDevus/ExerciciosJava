package exercicioswhile;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
	// Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso 
	// o valor seja inválido e continue pedindo até que o usuário informe um valor válido.
	
	public static void main(String[] args) {
		// Inicia scanner como recurso
		// Quando o programa acaba, o recurso é fechado
		try (Scanner sc = new Scanner(System.in);) {
			// Ajustando Locale
			Locale.setDefault(Locale.US);

			// Variáveis
			double nota;

			do {
				// Entrada de dados
				System.out.print("Insira uma nota: ");
				nota = Double.parseDouble(sc.nextLine());

				// Se nota n�o estiver entre 0 e 10, exibe uma mensagem
				if (nota < 0 || nota > 10) {
					System.out.println("Nota inválida!");
					System.out.println();
				}
			} while (nota < 0 || nota > 10); // Repete entrada de dados at� a nota estar entre 0 e 10, inclusivo

			// Sinalizando fim do programa
			System.out.println("FIM");
		}
	}

}
