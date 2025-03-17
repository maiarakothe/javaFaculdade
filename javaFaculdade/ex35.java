package javaFaculdade;

import java.util.Calendar;

public class Ex35 {

	public static void main(String[] args) {
		Calendar calendario = Calendar.getInstance();
		int mes = calendario.get(Calendar.MONTH);
		int dia = calendario.get(Calendar.DAY_OF_MONTH);
		
		System.out.printf("Dia = %d\n", dia);
		System.out.println("Mês:");
		
		switch (mes) {
		case 0 :
			System.out.println("Janeiro");
			break;
		case 1 :
			System.out.println("Fevereiro");
			break;
		case 2 :
			System.out.println("Março");
			break;
		case 3 :
			System.out.println("Abril");
			break;
		case 4 :
			System.out.println("Maio");
			break;
		case 5 :
			System.out.println("Junho");
			break;
		case 6 :
			System.out.println("Julho");
			break;
		case 7 :
			System.out.println("Agosto");
			break;
		case 8 :
			System.out.println("Setembro");
			break;
		case 9 :
			System.out.println("Outubro");
			break;
		case 10 :
			System.out.println("Novembro");
			break;
		case 11 :
			System.out.println("Dezembro");
			break;
		}


	}

}
