package exercicioswhile;
import java.util.Locale;

public class Exercicio4 {
	// Supondo que a população de um país A seja da ordem de 80000 habitantes com uma 
	// taxa anual de crescimento de 3% e que a população de B seja 200000 habitantes com 
	// uma taxa de crescimento de 1.5%. Faça um programa que calcule e escreva o número 
	// de anos necessários para que a população do país A ultrapasse ou iguale a população 
	// do país B, mantidas as taxas de crescimento. 

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
