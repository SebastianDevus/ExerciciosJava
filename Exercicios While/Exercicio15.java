package exercicios;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Ajustando Locale 
		Locale.setDefault(Locale.US);
		// Iniciando scanner
		Scanner sc = new Scanner(System.in);
		
		// Variáveis
		int votosSpiderman = 0, votosSuperman = 0, votosWonderWoman = 0, votosIronMan = 0, 
		votosCaptainAmerica = 0, votosNulos = 0, votosBrancos = 0, votoAtual, votosVencedor;
		double votosTotais = 0;
		String vencedor;
		
		do {
			// Entrada de dados
			System.out.println("As opção são:");
			System.out.println("1. Spiderman");
			System.out.println("2. Superman");
			System.out.println("3. Wonder Woman");
			System.out.println("4. Iron Man");
			System.out.println("5. Captain America");
			System.out.println("6. Nulo");
			System.out.println("7. Branco");
			System.out.print("\nEntre com o seu voto: ");
			votoAtual = Integer.parseInt(sc.nextLine());
			
			// Verificando o voto, e adicionando-o ao candidato escolhido
			switch (votoAtual) {
			case 1:
				votosSpiderman++;
				break;
			case 2:
				votosSuperman++;
				break;
			case 3:
				votosWonderWoman++;
				break;
			case 4:
				votosIronMan++;
				break;
			case 5:
				votosCaptainAmerica++;
				break;
			case 6:
				votosNulos++;
				break;
			case 7:
				votosBrancos++;
				break;
			case 0:
				break; // Caso o eleitor inserir 0, nada deve acontecer
			default:
				System.out.println("Voto inválido.\n");
				break;
			}
		} while(votoAtual != 0); // Quando 0 é inserido, o laço acaba e os resultados são exibidos
		
		// Soma dos votos em double para fazer porcentagem de nulos e brancos depois
		votosTotais = votosSpiderman + votosSuperman + votosWonderWoman + votosIronMan 
						+ votosCaptainAmerica + votosNulos + votosBrancos; 
		
		// Exibe os votos dos candidatos
		System.out.println("Resultados:");
		System.out.println("Spiderman - " + votosSpiderman);
		System.out.println("Superman - " + votosSuperman);
		System.out.println("Wonder Woman - " + votosWonderWoman);
		System.out.println("Iron Man - " + votosIronMan);
		System.out.println("Captain America - " + votosCaptainAmerica);
		
		// Calculando e exibindo porcentagem de votos nulos/brancos
		System.out.println(String.format("\nVotos nulos - %.2f", votosNulos/votosTotais * 100) + "%");
		System.out.println(String.format("Votos brancos - %.2f", votosBrancos/votosTotais * 100) + "%");
		
		// Descobrindo e exibindo o vencedor
		System.out.println("\nO vencedor é:...");
		if (votosSpiderman > votosSuperman && votosSpiderman > votosWonderWoman && 
				votosSpiderman > votosIronMan && votosSpiderman > votosCaptainAmerica) {
			// Spiderman maior que todos, logo ganhou
			System.out.println("Spiderman, com " + votosSpiderman + " votos!");
		} else if (votosSuperman > votosSpiderman && votosSuperman > votosWonderWoman &&
					votosSuperman > votosIronMan && votosSuperman > votosCaptainAmerica) {
			// Superman maior que todos, logo ganhou
			System.out.println("Superman, com " + votosSuperman + " votos!");
		} else if (votosWonderWoman > votosSpiderman && votosWonderWoman > votosSuperman &&
					votosWonderWoman > votosIronMan && votosWonderWoman > votosCaptainAmerica) {
			// Wonder Woman maior que todos, logo ganhou
			System.out.println("Wonder Woman, com " + votosWonderWoman + " votos!");
		} else if (votosIronMan > votosSpiderman && votosIronMan > votosSuperman &&
				votosIronMan > votosWonderWoman && votosIronMan > votosCaptainAmerica) {
			// Iron Man maior que todos, logo ganhou
			System.out.println("Iron Man, com " + votosIronMan + " votos!");
		} else if (votosCaptainAmerica > votosSpiderman && votosCaptainAmerica > votosSuperman &&
				votosCaptainAmerica > votosWonderWoman && votosCaptainAmerica > votosIronMan) {
			// Captain America maior que todos, logo ganhou
			System.out.println("Captain America, com " + votosCaptainAmerica + " votos!");
		} else {
			// Ninguém tem votos maiores que todos os oponentes, logo houve empate
			System.out.println("Houve empate, logo não há um vencedor");
		}
	}

}
