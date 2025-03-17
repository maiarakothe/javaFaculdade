package javaFaculdade;

import java.util.Scanner;

public class Ex41 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int vetorA[] =  new int[10];
		int vetorB[] =  new int[10];
		double vetorC[] = new double[10];
		
		System.out.println("Digite 10 números para o vetor A:\n");
		for (int cont = 0; cont < vetorA.length; cont++) {
			System.out.format("Digite o %d número:", cont + 1);
			vetorA[cont] = teclado.nextInt();
		}
		
		System.out.println("Digite 10 números para o vetor B:\n");
		for (int cont = 0; cont < vetorB.length; cont++) {
			do {
                System.out.format("Digite o %dº número: ", cont + 1);
                vetorB[cont] = teclado.nextInt();
                if (vetorB[cont] == 0) {
                    System.out.println("O número não pode ser 0! Tente novamente.");
                }  } while (vetorB[cont] == 0);
		}
		
		
		for (int cont = 0; cont < 10; cont++) {
			vetorC[cont] += (double) vetorA[cont] / vetorB[cont];
			
		}

		System.out.println("Forma invertida: ");
		for (int i = 9; i >= 0; i--) {
			System.out.printf("%.2f\n", vetorC[i]);
		}
		
		System.out.println("Números pares do vetor A: ");
		for (int cont = 0; cont < 10; cont++) {
			if (vetorA[cont] % 2 == 0) {
				System.out.printf("Número par: %d\n", vetorA[cont]);
			}
			
		}
		
		teclado.close();
		}

	}
