package exerciciosmetodos;

import java.util.Scanner;

public class Exercicio1 {

    // Crie um método chamado soma que recebe dois números inteiros como parâmetros e retorna a soma deles.
    // No método main, solicite ao usuário que insira dois números e exiba o resultado da soma.
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Insira o primeiro número: ");
            int numero1 = Integer.parseInt(sc.nextLine());
            System.out.print("Insira o primeiro número: ");
            int numero2 = Integer.parseInt(sc.nextLine());

            System.out.println("A soma é "+soma(numero1, numero2));
        } catch (NumberFormatException e) {
           System.out.println("Erro: entrada não é número");
        }
    }

    public static int soma(int n1, int n2) {
        return n1+n2;
    }
}
