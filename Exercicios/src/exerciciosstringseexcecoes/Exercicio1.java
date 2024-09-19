package exerciciosstringseexcecoes;

import java.util.Scanner;

public class Exercicio1 {
    // Crie um programa que funcione como uma calculadora simples, com as operações
    // de soma,
    // subtração, multiplicação e divisão.
    // Utilize um try-catch para tratar a divisão por zero.
    // Use um while para manter a calculadora em execução até o usuário optar por
    // sair.
    public static void main(String[] args) {
        int numero1, numero2, opcao, resultado = 0;
        try (Scanner sc = new Scanner(System.in)) {
            do {
                try {
                    System.out.println("\n===== Calculadora =====");
                    System.out.println("1) Soma");
                    System.out.println("2) Subtração");
                    System.out.println("3) Multiplicação");
                    System.out.println("4) Divisão");
                    System.out.println("0) Sair");
                    System.out.print("Escolha uma opção: ");
                    opcao = Integer.parseInt(sc.nextLine());
                    
                    if (opcao == 0) {
                        System.out.println("\nObrigado por usar a calculadora!");
                        break;
                    } else if (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4) {
                        System.out.println("\nOpção inválida");
                    } else {
                        System.out.print("\nInsira o primeiro número: ");
                        numero1 = Integer.parseInt(sc.nextLine());
                        System.out.print("Insira o segundo número: ");
                        numero2 = Integer.parseInt(sc.nextLine());
                        
                        switch (opcao) {
                            case 1 -> resultado = numero1 + numero2;
                            case 2 -> resultado = numero1 - numero2;
                            case 3 -> resultado = numero1 * numero2;
                            case 4 -> {
                                if (numero2 == 0) {
                                    throw new IllegalArgumentException("divisor não pode ser 0!");
                                } else {
                                    resultado = numero1 / numero2;
                                }
                            }
                        }
                        System.out.println("\nResultado: " + resultado);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Erro de input: entrada não é número!");
                } catch (IllegalArgumentException e) {
                    System.out.println("Erro de argumento: " + e.getMessage());
                }
            } while (true);
        }
    }
}
