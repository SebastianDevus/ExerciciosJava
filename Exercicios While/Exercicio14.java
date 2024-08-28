package exercicios;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Ajustando Locale 
		Locale.setDefault(Locale.US);
		// Iniciando scanner
		Scanner sc = new Scanner(System.in);
		
		int senha;
		final int senhaCorreta = 1009;
		
		do {
			// Entrada de dados
			System.out.print("Insira a senha: ");
			senha = Integer.parseInt(sc.nextLine());
			
			// Se a senha inserida for incorreta, avisa usuário
			// if (senha > 1000) {
			if (senha != senhaCorreta) {
				System.out.println("Senha Incorreta \n");
			}
		// } while (senha > 1000);
		} while (senha != senhaCorreta); // Se a senha for incorreta, volta ao começo do laço
		
		// Se a senha for correta, avisa usuário e acaba programa
		System.out.println("Senha Correta");
	}

}
