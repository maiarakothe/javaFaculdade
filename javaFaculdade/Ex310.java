package javaFaculdade;

import java.util.Scanner;
import java.util.Scanner;

public class Ex310 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int paisA, paisB, anos;
		double cresA, cresB;
		
		do {
            System.out.print("Informe a população da cidade A (maior que 0): ");
            paisA = teclado.nextInt();
            System.out.print("Informe a taxa de crescimento da população A (em % e maior que 0): ");
            cresA = teclado.nextDouble();
            System.out.print("Informe a população da cidade B (maior que A): ");
            paisB = teclado.nextInt();
            System.out.print("Informe a taxa de crescimento da população B (em % e maior que 0): ");
            cresB = teclado.nextDouble();

            if (paisA <= 0 || paisB <= paisA || cresA <= 0 || cresB <= 0) {
                System.out.println("Valores inválidos! Tente novamente.\n");
            }
        } while (paisA <= 0 || paisB <= paisA || cresA <= 0 || cresB <= 0);
		
		
		for (anos = 0; paisA < paisB; anos++ ) {
			paisA += paisA *  (cresA / 100);
			paisB += paisB * (cresB / 100);
			
		}
		System.out.printf("Serão necessários %d anos", anos);
		teclado.close();
	}
}
