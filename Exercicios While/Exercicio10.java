package exercicios;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Ajustando Locale 
		Locale.setDefault(Locale.US);
		// Iniciando scanner
		Scanner sc = new Scanner(System.in);
		
		// Vari�veis
		int i, numero1, numero2;
		
		// Entrada de dados
		System.out.print("Insira o primeiro n�mero: ");
		numero1 = Integer.parseInt(sc.nextLine());
		System.out.print("Insira o segundo n�mero: ");
		numero2 = Integer.parseInt(sc.nextLine());
		
		// Sa�da de dados
		System.out.println("Os n�meros entre " + numero1 + " e " + numero2 + "s�o:");
		
		// Muda como os n�meros s�o exibidos, dependendo se numero1 � maior ou menor que numero2
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
