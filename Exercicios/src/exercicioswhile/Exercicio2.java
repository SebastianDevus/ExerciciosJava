package exercicioswhile;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
	// Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha 
	// igual  ao nome do usuário, mostrando uma mensagem de  erro e voltando  a pedir as 
	// informações. 
	
	public static void main(String[] args) {
		// Inicia scanner como recurso
		// Quando o programa acaba, o recurso é fechado
		try (Scanner sc = new Scanner(System.in);) {
			// Ajustando Locale
			Locale.setDefault(Locale.US);

			// Variáveis
			String nomeDeUsuario, senha;

			do {
				// Entrada de dados
				System.out.print("Insira um nome de usuário: ");
				nomeDeUsuario = sc.nextLine();
				System.out.print("Insira uma senha: ");
				senha = sc.nextLine();

				// Caso usuario e senha forem iguais, mostra mensagem de erro e se mant�m no
				// while
				if (nomeDeUsuario.equals(senha)) {
					System.out.println("Usuário e senha não podem ser iguais!");
					System.out.println();
				}
			} while (nomeDeUsuario.equals(senha));

			// Sinalizando fim do programa
			System.out.println("FIM");
		}
	}

}
