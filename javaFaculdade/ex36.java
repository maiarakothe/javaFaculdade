package javaFaculdade;

import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número inteiro (n1): ");
        int n1 = teclado.nextInt();
        System.out.println("Digite um número real (n2): ");
        double n2 = teclado.nextDouble();

        mostraIntervalo(n1);

        double media = calculaMedia(n1, n2);
        System.out.printf("\nA média é %.2f.\n", media);

        if (n1 % 2 == 1) {
            System.out.println("Digite um número inteiro (n3): ");
            int n3 = teclado.nextInt();
            System.out.println("Digite outro número inteiro (n4): ");
            int n4 = teclado.nextInt();

            int maior = verificaMaior(n3, n4);
            System.out.println("O maior número é: " + maior);
        }

        teclado.close();
    }

    public static void mostraIntervalo(int n1) {
        System.out.println("\nContagem de 0 até " + n1 + ":");
        for (int i = 0; i <= n1; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static double calculaMedia(int n1, double n2) {
        return (n1 + n2) / 2;
    }

    public static int verificaMaior(int n3, int n4) {
        if (n3 > n4) {
            return n3;
        } else if (n4 > n3) {
            return n4;
        } else {
            System.out.println("Os números são iguais.");
            return n3;
        }
    }
}
