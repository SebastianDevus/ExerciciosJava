package exercicios;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Ajustando Locale 
		Locale.setDefault(Locale.US);
		// Iniciando scanner
		Scanner sc = new Scanner(System.in);
		
		// Variáveis
		String nomeDeUsuario, senha;
		
		do {
			// Entrada de dados
			System.out.print("Insira um nome de usuário: ");
			nomeDeUsuario = sc.nextLine();
			System.out.print("Insira uma senha: ");
			senha = sc.nextLine();
			
			// Caso usuario e senha forem iguais, mostra mensagem de erro e se mantém no while
			if (nomeDeUsuario.equals(senha)) {
				System.out.println("Usuário e senha não podem ser iguais!");
				System.out.println();
			}
		} while (nomeDeUsuario.equals(senha));
		
		// Sinalizando fim do programa
		System.out.println("FIM");
	}

}
