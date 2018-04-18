package com.loiane.cursojava.aula19Labs;

public class Exer2 {

	public static void main(String[] args) {

		int[] vetorA = new int[8];
		int[] vetorB = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = i + 1;
			vetorB[i] = vetorA[i] * 2;
		}

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Vetor A: " + vetorA[i] + "\tVetor B: " + vetorB[i]);
		}

	}

}
