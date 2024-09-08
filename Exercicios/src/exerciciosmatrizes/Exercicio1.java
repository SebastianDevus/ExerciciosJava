package exerciciosmatrizes;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        
        // Scanner como recurso, para que seja fechado no fim da execução
        try (Scanner sc = new Scanner(System.in);) {
            Locale.setDefault(Locale.US);

            // Variáveis
            int[][] vendas = new int[4][4];
            int soma; // Variável soma armazena somas temporariamente para cálculos

            // Entrada de dados
            for (int i = 0; i < vendas.length; i++) {
                for (int j = 0; j < vendas[i].length; j++) {
                    System.out.print("Insira as vendas do produto "+(j+1)+" na semana "+(i+1)+": ");
                    vendas[i][j] = Integer.parseInt(sc.nextLine());
                }
            }

            // Soma das vendas dos produtos
            System.out.println("\nSoma das vendas dos produtos:");
            for (int i = 0; i < vendas.length; i++) {
                soma = 0; // Resetando soma
                for (int j = 0; j < vendas[i].length; j++) {
                    soma += vendas[j][i];                    
                }
                System.out.println("Produto "+(i+1)+": "+soma);
            }

            // Soma das vendas das semanas
            System.out.println("Soma das vendas das semanas:");
            for (int i = 0; i < vendas.length; i++) {
                soma = 0; // Resetando soma
                for (int j = 0; j < vendas[i].length; j++) {
                    soma += vendas[i][j];                    
                }
                System.out.println("Semana "+(i+1)+": "+soma);
            }
        }
    }
}
