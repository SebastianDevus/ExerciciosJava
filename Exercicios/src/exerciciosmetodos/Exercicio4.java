package exerciciosmetodos;

public class Exercicio4 {
    // Crie um método trocarValores que recebe dois números inteiros por referência e troca seus valores. No main,
    // declare duas variáveis inteiras, chame o método e exiba os valores após a troca.

    public static int numero1 = 0, numero2 = 1;
    public static void main(String[] args) {
        System.out.println("Antes da troca: n1 = "+numero1+", n2 = "+numero2);
        trocarValores(numero1, numero2);
        System.out.println("Depois da troca: n1 = "+numero1+", n2 = "+numero2);
    }

    public static void trocarValores(int n1, int n2) {
        numero1 = n2;
        numero2 = n1;
    }
}
