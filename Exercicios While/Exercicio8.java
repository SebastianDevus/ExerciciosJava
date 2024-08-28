package exercicios;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Ajustando Locale 
		Locale.setDefault(Locale.US);
		// Iniciando scanner
		Scanner sc = new Scanner(System.in);
		
		// Vari�veis
		int i = 1;
		double numero, soma = 0,media ;
		
		do {
			// Entrada de dados
			System.out.print("Digite o pr�ximo n�mero: ");
			numero = Double.parseDouble(sc.nextLine());
			soma += numero;
			
			i++;
		} while (i <= 5);
		
		media = soma/5;
		
		// Exibe a soma e m�dia dos n�meros
		System.out.println(String.format("A soma dos n�meros digitados � %.2f e a m�dia � aprox. %.2f", soma, media));
	}

}
