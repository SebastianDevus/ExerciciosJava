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
		
		// Vari�veis
		String nomeDeUsuario, senha;
		
		do {
			// Entrada de dados
			System.out.print("Insira um nome de usu�rio: ");
			nomeDeUsuario = sc.nextLine();
			System.out.print("Insira uma senha: ");
			senha = sc.nextLine();
			
			// Caso usuario e senha forem iguais, mostra mensagem de erro e se mant�m no while
			if (nomeDeUsuario.equals(senha)) {
				System.out.println("Usu�rio e senha n�o podem ser iguais!");
				System.out.println();
			}
		} while (nomeDeUsuario.equals(senha));
		
		// Sinalizando fim do programa
		System.out.println("FIM");
	}

}
