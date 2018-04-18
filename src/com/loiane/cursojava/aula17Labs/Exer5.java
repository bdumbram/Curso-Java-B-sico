package com.loiane.cursojava.aula17Labs;

import java.util.Scanner;

public class Exer5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double paisA, paisB, taxaPaisA, taxaPaisB;
		int countAno = 0;
		int sair = 1;
		while (sair == 1) {
			do {
				System.out.println("Entre com a população do país A");
				paisA = scan.nextDouble();
			}while (paisA<= 0);
			do {
				System.out.println("Entre com a taxa anual de crescimento país A");
				taxaPaisA = scan.nextDouble();
			}while (taxaPaisA <=0);
			do {
				System.out.println("Entre com a população do país B");
				paisB = scan.nextDouble();
			}while(paisB <=0);
			do {
				System.out.println("Entre com a taxa anual de crescimento país B");
				taxaPaisB = scan.nextDouble();
			}while(taxaPaisB <=0);			

			for (double i = paisA, j = paisB; paisA <= paisB; paisA = paisA + ((paisA * taxaPaisA) / 100), paisB = paisB
					+ ((paisB * taxaPaisB) / 100)) {
				System.out.println("Anos: " + countAno);
				System.out.println("Pais A: " + paisA);
				System.out.println("Pais B: " + paisB + "\n");
				countAno++;
			}
			System.out.println("\n\nTotal de Anos: " + countAno);
			System.out.println("População Pais A: " + paisA);
			System.out.println("População Pais B: " + paisB);

			System.out.println("\n\nDeseja repetir operação? 0 - Sair / 1 - Continuar ");
			sair = scan.nextInt();
		}
	}

}
