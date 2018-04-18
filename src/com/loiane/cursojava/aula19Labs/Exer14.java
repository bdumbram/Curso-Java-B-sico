package com.loiane.cursojava.aula19Labs;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] arrayA = new int[10];
		int media = 0, count = 0;

		for (int i = 0; i < arrayA.length; i++) {
			System.out.println("Entre com o " + (i + 1) + "º valor inteiro para o Array:");
			arrayA[i] = scan.nextInt();
			if (arrayA[i] % 2 != 0) {
				count++;
				System.out.println("O valor " + arrayA[i] + " é impar");
				media += arrayA[i];
			}
		}
		media = media / count;
		System.out.println("A média simples dos valores ímpares são: " + media);

	}
}
