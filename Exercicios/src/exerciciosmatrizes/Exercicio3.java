package exerciciosmatrizes;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
    // 3. Tabela de Notas de Alunos 
    // Descrição: Você precisa criar uma matriz 3x4 para armazenar as notas de 3 alunos em 4 disciplinas. Preencha a matriz 
    // com notas fornecidas pelo usuário e calcule a média das notas de cada aluno e de cada disciplina. Imprima os resultados. 

    public static void main(String[] args) {
        // Scanner como recurso, para que seja fechado no fim da execução
        try (Scanner sc = new Scanner(System.in)) {
            Locale.setDefault(Locale.US);

            // Variáveis
            int[][] notas = new int[3][4];
            double media;

            // Entrada de dados
            for (int i = 0; i < notas.length; i++) {
                System.out.println("\nInsira as notas do aluno "+(i+1));
                for (int j = 0; j < notas[i].length; j++) {
                    System.out.print("Disciplina "+(j+1)+": ");
                    notas[i][j] = Integer.parseInt(sc.nextLine());
                }
            }

            // Calculando e exibindo a média de cada aluno
            System.out.println("\n=== Médias dos alunos ===");
            for (int i = 0; i < notas.length; i++) {
                media = 0;
                for (int j = 0; j < notas[i].length; j++) {
                    media += notas[i][j];
                }
                media /= notas[i].length;
                System.out.println(String.format("Aluno %d: %.1f", i+1,media));
            }

            // Calculando e exibindo a média de cada disciplina
            System.out.println("\n=== Médias das disciplinas ===");
            for (int i = 0; i < notas[0].length; i++) {
                media = 0;
                for (int[] nota : notas) {
                    media += nota[i];
                }
                media /= notas.length;
                System.out.println(String.format("Disciplina %d: %.1f", i+1,media));
            }
        }
    }

}
