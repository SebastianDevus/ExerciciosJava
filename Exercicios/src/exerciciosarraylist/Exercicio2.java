package exerciciosarraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Exercicio2 {
    // Inicialize um ArrayList de Integer com os números 5, 2, 9, 1 e 3.
    // Imprima o ArrayList antes de ordenar.
    // Ordene o ArrayList em ordem crescente usando Collections.sort.
    // Imprima o ArrayList após a ordenação.
    // Inverta a ordem dos elementos usando Collections.reverse.
    // Imprima o ArrayList após a inversão.

    public static void main(String[] args) {
        // Inicializando um ArrayList com os números 5, 2, 9, 1 e 3
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(5,2,9,1,3));

        //Imprimindo ArrayList
        System.out.println("Lista de números: ");
        for (Integer numero : numeros) {
            System.out.print(numero+" ");
        }
        System.out.println();

        // Ordenando o ArrayList
        Collections.sort(numeros);

        //Imprimindo ArrayList
        System.out.println("\nLista de números (ordenada): ");
        for (Integer numero : numeros) {
            System.out.print(numero+" ");
        }
        System.out.println();

        // Invertendo o ArrayList
        Collections.reverse(numeros);

        //Imprimindo ArrayList
        System.out.println("\nLista de números (ordem reversa): ");
        for (Integer numero : numeros) {
            System.out.print(numero+" ");
        }
        System.out.println();
    }
    
}
