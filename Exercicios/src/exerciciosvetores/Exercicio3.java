package exerciciosvetores;


import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        // Scanner como recurso, para que seja fechado no fim da execução
        try (Scanner sc = new Scanner(System.in)) {
            Locale.setDefault(Locale.US);

            // Variáveis
            float[] temperaturas = new float[7];
            int posicaoMaiorTemperatura, posicaoMenorTemperatura;

            // Entrada de dados
            for (int i = 0; i < temperaturas.length; i++) {
                System.out.print("Insira a temperatura do dia "+(i+1)+": ");
                temperaturas[i] = Float.parseFloat(sc.nextLine());
            }

            // Encontrando posicao no array da maior e menor temperatura
            posicaoMaiorTemperatura = 0;
            posicaoMenorTemperatura = 0;
            for (int i = 0; i < temperaturas.length; i++) {
                if (temperaturas[i] > temperaturas[posicaoMaiorTemperatura]) {
                    posicaoMaiorTemperatura = i;
                }
                if (temperaturas[i] < temperaturas[posicaoMenorTemperatura]) {
                    posicaoMenorTemperatura = i;
                }
            }

            // Saída de dados
            System.out.println(String.format("\nA maior temperatura foi de %.2f graus, no dia %d",
             temperaturas[posicaoMaiorTemperatura], (posicaoMaiorTemperatura+1)));
            System.out.println(String.format("A menor temperatura foi de %.2f graus, no dia %d",
             temperaturas[posicaoMenorTemperatura], (posicaoMenorTemperatura+1)));
        }
    }

}
