package exerciciosmetodos;

import java.util.Scanner;

public class Exercicio2 {
    // Escreva um programa que contenha um método estático para calcular o fatorial de um número inteiro positivo
    // fornecido pelo usuário. O método deve calcular o fatorial de forma recursiva ou utilizando um laço de repetição,
    // e o resultado deve ser exibido no método main.
    //         Requisitos:
    //         • O método deve calcular o fatorial de um número inteiro positivo.
    //         • O programa deve solicitar ao usuário que forneça o número e exibir o resultado.
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Insira o fatorial que deseja calcular: ");
            int numero = Integer.parseInt(sc.nextLine());

            if (numero < 0) {
                System.out.println("Valor inválido!");
            } else {
                System.out.println("O resultado é: "+calculaFatorial(numero));
            }
        } catch (NumberFormatException e) {
            System.out.println("Erro: entrada não é número!");
        }
    }

    public static int calculaFatorial(int x) {
        if (x == 1 || x == 0) {
            return 1;
        } else {
            return x * calculaFatorial(x-1);
        }
    }
}
