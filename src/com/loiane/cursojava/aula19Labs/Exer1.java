package com.loiane.cursojava.aula19Labs;

public class Exer1 {

	public static void main(String[] args) {

		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = i + 1;
			vetorB[i] = vetorA[i];
		}

		System.out.println("Vetor A:\tVetor B");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println(vetorA[i]+ "\t\t" + vetorB[i]);
		}
		
	}

}
