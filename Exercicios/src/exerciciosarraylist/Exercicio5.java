package exerciciosarraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercicio5 {
    // Inicialize um ArrayList de Character com os caracteres 'a', 'b', 'c', 'd' e 'e'.
    // Imprima o caractere na posição 3.
    // Modifique o caractere na posição 1 para 'z'.
    // Imprima o ArrayList após a modificação.

    public static void main(String[] args) {
        // Inicializando ArrayList
        ArrayList<Character> caracteres = new ArrayList<>(Arrays.asList('a','b','c','d','e'));

        // Imprimindo o caractere na posição 3.
        System.out.println("Caractere na posição 3: "+caracteres.get(3));

        // Modificand o caractere na posição 1 para 'z'.
        caracteres.set(1, 'z');

        // Imprimindo o ArrayList após a modificação.
        System.out.println("\nLista: ");
        for (Character caractere : caracteres) {
            System.out.print("'"+caractere+"' ");
        }
        System.out.println();
    }
    
}
