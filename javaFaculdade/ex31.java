package javaFaculdade;

import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe sua idade: ");
		int idade = teclado.nextInt();
		
		if (idade <= 15) {
			System.out.println("Até 15 anos não vota");
		} else if(idade <= 17) {
			System.out.println("Entre 16 e 17 é opcional");
		} else if (idade <= 70) {
			System.out.println("Entre 18 e 70 é obrigatório");
		} else {
			System.out.println("Acima de 70 é opcional");
		}
		
		teclado.close();
	}

}
