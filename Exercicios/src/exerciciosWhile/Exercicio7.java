package exerciciosWhile;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Ajustando Locale 
		Locale.setDefault(Locale.US);
		// Iniciando scanner
		Scanner sc = new Scanner(System.in);
		
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
