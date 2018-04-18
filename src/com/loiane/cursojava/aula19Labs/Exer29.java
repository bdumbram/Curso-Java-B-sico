package com.loiane.cursojava.aula19Labs;

import java.util.Random;

public class Exer29 {

	public static void main(String[] args) {

		Random rand = new Random();
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length + vetorB.length];

		for (int i = 0, j = 10; i < vetorA.length; i++, j++) {
			vetorA[i] = rand.nextInt(10) + 1;
			vetorB[i] = rand.nextInt(10) + 1;
			vetorC[i] = vetorA[i];
			vetorC[j] = vetorB[i];
		}

		System.out.println("Vetor A\t\tVetor B");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println(vetorA[i] + "\t\t" + vetorB[i]);
		}
		System.out.println("Vetor C - A\t\tVetorC - B");
		for (int i = 0, j = 10; i < vetorA.length; i++, j++) {
			System.out.println(vetorC[i] + "\t\t" + vetorC[j]);
		}
	}

}
