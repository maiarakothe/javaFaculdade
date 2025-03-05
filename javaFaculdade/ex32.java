package javaFaculdade;

import java.util.Scanner;

public class ex32 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o dia: ");
		int dia1 = teclado.nextInt();
		System.out.println("Informe mês: ");
		int mes1 = teclado.nextInt();
		
		System.out.println("Informe outra data: ");
		
		System.out.println("Informe o dia: ");
		int dia2 = teclado.nextInt();
		System.out.println("Informe o mês: ");
		int mes2 = teclado.nextInt();
		
		System.out.println("------------------");
		System.out.println("Data maior: ");
		
		if (mes1 > mes2 || (mes1 == mes2 && dia1 > dia2)) {
            System.out.println(dia1 + "/" + mes1);
        } else if (mes2 > mes1 || (mes1 == mes2 && dia2 > dia1)) {
            System.out.println(dia2 + "/" + mes2);
        } else {
            System.out.println("As datas são iguais: " + dia1 + "/" + mes1);
        }
		
		teclado.close();
	}

}
