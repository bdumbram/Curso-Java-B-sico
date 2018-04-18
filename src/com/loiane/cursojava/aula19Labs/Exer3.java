package com.loiane.cursojava.aula19Labs;

public class Exer3 {

	public static void main(String[] args) {

		int[] vetorA = new int[15];
		int[] vetorB = new int[15];

		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = i + 1;
			vetorB[i] = vetorA[i] * vetorA[i];
		}
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("Vetor B = ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}


	}

}
