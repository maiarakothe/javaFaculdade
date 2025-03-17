package javaFaculdade;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o valor pago por hora: ");
		float valorPorHora = teclado.nextFloat();
		System.out.println("Informe o quantas horas foram trabalhadas: ");
		int hora = teclado.nextInt();
		float valor = 0;
		valor = valorPorHora * hora;
		System.out.format("o valor a ser recebido sera R$ %.2f", valor);

		teclado.close();
	}
}

