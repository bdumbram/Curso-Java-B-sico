package com.loiane.cursojava.aula19Labs;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] arrayA = new int[10];
		float par = 0, impar = 0;

		for (int i = 0; i < arrayA.length; i++) {
			System.out.println("Entre com o " + (i + 1) + "º valor inteiro para o Array:");
			arrayA[i] = scan.nextInt();
			if (arrayA[i] % 2 == 0) {
				par++;
				System.out.println(arrayA[i] + " é par");
			} else {
				impar++;
				System.out.println(arrayA[i] + " é impar");
			}

		}
		//sugestão correção: par = arrayA.length - impar;
		par = (par / arrayA.length) * 100;
		impar = (impar / arrayA.length) * 100;
		System.out.println("Percentual de números pares: " + par + "%");
		System.out.println("Percentual de números impares: " + impar + "%");

	}
}
