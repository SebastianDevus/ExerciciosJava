package exerciciosarraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercicio4 {
    // Inicialize um ArrayList de Double com os valores 1.1, 2.2, 3.3, 4.4 e 5.5.
    // Use o método set para substituir o valor na posição 2 por um novo valor (por exemplo, 99.9).
    // Imprima o ArrayList antes e depois da substituição.

    public static void main(String[] args) {
        // Inicializando ArrayList
        ArrayList<Double> numeros = new ArrayList<>(Arrays.asList(1.1,2.2,3.3,4.4,5.5));

        // Imprimindo ArrayList
        System.out.println("Números:");
        for (Double numero : numeros) {
            System.out.print(numero+" ");
        }
        System.out.println();

        // Alterando valor na posição 2
        numeros.set(2, 33.3);

        // Imprimindo ArrayList
        System.out.println("\nNúmeros, após mudança:");
        for (Double numero : numeros) {
            System.out.print(numero+" ");
        }
        System.out.println();
    }
    
}
