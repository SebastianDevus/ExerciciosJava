package exerciciosvetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
    // 1. Controle de Notas de Alunos 
    // Descrição:  Você  é  responsável  por  registrar  as  notas  de  5  alunos  em  um  exame.  Crie  um  vetor  de  5  inteiros  para 
    // armazenar as notas e preencha-o com valores fornecidos pelo usuário. Em seguida, calcule e imprima a média das notas. 

    public static void main(String[] args) {
        // Scanner como recurso, para que seja fechado no fim da execução
        try (Scanner sc = new Scanner(System.in);) {
            Locale.setDefault(Locale.US);

            // Váriaveis
            int[] notas = new int[5];
            double media = 0;

            for (int i = 0; i < notas.length; i++) {
                // Entrada de dados
                do {
                    System.out.print("Insira a nota do aluno " + (i + 1) + " (0 a 10): ");
                    notas[i] = Integer.parseInt(sc.nextLine());

                    // Só sai do laço se a nota for de 0 a 10
                    if (notas[i] <= 10 && notas[i] >= 0) {
                        break;
                    }

                    // Só occore se a nota não estiver entre 0 e 10
                    System.out.println("Nota inválida, insira uma nota entre 0 e 10\n");
                } while (true);

                // Só acontece se a nota for válida
                media += notas[i];
            }
            media /= notas.length;

            // Saída
            System.out.println(String.format("\nA média das notas é %.2f", media));
        }
    }

}
