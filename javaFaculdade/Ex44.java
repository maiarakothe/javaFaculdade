package javaFaculdade;

public class Ex44 {

	public static void main(String[] args) {
		
		int vetor[] = new int[6];
		int  dado = 0, maior = 0, posicao = 0;
		
		for (int cont = 0; cont < 100; cont++) {
			dado = (int)(1+ Math.random()* (6));
			System.out.println(dado);
			
			switch (dado) {
			case 1: vetor[0]++;
				break;
			case 2: vetor[1]++;
				break;
			case 3: vetor[2]++;
				break;
			case 4: vetor[3]++;
				break;
			case 5: vetor[4]++;
				break;
			case 6: vetor[5]++;
				break;
			
		}
		}
		
		for (int cont = 0; cont < 6; cont++ ) {
				if (vetor[cont] > maior) {
					maior = vetor[cont];
					posicao = cont + 1;
				}
		}


		System.out.format("O valor 1 foi sorteado %d vezes\n", vetor[0]);
		System.out.format("O valor 2 foi sorteado %d vezes\n", vetor[1]);
		System.out.format("O valor 3 foi sorteado %d vezes\n", vetor[2]);
		System.out.format("O valor 4 foi sorteado %d vezes\n", vetor[3]);
		System.out.format("O valor 5 foi sorteado %d vezes\n", vetor[4]);
		System.out.format("O valor 6 foi sorteado %d vezes\n", vetor[5]);
		System.out.format("Lado mais sorteado: %d\n", posicao);
		
		}
		
	}
	
