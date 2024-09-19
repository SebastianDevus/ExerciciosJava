package exerciciosstringseexcecoes;

import java.util.Scanner;

public class Exercicio4 {
    // Solicite ao usuário que insira uma frase.
    // Utilize um loop for para percorrer cada caractere da frase e contar o número de vogais (a, e, i, 
    // o, u).
    // Exiba o total de vogais encontradas.
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String frase;
            int vogais = 0;
            System.out.print("Insira uma frase: ");
            frase = sc.nextLine();
            for (char c : frase.toLowerCase().toCharArray()) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vogais++;
                }
            }

            System.out.println("A frase inserida possuí "+vogais+" vogais!");
        }
    }
}
