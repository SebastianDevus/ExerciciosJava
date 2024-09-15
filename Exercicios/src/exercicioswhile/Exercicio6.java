package exercicioswhile;
import java.util.Locale;

public class Exercicio6 {
	// Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro. 
	// Depois modifique o programa para que ele mostre os números um ao lado do outro.

	public static void main(String[] args) {
		// Ajustando Locale 
		Locale.setDefault(Locale.US);
		
		// Variável
		int i = 1;
		
		// Exibe números de 1 a 20, um abaixo do outro
		while (i <= 20) {
			System.out.println(i);
			i++;
		}
		
		// Resetando i
		i = 1;
		
		// Exibe números de 1 a 20, um do lado do outro
		while (i <= 20) {
			System.out.print(i + " ");
			i++;
		}
	}

}
