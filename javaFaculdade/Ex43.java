package javaFaculdade;

public class Ex43 {

	public static void main(String[] args) {
		
		int vetor[] = new int[10];
		int soma = 0, somaPares = 0, num = 0, maior = 0, menor = 100;
		double mediaPares = 0;
	
		System.out.println("Números gerados:");
		for (int cont = 0; cont < vetor.length; cont++) {
			vetor[cont] = (int)(1+ Math.random()* (100));
			System.out.println(vetor[cont]);
		}
		
		for (int cont = 0; cont < vetor.length; cont++) {
			soma += vetor[cont];
			if (vetor[cont] % 2 == 0) {
				somaPares += vetor[cont];
				num += 1;
				
			}
			
			if (vetor[cont] > maior) {
				maior = vetor[cont];
			}
			
			if (vetor[cont] < menor) {
				menor = vetor[cont];
			}
			
		}
		mediaPares = somaPares / num;
		System.out.printf("A soma é: %d\n",soma);
		System.out.printf("A média dos números pares é: %.2f\n", mediaPares);
		System.out.printf("O menor número é: %d\n", menor);
		System.out.printf("O maior número é: %d\n", maior);
	}

}
