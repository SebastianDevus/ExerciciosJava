package exerciciosmatrizes;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    // 4. Preenchimento de Mapa 
    // Descrição: Crie  uma  matriz 3x3 para representar um mapa de  uma  pequena  área com diferentes tipos  de terreno (1: 
    // água, 2: floresta, 3: montanha). Preencha a matriz com valores fornecidos pelo usuário e, em seguida, conte quantos de 
    // cada tipo de terreno existem no mapa.

    public static void main(String[] args) {
        // Scanner como recurso, para que seja fechado no fim da execução
        try (Scanner sc = new Scanner(System.in)) {
            Locale.setDefault(Locale.US);

            // Variáveis
            int[][] mapa = new int[3][3];
            int quantidadeTerreno1 = 0, quantidadeTerreno2 = 0, quantidadeTerreno3 = 0;
            boolean tipoInvalido;

            // Menu inicial
            System.out.println("Tipos de terreno: ");
            System.out.println("1) Água");
            System.out.println("2) Floresta");
            System.out.println("3) Floresta");
            
            // Entrada de dados
            System.out.println("Insira o tipo de terreno presente no setor indicado:");
            for (int i = 0; i < mapa.length; i++) {
                for (int j = 0; j < mapa.length; j++) {
                    // Loop continua até que o usuário insira um valor válido
                    do {
                        tipoInvalido = false;
                        System.out.print("("+i+")("+j+"): ");
                        mapa[i][j] = Integer.parseInt(sc.nextLine());

                        switch (mapa[i][j]) {
                            case 1 -> quantidadeTerreno1++;
                            case 2 -> quantidadeTerreno2++;
                            case 3 -> quantidadeTerreno3++;
                            default -> {
                                System.out.println("Tipo de terreno inválido!");
                                tipoInvalido = true;
                            }
                        }
                    } while (tipoInvalido);
                }
            }

            // Saída de dados
            System.out.println("\nTotal de tipos de terreno:");
            System.out.println("Tipo 1: "+quantidadeTerreno1);
            System.out.println("Tipo 2: "+quantidadeTerreno2);
            System.out.println("Tipo 3: "+quantidadeTerreno3);
        }
    }
}
