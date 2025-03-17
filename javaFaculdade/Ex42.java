package javaFaculdade;

import java.util.Scanner;

public class Ex42 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String vetor[] =  new String[5];
		
		for (int cont = 0; cont < vetor.length; cont++) {
			vetor[cont] = teclado.nextLine();
			
		}
		
		 System.out.println("\nOrdem de leitura:");
	        for (String valor : vetor) {
	            System.out.println(valor);
	        }
	    
	    System.out.println("\nOrdem invertida:");
	    	for (int cont = vetor.length - 1; cont >= 0; cont--) {
	            System.out.println(vetor[cont]);
	        }
	    	
	    teclado.close();
	}
}
