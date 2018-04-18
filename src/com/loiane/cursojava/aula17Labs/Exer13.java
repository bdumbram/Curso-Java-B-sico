package com.loiane.cursojava.aula17Labs;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o número base");
		int base = scan.nextInt();
		int base2 = base;
		System.out.println("Digite o número expoente");
		int expoente = scan.nextInt();

		for (int i = 1; i < expoente; i++) {
			base2 = base2 * base;

		}

		System.out.println("Resultado: " + base2);

	}

}
