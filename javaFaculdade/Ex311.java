package javaFaculdade;

public class Ex311 {

	public static void main(String[] args) {
		
		int paisA, paisB, anos;
		double cresA, cresB;
		paisA = 100000;
		paisB = 200000;
		
		cresA = 0.05;
		cresB = 0.02;
		
		for (anos = 0; paisA < paisB; anos++ ) {
			paisA += paisA * cresA;
			paisB += paisB * cresB;
			
		}
		System.out.printf("Serão necessários %d anos", anos);
	}

}