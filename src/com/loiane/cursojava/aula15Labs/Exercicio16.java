package com.loiane.cursojava.aula15Labs;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double a, x, b, c;
		System.out.println("Para calcular a equação de segundo grau entre com o valor de a");
		a = scan.nextDouble();
		if (a != 0) {
			System.out.println("Agora entre com o valor de b");
			b = scan.nextDouble();
			System.out.println("Agora entre com o valor de c");
			c = scan.nextDouble();

			double delta = Math.pow(b, 2) - 4 * a * c;
			if (delta < 0) {
				System.out.println("a equação não possui raizes reais. Encerrando o programa ");

			} else {
				double xpo = ((-b) + Math.sqrt(delta)) / 2 * a;
				double xne = ((-b) - Math.sqrt(delta)) / 2 * a;

				System.out.println("delta: " + delta);
				System.out.println("Raís positiva: " + xpo + "\nRaíz negativa: " + xne);
			}

		} else {
			System.out.println("A é igual a 0, equação não é do segundo grau. Bye.");
		}

	}
}
