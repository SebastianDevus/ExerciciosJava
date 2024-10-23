package exerciciosmetodos;

import java.util.Scanner;

public class Exercicio3 {
    // Implemente um método contagemRegressiva que recebe um número inteiro e imprime uma contagem
    // regressiva até zero. No main, peça ao usuário para informar um número e execute a contagem
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Insira um número positivo: ");
            int numero = Integer.parseInt(sc.nextLine());

            if (numero < 0) {
                System.out.println("Número inválido!");
            } else {
                contagemRegressiva(numero);
            }
        } catch (NumberFormatException e) {
            System.out.println("Erro: entrada não é número!");
        }

    }

    public static void contagemRegressiva(int x) {
        System.out.println(x);
        if (x > 0) {
            contagemRegressiva(x-1);
        }
    }
}
