package exercicioswhile;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Inicia scanner como recurso
		// Quando o programa acaba, o recurso é fechado
		try (Scanner sc = new Scanner(System.in);) {
			// Ajustando Locale
			Locale.setDefault(Locale.US);

			// Variáveis
			int senha;
			final int senhaCorreta = 1009;

			do {
				// Entrada de dados
				System.out.print("Insira a senha: ");
				senha = Integer.parseInt(sc.nextLine());

				// Se a senha inserida for incorreta, avisa usuário
				if (senha != senhaCorreta) {
					System.out.println("Senha Incorreta \n");
				}
			} while (senha != senhaCorreta); // Se a senha for incorreta, volta ao começo do laço

			// Se a senha for correta, avisa usuário e acaba programa
			System.out.println("Senha Correta");
		}
	}

}
