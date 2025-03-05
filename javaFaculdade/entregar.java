package javaFaculdade;

public class entregar {

    public static void main(String[] args) {
        double faturamentoEmpresaA = 500000;
        double faturamentoEmpresaB = 1200000;

        int anosNecessarios = calcularUltrapassagem(faturamentoEmpresaA, faturamentoEmpresaB);
        
        verificarUltrapassagem(anosNecessarios);
    }

    public static int calcularUltrapassagem(double faturamentoA, double faturamentoB) {
        int anos = 0;
        
        while (faturamentoA < faturamentoB && anos < 50) {
            faturamentoA += faturamentoA * 0.08;
            faturamentoB += faturamentoB * 0.04;
            anos++;

            System.out.println("Ano " + anos);
            System.out.format("Empresa A: R$ %.2f\n", faturamentoA);
            System.out.format("Empresa B: R$ %.2f\n", faturamentoB);
            System.out.println("-----------------------------");
        }

        return anos;
    }

    public static void verificarUltrapassagem(int anos) {
        if (anos < 50) {
            System.out.println("A Empresa A ultrapassou a Empresa B em " + anos + " anos.");
        } else {
            System.out.println("A Empresa A NÃO ultrapassou a Empresa B em até 50 anos.");
        }
    }
}
