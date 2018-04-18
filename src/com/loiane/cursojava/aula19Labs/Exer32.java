package com.loiane.cursojava.aula19Labs;

import java.util.Random;
import java.util.Scanner;

public class Exer32 {

	public static void main(String[] args) {

		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[5];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com um valor para o Vetor");
			vetorA[i] = scan.nextInt();
			//vetorA[i] = rand.nextInt(10) + 1;
		}
		System.out.println();
		for (int i = 0; i < vetorA.length; i++) {
			for (int j = 1; j < 11; j++) {
				System.out.println(vetorA[i] + " * " + j + " = " + (vetorA[i] * j));
			}
			System.out.println();
		}

	}

}
