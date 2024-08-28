package exercicios;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Ajustando Locale 
		Locale.setDefault(Locale.US);
		// Iniciando scanner
		Scanner sc = new Scanner(System.in);
		
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
