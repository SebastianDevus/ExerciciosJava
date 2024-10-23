package exerciciosmetodos;

import java.util.Scanner;

public class Exercicio6 {
    // Desenvolva um método contarLetras que recebe uma string e retorna o número de letras contidas na string
    // (desconsiderando espaços). No main, leia uma frase do usuário e exiba a contagem de letras.
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Insira uma frase: ");
            String frase = sc.nextLine();

            System.out.println("A frase possuí "+contarLetras(frase)+" caracteres");
        }
    }

    public static int contarLetras(String string) {
        return string.length();
    }
}
