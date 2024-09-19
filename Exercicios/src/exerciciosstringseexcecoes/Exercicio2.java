package exerciciosstringseexcecoes;

import java.util.Scanner;

public class Exercicio2 {
    // Desenvolva um programa que peça ao usuário para inserir um número inteiro. Utilize try-catch
    // para verificar se a entrada é válida.
    // Se o usuário inserir um valor não numérico, exiba uma mensagem de erro e peça para ele tentar 
    // novamente.
    public static void main(String[] args) { 
        try (Scanner sc = new Scanner(System.in)) {
            do { 
                try {
                    System.out.print("Insira um número: ");
                    Integer.parseInt(sc.nextLine());
                    System.out.println("Obrigado");
                    break; // Se um número é inserido, loop acaba
                } catch (NumberFormatException e) {
                    System.out.println("Erro: input não é número. Tente novamente");
                }
            } while (true);
        } 
    }
}
