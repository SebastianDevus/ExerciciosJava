package exercicioswhile;
import java.util.Locale;

public class Exercicio4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Ajustando Locale 
		Locale.setDefault(Locale.US);

		
		// Variáveis
		int anos = 0;
		double populacaoA = 80000, populacaoB = 200000;
		
		// Calculando quantos anos para que populacaoA >= populacaoB
		while (populacaoA < populacaoB) {
			populacaoA *= 1.030;
			populacaoB *= 1.015;
			
			anos++;
		}
		
		// Exibe resultado
		System.out.println("A população da cidade A ultrapassa ou iguala a da cidade B em " + anos + " anos");
	}

}
