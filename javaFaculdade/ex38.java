package javaFaculdade;

import java.util.Calendar;

public class Ex38 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int anoAtual = cal.get(Calendar.YEAR);
        int anoContratado = 2017;
        double salario = 1000.0;
        double percentualAumento = 0.0;

        for (int ano = anoContratado; ano <= anoAtual; ano++) {
            if (ano == 2017) {
                System.out.println("Ano: " + ano + " | Percentual: 0% | Salário: R$ " + salario);
            } else if (ano == 2018) {
                percentualAumento = 1.5;
                salario += salario * (percentualAumento / 100);
                System.out.printf("Ano: %d | Percentual: %.2f%% | Salário: R$ %.2f%n", ano, percentualAumento, salario);
            } else {
                percentualAumento *= 2;
                salario += salario * (percentualAumento / 100);
                System.out.printf("Ano: %d | Percentual: %.2f%% | Salário: R$ %.2f%n", ano, percentualAumento, salario);
            }
        }
    }
}

