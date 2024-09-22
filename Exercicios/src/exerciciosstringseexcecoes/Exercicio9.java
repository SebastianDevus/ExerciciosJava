package exerciciosstringseexcecoes;

import java.util.Scanner;

public class Exercicio9 {
    // Solicite ao usuário para inserir uma frase.
    // Utilize um loop for para contar e exibir o número total de caracteres (incluindo espaços) e o 
    // número de caracteres sem espaços
    public static void main(String[] args) {    
        try (Scanner sc = new Scanner(System.in)) {
            String frase;
            int caracteres = 0, caracteresSemEspaco = 0;

            System.out.print("Insira uma frase: ");
            frase = sc.nextLine();

            for (int i = 0; i < frase.toCharArray().length; i++) caracteres++;
            for (int i = 0; i < frase.replace(" ", "").toCharArray().length; i++) caracteresSemEspaco++;

            System.out.println("Incluindo espaços, a frase tem "+caracteres+" caracteres");
            System.out.println("Excluindo espaços, a frase tem "+caracteresSemEspaco+" caracteres");
        }

    }
}
