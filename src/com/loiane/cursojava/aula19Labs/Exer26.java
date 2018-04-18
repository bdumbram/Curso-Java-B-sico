package com.loiane.cursojava.aula19Labs;

import java.util.Random;

public class Exer26 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		int[] vetorC = new int[10];
		
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = rand.nextInt(3)+1;
			vetorB[i] = rand.nextInt(3)+1;
			if (vetorA[i] > vetorB[i]) {
				vetorC[i] = 1;
			}else if (vetorA[i] == vetorB[i]) {
				vetorC[i] = 0;
			}else if (vetorA[i] < vetorB[i]) {
				vetorC[i] = (-1);
			}
		}
		
		System.out.print("Vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.print("Vetor B: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		System.out.println();
		
		System.out.print("Vetor C: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorC[i] + " ");
		}
		System.out.println();

	}

}
