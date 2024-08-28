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
		
		// Variáveis
		int numerosInseridos = 0;
		double numero, soma = 0, media;
		
		// Coleta primeiro número
		System.out.print("Digite o primeiro número (0 para finalizar): ");
		numero = Double.parseDouble(sc.nextLine());
		
		while (numero != 0) {
			soma += numero;
			
			numerosInseridos++;
			
			// Pede próximo número
			System.out.print("Digite o próximo número (0 para finalizar): ");
			numero = Double.parseDouble(sc.nextLine());
		};
		
		media = soma/numerosInseridos;
		
		// Exibe a soma e média dos números
		System.out.println(String.format("Foram inseridos %d números, e a média é aprox. %.2f", numerosInseridos, media));
	}

}
