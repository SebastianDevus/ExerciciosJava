package exerciciosstringseexcecoes;

import java.util.Scanner;

public class Exercicio6 {
    // Peça ao usuário para criar uma senha e valide se ela atende aos seguintes requisitos: pelo menos 
    // 8 caracteres, pelo menos uma letra maiúscula, uma letra minúscula e um número.
    // Utilize loops e manipulação de strings para verificar os requisitos.
    // Utilize try-catch para capturar qualquer erro que possa ocorrer na entrada de dados.
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String senha;
            boolean tamanhoSuficiente, temMaiuscula, 
                temMinuscula, temNumero;
    
            System.out.println("\nRequerimentos:");
            System.out.println("- Ao menos 8 caracteres");
            System.out.println("- Uma letra maiúscula");
            System.out.println("- Uma letra minúscula");
            System.out.println("- Um número");
            
            do {
                tamanhoSuficiente = false;
                temMaiuscula = false;
                temMinuscula = false;
                temNumero = false;

                System.out.print("\nInsira sua senha: ");
                senha = sc.nextLine();

                if (senha.toCharArray().length >= 8) tamanhoSuficiente = true;
                for (char c : senha.toCharArray()) {
                    if (Character.isUpperCase(c)) temMaiuscula = true;
                    if (Character.isLowerCase(c)) temMinuscula = true;
                    if (Character.isDigit(c)) temNumero = true;
                }

                if (tamanhoSuficiente && temMaiuscula && temMinuscula && temNumero) {
                    System.out.println("\nSenha válida");
                    break;
                } else {
                    System.out.println("\nSenha inválida:");
                    if (!tamanhoSuficiente) System.out.println("Tamanho insuficiente");
                    if (!temMaiuscula) System.out.println("Não possuí letra maiúscula");
                    if (!temMinuscula) System.out.println("Não possuí letra minúscula");
                    if (!temNumero) System.out.println("Não possuí número");
                }
            } while (true);  
        } 
    }
}
