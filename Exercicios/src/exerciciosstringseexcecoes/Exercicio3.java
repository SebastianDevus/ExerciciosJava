package exerciciosstringseexcecoes;

import java.util.Scanner;

public class Exercicio3 {
    // Peça ao usuário para inserir uma string.
    // Verifique se essa string é um palíndromo (a mesma sequência de caracteres de trás para frente).
    // Ignore espaços e diferenças de maiúsculas/minúsculas na verificação.
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String string;
            boolean palindromo = true;

            System.out.print("Insira uma string: ");
            string = sc.nextLine();

            char[] vetorString = string.replaceAll("\\s+", "").toLowerCase().toCharArray();
            for (int i = 0; i < vetorString.length; i++) {
                if (vetorString[i] != vetorString[vetorString.length-1-i]) {
                    palindromo = false;
                }
            }
            
            if (palindromo) {
                System.out.println("A string é um palíndromo!");
            } else {
                System.out.println("A string não é um palíndromo!");
            }
        }
    }
}
