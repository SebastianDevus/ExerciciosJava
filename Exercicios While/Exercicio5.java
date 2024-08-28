package exercicios;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Ajustando Locale 
		Locale.setDefault(Locale.US);
		// Iniciando scanner
		Scanner sc = new Scanner(System.in);
		
		// Vari�veis
		int anos = 0;
		double populacaoA, populacaoB, taxaA, taxaB;
		boolean dadosInvalidos;
		
		// Entrada de dados
		do {
			// Reseta o valor de dadosInvalidos para false
			dadosInvalidos = false;
			
			// Entrada de dados
			System.out.print("Insira a popula��o da cidade A: ");
			populacaoA = Double.parseDouble(sc.nextLine());
			System.out.print("Insira a taxa de crescimento da cidade A, em %: ");
			taxaA = Double.parseDouble(sc.nextLine());
			
			System.out.print("Insira a popula��o da cidade B: ");
			populacaoB = Double.parseDouble(sc.nextLine());
			System.out.print("Insira a taxa de crescimento da cidade B, em %: ");
			taxaB = Double.parseDouble(sc.nextLine());
			
			// Verificando valide dos dados
			if (populacaoA <= 0 || populacaoB <= 0) {
				System.out.println("A popula��o das duas cidades deve ser maior que 0");
				dadosInvalidos = true;
			}
			if (populacaoA >= populacaoB) {
				System.out.println("A popula��o da cidade A deve ser menor que a da cidade B");
				dadosInvalidos = true;
			}
		} while (dadosInvalidos); // Se nenhum dado for invalido, dadosInvalidos � false e o la�o finaliza

		// Transformando as taxas em um formato mais us�vel
		taxaA = taxaA/100 + 1; // ex: 1% -> 1.01
		taxaB = taxaB/100 + 1;
		
		
		// Calculando quantos anos para que populacaoA >= populacaoB
		while (populacaoA < populacaoB) {
			populacaoA *= taxaA;
			populacaoB *= taxaB;
			
			anos++;
		};
		
		// Exibe resultado
		System.out.println("A popula��o da cidade A ultrapassa ou iguala a da cidade B em " + anos + " anos");
	}

}
