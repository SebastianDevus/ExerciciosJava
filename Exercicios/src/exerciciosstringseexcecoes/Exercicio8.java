package exerciciosstringseexcecoes;

import java.util.Random;
import java.util.Scanner;

public class Exercicio8 {
    // Escreva um jogo onde o programa escolhe aleatoriamente um número entre 1 e 100.
    // O usuário deve adivinhar o número e receber dicas se o palpite é muito alto ou baixo.
    // Utilize um try-catch para validar a entrada do usuário e evitar erros quando forem inseridos 
    // valores não numéricos.
    // O jogo continua até o usuário acertar o número ou escolher sair    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Random rdm = new Random();
            int palpite = 0;
            int numero = rdm.nextInt(100) + 1;

            System.out.println(numero);

            System.out.println("Vamos jogar um jogo?");
            System.out.println("Tente adivinhar o número!\n");
            do {
                try {
                    System.out.print("\nInsira seu palpite: ");
                    palpite = Integer.parseInt(sc.nextLine());

                    if (palpite == numero) {
                        System.out.println("Parabéns, você acertou!");
                    } else if (palpite >= numero+10) {
                        System.out.println("Palpite muito alto");
                    } else if (palpite >= numero+5) {
                        System.out.println("Palpite alto");
                    } else if (palpite > numero) {
                        System.out.println("Palpite pouco alto");
                    } else if (palpite <= numero-10) {
                        System.out.println("Palpite muito baixo");
                    } else if (palpite <= numero-5) {
                        System.out.println("Palpite baixo");
                    } else {
                        System.out.println("Palpite pouco baixo");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Erro: entrada inválida (não é número)");
                }
            } while (numero != palpite);
        }
    }
}
