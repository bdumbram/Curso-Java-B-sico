package com.loiane.cursojava.aula19Labs;

import java.util.Scanner;

public class Exer33 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		boolean primo = true;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o " + (i + 1) + "º valor para o vetor A");
			vetorA[i] = scan.nextInt();
		}

		for (int i = 0; i < vetorA.length; i++) {
			for (int j = 2; j < vetorA[i]; j++) {
				if (vetorA[i] % j == 0) {
					System.out.println(vetorA[i] + " Não é número primo divisível por " + j);
					primo = false;
					break;
				}
			}
			if (primo) {
				primo = true;
				System.out.println(vetorA[i] + " É primo");
			}

		}

	}

}
