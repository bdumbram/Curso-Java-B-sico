package com.loiane.cursojava.aula19Labs;

import java.util.Random;
import java.util.Scanner;

public class Exer31 {

	public static void main(String[] args) {

		// CORRIGIDO
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[20];
		int[] vetorB = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = scan.nextInt();
		}
		int posB = 0;
		for (int i = 0; i < vetorA.length; i++) {
			if(vetorA[i] % 2 == 0) {
				vetorB[posB] = vetorA[i];
				posB++;
			}

		}
		for (int i = 0; i < vetorA.length; i++) {
			if(vetorA[i] % 2 != 0) {
				vetorB[posB] = vetorA[i];
				posB++;
			}

		}

		System.out.println("Vetor A\t\tVetor B");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.println(vetorA[i] + "\t\t" + vetorB[i]);
		}

	}

}
