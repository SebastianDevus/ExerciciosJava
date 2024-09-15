package exerciciosvetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    // 5. Avaliação de Produtos 
    // Descrição: Você gerencia um site  de avaliações  de  produtos  e deseja armazenar as avaliações de  5 produtos  em um 
    // vetor de inteiros. Preencha o vetor com avaliações fornecidas pelo usuário e calcule a média das avaliações.

    public static void main(String[] args) {
        // Scanner como recurso, para que seja fechado no fim da execução
        try (Scanner sc = new Scanner(System.in)) {
            Locale.setDefault(Locale.US);

            // Váriaveis
            int[] avaliacoes = new int[5];
            double media = 0;

            for (int i = 0; i < avaliacoes.length; i++) {
                // Entrada de dados
                do {
                    System.out.print("Insira a avaliação do produto " + (i+1) + "(0 a 10): ");
                    avaliacoes[i] = Integer.parseInt(sc.nextLine());

                    // Só sai do laço se a avaliação for de 0 a 10
                    if (avaliacoes[i] <= 10 && avaliacoes[i] >= 0) {
                        break;
                    }

                    // Só occore se a avaliação não estiver entre 0 e 10
                    System.out.println("Avaliação inválida, insira uma avaliação entre 0 e 10\n");
                } while (true);

                // Só acontece se a avaliação for válida
                media += avaliacoes[i];
            }
            media /= avaliacoes.length;

            // Saída
            System.out.println(String.format("\nA média das avaliações é %.2f", media));
        }
    }

}
