package javaFaculdade;

import java.util.Scanner;

public class ex37 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor do depósito mensal: ");
        double deposito = teclado.nextDouble();
        System.out.println("Digite o montante desejado: ");
        double montanteDesejado = teclado.nextDouble();

        double saldo = 0;
        double juros = 0.005;
        int meses = 0;

        while (saldo < montanteDesejado) {
            saldo += deposito;
            saldo += saldo * juros;
            meses++;
            System.out.printf("Mês %d: R$ %.2f\n", meses, saldo);
        }

        System.out.println("Total de meses necessários: " + meses);

        teclado.close();
    }
}


