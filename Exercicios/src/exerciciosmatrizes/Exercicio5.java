package exerciciosmatrizes;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    // 5. Controle de Inventário 
    // Descrição: Você gerencia um inventário de 3 tipos de produtos em 4 armazéns diferentes. Crie uma matriz 3x4 para 
    // armazenar a quantidade de cada produto em cada armazém. Preencha a matriz com valores fornecidos pelo usuário e 
    // calcule o total de cada tipo de produto em todos os armazéns.

    public static void main(String[] args) {
        // Scanner como recurso, para que seja fechado no fim da execução
        try (Scanner sc = new Scanner(System.in)) {
            Locale.setDefault(Locale.US);

            // Variáveis
            int[][] inventario = new int[3][4];
            int soma;

            // Entrada de dados
            for (int i = 0; i < inventario.length; i++) {
                System.out.println("\nInsira o estoque disponível do produto "+(i+1));
                for (int j = 0; j < inventario[i].length; j++) {
                    System.out.print("Armazém "+(j+1)+": ");
                    inventario[i][j] = Integer.parseInt(sc.nextLine());
                }
            }

            // Calculando o estoque total de cada produto
            System.out.println("\n=== Estoque total ===");
            for (int i = 0; i < inventario.length; i++) {
                soma = 0;
                for (int j = 0; j < inventario[i].length; j++) {
                    soma += inventario[i][j];
                }
                System.out.println(String.format("Produto %d: %d", i+1,soma));
            }
        }
    }
}   
