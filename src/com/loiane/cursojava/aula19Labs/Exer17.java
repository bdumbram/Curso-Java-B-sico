package com.loiane.cursojava.aula19Labs;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] arrayA = new int[10];
		int idadeSuperior = 0;

		for (int i = 0; i < arrayA.length; i++) {
			System.out.println("Entre com a " + (i + 1) + "ª idade da pessoa " + (i+1));
			arrayA[i] = scan.nextInt();
			if (arrayA[i] > 35) {
				idadeSuperior++;
			}
		}
		System.out.println(idadeSuperior + " pessoas possuem idade superior a 35 anos");

	}

}
