package javaFaculdade;

import java.util.Scanner;

public class ex22 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Calcular a área de um trapézio:\n ");
		float h, b, B, area = 0;
		System.out.println("Altura: ");
		h = teclado.nextFloat();
		System.out.println("Base menor: ");
		b = teclado.nextFloat();
		System.out.println("Base maior: ");
		B = teclado.nextFloat();
		
		area = (h * (b +B)) /2;
		System.out.format("A área será de %.2f", area);
		
		teclado.close();

	}

}