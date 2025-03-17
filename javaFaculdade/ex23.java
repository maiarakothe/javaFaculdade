package javaFaculdade;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a altura entre os andares (em metros): ");
        double alturaAndares = teclado.nextDouble();

        System.out.print("Informe a quantidade de degraus: ");
        int quantidadeDegraus = teclado.nextInt();

        double alturaDegrau = (alturaAndares * 100) / quantidadeDegraus;

        System.out.printf("Cada degrau deverá ter %.2f cm de altura.%n", alturaDegrau);
        
        teclado.close();
    }
}