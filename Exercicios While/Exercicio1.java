package exercicios;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Ajustando Locale 
		Locale.setDefault(Locale.US);
		// Iniciando scanner
		Scanner sc = new Scanner(System.in);
		
		// Vari�veis
		double nota;
		
		
		do {
			// Entrada de dados
			System.out.print("Insira uma nota: ");
			nota = Double.parseDouble(sc.nextLine());
			
			// Se nota n�o estiver entre 0 e 10, exibe uma mensagem
			if (nota < 0 || nota > 10) {
				System.out.println("Nota inv�lida!");
				System.out.println();
			}
		} while (nota < 0 || nota > 10); // Repete entrada de dados at� a nota estar entre 0 e 10, inclusivo
		
		// Sinalizando fim do programa
		System.out.println("FIM");
	}

}