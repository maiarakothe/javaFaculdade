package javaFaculdade;

import java.util.Scanner;

public class ex39 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual o valor do salário inicial: ");
		double salario = teclado.nextDouble();
		System.out.println("Qual o número de meses trabalhados no úlitmo periodo: ");
		int meses = teclado.nextInt();
		while (meses <= 0 || meses >= 24) {
			System.out.println("Qual o número de meses trabalhados no úlitmo periodo: ");
			meses = teclado.nextInt();
		}
		
		do {
			System.out.println("Menu");
			System.out.println("1. Novo salário (aumentar uma única vez)");
			System.out.println("2. Férias");
			System.out.println("3. Décimo Terceiro");
			System.out.println("4. Sair");
			int op = teclado.nextInt();
			
			perc = 0;
				
				switch (op) {
				case 1 :
					if (salario <= 2500) {
						perc = 20; 
					}
				}
				
		} while (op != 4);
		


	}

}
