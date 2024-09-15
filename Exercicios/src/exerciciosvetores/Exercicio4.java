package exerciciosvetores;

import java.util.Locale;

public class Exercicio4 {
    // 4. Sequência de Fibonacci 
    // Descrição:  Crie  um  vetor  para  armazenar  os  primeiros  10  números  da  sequência  de  Fibonacci  e  preencha-o  com  os 
    // valores correspondentes. Imprima a sequência completa.

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        // Variáveis
        int[] numeros = new int[10];

        // Preenchendo vetor com os números da sequência de Fibonacci
        numeros[0] = 1;
        numeros[1] = 1;
        for (int i = 2; i < numeros.length; i++) {
            numeros[i] = numeros[i - 1] + numeros[i - 2];
        }

        // Exibindo sequência
        System.out.println("Os 10 primeiros números da sequência de Fibonacci são:");
        for (Object numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println("");

        // Forma alternativa, com apenas um laço:
        // 
        // numeros[0] = 1;
        // numeros[1] = 1;
        // System.out.println("Os 10 primeiros números da sequência de Fibonacci são:");
        // System.out.print("1 1 ");
        // for (int i = 2; i < numeros.length; i++) {
        //     numeros[i] = numeros[i - 1] + numeros[i - 2];
        //     System.out.print(numeros[i] + " ");
        // }
    }

}
