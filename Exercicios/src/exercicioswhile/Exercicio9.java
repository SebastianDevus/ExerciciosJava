package exercicioswhile;
import java.util.Locale;

public class Exercicio9 {
	// Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.
	
	public static void main(String[] args) {
		// Ajustando Locale
		Locale.setDefault(Locale.US);
		
		// Variável
		int i = 1;
		
		while (i <= 50) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
			i++;
		}
	}

}
