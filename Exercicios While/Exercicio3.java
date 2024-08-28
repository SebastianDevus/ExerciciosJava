package exercicios;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Ajustando Locale 
		Locale.setDefault(Locale.US);
		// Iniciando scanner
		Scanner sc = new Scanner(System.in);
		
		// Variáveis
		String nome, sexo, estadoCivil;
		int idade;
		double salario;
		boolean dadosInvalidos;
		
		do {
			// Reseta o valor de dadosInvalidos para false
			dadosInvalidos = false;
			
			// Entrada de dados
			System.out.println("Insira seus dados");
			
			System.out.print("Nome: ");
			nome = sc.nextLine();
			
			System.out.print("Idade: ");
			idade = Integer.parseInt(sc.nextLine());
			
			System.out.print("Salario: ");
			salario = Double.parseDouble(sc.nextLine());
			
			System.out.print("Sexo: ");
			sexo = sc.nextLine();
			
			System.out.print("Estado civil: ");
			estadoCivil = sc.nextLine();
			
			// Caso qualquer dado for inválido, dadosInvalidos se torna true
			// Isso causa que o while continue
			if (idade < 0 || idade > 150) {
				System.out.println("A idade deve estar entre 0 e 150");
				dadosInvalidos = true;
			}
			if (salario < 0) {
				System.out.println("O salário deve ser maior que 0");
				dadosInvalidos = true;
			}
			if (!sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("f")) {
				System.out.println("O sexo deve ser m (masculino) ou f (feminino)");
				dadosInvalidos = true;
			}
			if (!estadoCivil.equalsIgnoreCase("s") && !estadoCivil.equalsIgnoreCase("c") && 
					!estadoCivil.equalsIgnoreCase("v") && !estadoCivil.equalsIgnoreCase("d")) {
				System.out.println("O estado civil deve ser s (solteiro), c (casado), v (viúvo) ou d (divorciado)");
				dadosInvalidos = true;
			}
		} while (dadosInvalidos); // Se nenhum dado for invalido, dadosInvalidos é false e o laço finaliza
		
		// Sinalizando fim do programa
		System.out.println("FIM");
	}

}
