package exerciciosstringseexcecoes;

import java.util.Scanner;

public class Exercicio7 {
    // Crie um programa que converta temperaturas de Celsius para Fahrenheit e vice-versa.
    // Utilize um loop while para permitir que o usuário realize múltiplas conversões.
    // Implemente try-catch para tratar entradas inválidas (como letras no lugar de números).
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int opcao = 0;
            double temperaturaC, temperaturaF;
            
            do {
                try {
                    System.out.println("=== Conversor ===");
                    System.out.println("1) °C -> °F");
                    System.out.println("2) °F -> °C");
                    System.out.println("3) Sair");

                    System.out.print("Escolha uma opção: ");
                    opcao = Integer.parseInt(sc.nextLine());

                    switch (opcao) {
                        case 1 -> {
                            System.out.print("\nInsira a temperatura em °C: ");
                            temperaturaC = Double.parseDouble(sc.nextLine());

                            temperaturaF = (temperaturaC * 9/5) + 32;

                            System.out.println(temperaturaC+" °C é equivalente a "+temperaturaF+" °F");
                        }
                        case 2 -> {
                            System.out.print("\nInsira a temperatura em °F: ");
                            temperaturaF = Double.parseDouble(sc.nextLine());
                            
                            temperaturaC = (temperaturaF -32) * 5/9;

                            System.out.println(temperaturaF+" °F é equivalente a "+temperaturaC+" °C");
                        }
                        case 3 -> {}
                        default -> System.out.println("Opção inválida!");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Erro: entrada inválida (não é número)");
                }
            } while (opcao != 3);
        }
    }
}
