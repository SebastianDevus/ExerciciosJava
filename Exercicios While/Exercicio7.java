package exercicios;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Ajustando Locale 
		Locale.setDefault(Locale.US);
		// Iniciando scanner
		Scanner sc = new Scanner(System.in);
		
		// Vari�veis
		int i = 1, numero, maior;
		
		// Coletando o primeiro n�mero
		System.out.print("Digite o primeiro n�mero: ");
		numero = Integer.parseInt(sc.nextLine());
		maior = numero;
		
		// Coleta os pr�ximos 4 n�meros
		do {
			// Entrada de dados
			System.out.print("Digite o pr�ximo n�mero: ");
			numero = Integer.parseInt(sc.nextLine());

			if (numero > maior) {
				maior = numero;
			}
			i++;
		} while (i <= 4);
		
		// Exibe o maior n�mero entre os digitados
		System.out.println("O maior n�mero entre os digitados �: " + maior);
	}

}
