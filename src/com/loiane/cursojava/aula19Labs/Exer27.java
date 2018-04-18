package com.loiane.cursojava.aula19Labs;

import java.util.Random;

public class Exer27 {

	public static void main(String[] args) {

		Random rand = new Random();
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];

		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = rand.nextInt(20) + 1;
			if (vetorA[i] < 7) {
				vetorB[i] = 'a';
			} else if (vetorA[i] == 7) {
				vetorB[i] = 'b';
			} else if (vetorA[i] > 7 && vetorA[i] < 10) {
				vetorB[i] = 'c';
			} else if (vetorA[i] == 10) {
				vetorB[i] = 'd';
			} else if (vetorA[i] > 10) {
				vetorB[i] = 'e';
			}
		}
		
		System.out.println("Vetor A\t\tVetor B");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println(vetorA[i] + "\t\t" + vetorB[i]);
		}
	}

}
