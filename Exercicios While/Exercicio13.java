package exercicios;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Ajustando Locale 
		Locale.setDefault(Locale.US);
		// Iniciando scanner
		Scanner sc = new Scanner(System.in);
		
		// Vari�veis
		int numerosInseridos = 0;
		double numero, soma = 0, media;
		
		// Coleta primeiro n�mero
		System.out.print("Digite o primeiro n�mero (0 para finalizar): ");
		numero = Double.parseDouble(sc.nextLine());
		
		while (numero != 0) {
			soma += numero;
			
			numerosInseridos++;
			
			// Pede pr�ximo n�mero
			System.out.print("Digite o pr�ximo n�mero (0 para finalizar): ");
			numero = Double.parseDouble(sc.nextLine());
		};
		
		media = soma/numerosInseridos;
		
		// Exibe a soma e m�dia dos n�meros
		System.out.println(String.format("Foram inseridos %d n�meros, e a m�dia � aprox. %.2f", numerosInseridos, media));
	}

}
