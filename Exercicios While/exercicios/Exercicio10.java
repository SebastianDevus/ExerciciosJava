package exercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Ajustando Locale 
		Locale.setDefault(Locale.US);
		// Iniciando scanner
		Scanner sc = new Scanner(System.in);
		
		// Variáveis
		int i, numero1, numero2;
		
		// Entrada de dados
		System.out.print("Insira o primeiro número: ");
		numero1 = Integer.parseInt(sc.nextLine());
		System.out.print("Insira o segundo número: ");
		numero2 = Integer.parseInt(sc.nextLine());
		
		// Saída de dados
		System.out.println("Os números entre " + numero1 + " e " + numero2 + "s�o:");
		
		// Muda como os números são exibidos, dependendo se numero1 é maior ou menor que numero2
		if (numero1 < numero2) {
			i = numero1 + 1;
			while (i < numero2) {
				System.out.print(i + " ");
				i++;
			}
		} else {
			i = numero1 - 1;
			while (i > numero2) {
				System.out.print(i + " ");
				i--;
			}
		}
		System.out.println();
	}

}
