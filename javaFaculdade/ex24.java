package javaFaculdade;

import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o tamanho da escada (em metros): ");
        double tamanhoEscada = teclado.nextDouble();

        System.out.print("Informe a altura em que deseja pregar o quadro (em metros): ");
        double alturaQuadro = teclado.nextDouble();

        if (tamanhoEscada <= alturaQuadro) {
            System.out.println("Erro: O tamanho da escada deve ser maior que a altura desejada.");
        } else {
            double distanciaParede = Math.sqrt(Math.pow(tamanhoEscada, 2) - Math.pow(alturaQuadro, 2));

            System.out.printf("A escada deve estar a %.2f metros de distância da parede.%n", distanciaParede);
        }
        
        teclado.close();
    }
}
