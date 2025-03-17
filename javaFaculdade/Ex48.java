package javaFaculdade;

import java.util.Scanner;

public class Ex48{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] vendas = new double[5][4];
        double totalMes = 0;

        for (int lin = 0; lin < 5; lin++) {
            System.out.println("Digite as vendas para o Vendedor " + (lin + 1) + ":");
            for (int col = 0; col < 4; col++) {
                System.out.print("Venda da semana " + (col + 1) + ": ");
                vendas[lin][col] = scanner.nextDouble();
            }
        }

        System.out.println("\nTotal de vendas por semana:");
        for (int col = 0; col < 4; col++) {
            double totalSemana = 0;
            for (int lin = 0; lin < 5; lin++) {
                totalSemana += vendas[lin][col];
            }
            System.out.println("Semana " + (col + 1) + ": " + totalSemana);
            totalMes += totalSemana;
        }

        System.out.println("\nTotal de vendas por vendedor:");
        for (int lin = 0; lin < 5; lin++) {
            double totalVendedor = 0;
            for (int col = 0; col < 4; col++) {
                totalVendedor += vendas[lin][col];
            }
            System.out.println("Vendedor " + (lin + 1) + ": " + totalVendedor);
        }

        System.out.println("\nTotal de vendas do mês: " + totalMes);

        scanner.close();
    }
}
