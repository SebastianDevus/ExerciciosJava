package exerciciosarraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercicio1 {
    // Inicialize um ArrayList de String.
    // Adicione 5 nomes ao ArrayList.
    // Imprima todos os nomes.
    // Remova o terceiro nome.
    // Substitua o segundo nome por um novo nome.
    // Imprima o nome na posição 1.
    // Exiba o tamanho do ArrayList.

    public static void main(String[] args) {
        // Inicializando ArrayList de String e adicionando 5 nomes
        ArrayList<String> nomes = new ArrayList<>(Arrays.asList("Andre","Caio","Julia","Maria","Stefanie")); 

        // Imprimindo nomes
        System.out.println("Nomes da lista: ");
        for (String nome : nomes) {
            System.out.println("- "+nome);
        }       
        
        // Removendo terceiro nome e mudando o segundo
        nomes.remove(2);
        nomes.set(1, "Eduardo");

        // Exibindo nome na posição 1 e tamanho do ArrayList
        System.out.println("\nNome na posição 1: "+nomes.get(1));     
        System.out.println("Tamanho da lista: "+nomes.size());     
    }

}
