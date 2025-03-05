package javaFaculdade;

import java.util.Scanner;

public class ex33 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o dia: ");
        int dia1 = teclado.nextInt();
        System.out.println("Informe o mês: ");
        int mes1 = teclado.nextInt();
        System.out.println("Informe o ano: ");
        int ano1 = teclado.nextInt();

        System.out.println("Informe outra data: ");
        
        System.out.println("Informe o dia: ");
        int dia2 = teclado.nextInt();
        System.out.println("Informe o mês: ");
        int mes2 = teclado.nextInt();
        System.out.println("Informe o ano: ");
        int ano2 = teclado.nextInt();
        
        System.out.println("------------------");
        System.out.println("Data maior: ");

        if (ano1 > ano2 || (ano1 == ano2 && mes1 > mes2) || (ano1 == ano2 && mes1 == mes2 && dia1 > dia2)) {
            System.out.println(dia1 + "/" + mes1 + "/" + ano1);
        } else if (ano2 > ano1 || (ano1 == ano2 && mes2 > mes1) || (ano1 == ano2 && mes1 == mes2 && dia2 > dia1)) {
            System.out.println(dia2 + "/" + mes2 + "/" + ano2);
        } else {
            System.out.println("As datas são iguais: " + dia1 + "/" + mes1 + "/" + ano1);
        }

        teclado.close();
	}

}
