package exercicioswhile;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio13 {
	// Faça  um  programa  que  leia  número  reais  maiores  que  zero.  Quando  for  entrado  o 
	// número  zero,  o  programa  deverá  apresentar  quantos  números  foram  entrados  e  a 
	// média destes.
	public static void main(String[] args) {
		// Inicia scanner como recurso
		// Quando o programa acaba, o recurso é fechado
		try (Scanner sc = new Scanner(System.in);) {
			// Ajustando Locale
			Locale.setDefault(Locale.US);

			// Variáveis
			int numerosInseridos = 0;
			double numero, soma = 0, media;

			// Entrada de dados
			System.out.print("Digite o primeiro número (0 para finalizar): ");
			numero = Double.parseDouble(sc.nextLine());

			while (numero != 0) {
				soma += numero;

				numerosInseridos++;

				System.out.print("Digite o próximo número (0 para finalizar): ");
				numero = Double.parseDouble(sc.nextLine());
			}

			media = soma / numerosInseridos;

			// Exibe a soma e média dos números
			System.out.println(
					String.format("Foram inseridos %d números, e a média é aprox. %.2f", numerosInseridos, media));
		}
	}

}
