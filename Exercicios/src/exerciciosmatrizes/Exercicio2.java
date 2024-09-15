package exerciciosmatrizes;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    // 2. Agendamento de Reuniões 
    // Descrição: Crie uma matriz 5x7 para representar uma agenda semanal de reuniões (5 dias da semana e 7 horários por 
    // dia). Preencha a matriz com descrições de reuniões e imprima a agenda completa.
    
    public static void main(String[] args) {
        // Scanner como recurso, para que seja fechado no fim da execução
        try (Scanner sc = new Scanner(System.in)) {
            Locale.setDefault(Locale.US);

            // Variáveis
            String[][] reunioes = new String[5][7];
            String[] diasDaSemana = {"Segunda-feira", "Terça-feira", 
            "Quarta-feira", "Quinta-feira", "Sexta-feira"}; // Puramente por estética

            // Entrada de dados
            System.out.println("Insira descrições das reuniões da semana");
            for (int i = 0; i < reunioes.length; i++) {
                System.out.println("\nReuniões da "+diasDaSemana[i]);
                for (int j = 0; j < reunioes[i].length; j++) {
                   System.out.print("Horário "+(j+1)+": ");
                   reunioes[i][j] = sc.nextLine();
                }
            }

            // Saída de dados
            System.out.println("\n\n===== Calendário de reuniões =====");
            for (int i = 0; i < reunioes.length; i++) {
                System.out.println("\nReuniões da "+diasDaSemana[i]);
                for (int j = 0; j < reunioes[i].length; j++) {
                   System.out.println("Horário "+(j+1)+": "+reunioes[i][j]);
                }
            }
        }
    }

}
