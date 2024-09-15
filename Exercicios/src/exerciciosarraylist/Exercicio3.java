package exerciciosarraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        // Inicialize um ArrayList de String.
        // Use um Scanner para ler 5 nomes fornecidos pelo usuário e adicione-os ao ArrayList.
        // Imprima todos os nomes no ArrayList.
        // Pergunte ao usuário qual nome ele gostaria de remover e remova-o.
        // Imprima o ArrayList após a remoção.
        
        // Scanner como recurso pra não ficar exibindo erro
        try (Scanner sc = new Scanner(System.in)) {
            // Inicializando ArrayList, com valores inseridos pelo usuário
            ArrayList<String> nomes = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                System.out.print("Insira o "+(i+1)+"º nome: ");
                nomes.add(sc.nextLine());
            }

            // Imprimindo nomes
            System.out.println("\nNomes inseridos: ");
            for (String nome : nomes) {
                System.out.println("- "+nome);
            }
            
            // Perguntando um nome ao usuário, removendo-o, e exibindo lista sem o nome
            System.out.println("\nQual nome gostaria de remover? ");
            nomes.remove(sc.nextLine()); // se o nome não existir na lista, nada acontece
            System.out.println("\nLista com o nome removido: ");
            for (String nome : nomes) {
                System.out.println("- "+nome);
            }
        } 
    }
    
}
