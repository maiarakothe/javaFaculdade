package javaFaculdade;

import java.util.Scanner;

public class Ex39 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual o valor do salário inicial: ");
		double salario = teclado.nextDouble();
		int meses, op;
		
		do {
			System.out.println("Qual o número de meses trabalhados no últitmo periodo: ");
			meses = teclado.nextInt();
		} while (meses <= 0 || meses >= 13);
		
		
		do {
			System.out.println("Menu");
			System.out.println("1. Novo salário (aumentar uma única vez)");
			System.out.println("2. Férias");
			System.out.println("3. Décimo Terceiro");
			System.out.println("4. Sair");
			op = teclado.nextInt();
		switch (op) {
		case 1:
			double aumento;
			if (salario <= 2500) {
				aumento = 0.20;
			} else if (salario <= 4500) {
				aumento = 0.15;
			} else {
				aumento = 0.10;
			}
			double novoSalario = salario + (salario * aumento);
			System.out.printf("O novo salário é de: R$ %.2f com aumento de %.0f%%\n", novoSalario, aumento * 100);

			break;
		case 2:
			double valorFerias = salario + (salario / 3);
			System.out.printf("O valor que você ira receber ao entrar em férias: R$ %.2f\n", valorFerias);
			break;
		case 3:
			double decimoTerceiro = (salario * meses) / 12;
			System.out.printf("O valor do 13º salário é: R$%.2f\n", decimoTerceiro);
			break;
		case 4:
			System.out.println("Saindo...");
			break;
		default:
			System.out.println("Opção inválida!\n");
		}
		
		} while (op != 4);
			
		
		teclado.close();

	}

}
