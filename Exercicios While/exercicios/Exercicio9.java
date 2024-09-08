package exercicios;
import java.util.Locale;

public class Exercicio9 {

	/**
	 * @param args
	 */
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
