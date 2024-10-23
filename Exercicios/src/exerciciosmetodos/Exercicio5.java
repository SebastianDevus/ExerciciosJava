package exerciciosmetodos;

import java.util.Scanner;

public class Exercicio5 {
    // Escreva um método raizQuadrada que recebe um número e retorna sua raiz quadrada. No main, solicite ao
    // usuário um número e exiba a raiz quadrada.
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Insira o número: ");
            int numero1 = Integer.parseInt(sc.nextLine());

            System.out.println("A raíz quadrada é "+raizQuadrada(numero1));
        } catch (NumberFormatException e) {
            System.out.println("Erro: entrada não é número");
        }
    }

    public static double raizQuadrada(double x) {
        return Math.sqrt(x);
    }
}
