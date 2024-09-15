package exerciciosvetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    // 2. Lista de Compras 
    // Descrição: Crie um vetor de 8 strings para armazenar itens de uma lista de compras. Peça ao usuário para inserir os 
    // itens e, depois, imprima a lista completa de compras.

    public static void main(String[] args) {
        // Scanner como recurso, para que seja fechado no fim da execução
        try (Scanner sc = new Scanner(System.in)) {
            Locale.setDefault(Locale.US);

            // Variáveis
            String[] itens = new String[8];
            
            // Entrada de dados
            System.out.println("Insira os itens desejados:");
            for (int i = 0; i < itens.length; i++) {
                System.out.print("-> ");
                itens[i] = sc.nextLine();
            }

            // Saída de dados
            System.out.println("\nLista de compras:");
            for (String item : itens) {
                System.err.println("-> " + item);
            }
        }
    }

}
