package exerciciosstringseexcecoes;

import java.util.Scanner;

public class Exercicio5 {
    // Crie um programa com um menu de opções, como: 1 - Inserir texto, 2 - Contar palavras, 3 - Sair.
    // Utilize um loop while para exibir o menu até que o usuário escolha a opção "Sair".
    // Utilize a manipulação de strings para implementar a opção de contar palavras.
    public static void main(String[] args) {
        String texto = "", opcao;
        int numeroDePalavras;
        
        try (Scanner sc = new Scanner(System.in)) {
            do {
                System.out.println("======= Menu =======");
                System.out.println("1 - Inserir texto");
                System.out.println("2 - Contar palavras");
                System.out.println("3 - Sair");
                
                System.out.print("Selecione uma opção: ");
                opcao = sc.nextLine();

                switch (opcao) {
                    case "1" -> {
                        System.out.print("\nInsira um texto: ");
                        texto = sc.nextLine();
                    }
                    case "2" -> {
                        if (texto.equals("")) {
                            numeroDePalavras = 0;
                        } else {   
                            numeroDePalavras = texto.split("\\s+").length;
                        }
                        System.out.println("\nO texto contém "+numeroDePalavras+" palavras");
                    }
                    case "3" -> {}
                    default -> System.out.println("Opção inválida!");
                }
            } while (!opcao.equals("3"));
        }
    }
}
