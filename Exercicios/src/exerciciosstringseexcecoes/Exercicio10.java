package exerciciosstringseexcecoes;

import java.util.Scanner;

public class Exercicio10 {
    // Peça ao usuário para inserir uma string.
    // Utilize um loop para inverter a string e exibir o resultado.
    // Desafie os alunos a fazerem isso sem usar funções prontas do Java, como StringBuilder.reverse()
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String string, stringInversa = "";
            char[] vetorString;

            System.out.print("Insira uma string: ");
            string = sc.nextLine();
            vetorString = string.toCharArray();
            
            for (int i = 0; i < vetorString.length; i++) {
                stringInversa += vetorString[vetorString.length-1-i];
            }

            System.out.println("A string inversa fica:");
            System.out.println(stringInversa);
        }
    }
}
