package javaFaculdade;

import java.util.Arrays;
import java.util.Scanner;

public class ExArray {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int vetA[] = new int[5];
		int vetB[] = new int[5];
		
		Arrays.fill(vetA, 1);

		System.out.println("Informe valores para o vetor B: ");
		for(int cont = 0; cont < (vetB.length); cont++) {
			vetB[cont]  = teclado.nextInt();
		}
		
		Arrays.sort(vetB);
		
		vetA = Arrays.copyOf(vetB, vetB.length);
		
		System.out.println("Vetor A (com toString): " + Arrays.toString(vetA));
		System.out.println("Vetor B (com toString): " + Arrays.toString(vetB));

		System.out.print("Vetor A (com foreach): ");
	    for (int num : vetA) {
	    	System.out.println(num + " ");
	    }
	    
	    System.out.print("Vetor B (com foreach): ");
	    for (int num : vetB) {
	    	System.out.println(num + " ");
	    }
	    teclado.close();
	}

}
