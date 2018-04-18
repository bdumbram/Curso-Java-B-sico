package com.loiane.cursojava.aula19Labs;

import java.util.Random;

public class Exer30 {

	public static void main(String[] args) {

		Random rand = new Random();
		int[] vetorA = new int[20];
		int[] vetorB = new int[20];
		int[] vetorC = new int[20];

		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = rand.nextInt(10) + 1;
			/*if (vetorA[i] % 2 == 0) {
				vetorB[i] = vetorA[i];
			} else {
				vetorC[i] = vetorA[i];
			}*/
		}
		int posB=0;
		int posC=0;
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 == 0) {
				vetorB[posB] = vetorA[i];
				posB++;
			} else {
				vetorC[posC] = vetorA[i];
				posC++;
			}
		}
		
		
		System.out.print("Vetor A = ");
		for (int i=0; i<vetorA.length;i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.print("Vetor B = ");
		for (int i=0; i<posB;i++) {
			System.out.print(vetorB[i] + " ");
		}
		System.out.println();
		
		System.out.print("Vetor C = ");
		for (int i=0; i<posC;i++) {
			System.out.print(vetorC[i] + " ");
		}
		System.out.println();

	}

}
