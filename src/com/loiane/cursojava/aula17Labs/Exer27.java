package com.loiane.cursojava.aula17Labs;

import java.util.Scanner;

public class Exer27 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int count = 0;
		double menorTemp = Double.MAX_VALUE, maiorTemp = Double.MIN_VALUE, mediaTemp = 0;

		System.out.print("Informe a quantidade de temperaturas: ");
		int qtdTemp = scan.nextInt();

		while (count < qtdTemp) {
			count++;
			System.out.print("Informe a " + count + "ª temperatura:");
			double temp = scan.nextDouble();
			mediaTemp += temp;
			if (menorTemp == 0) {
				menorTemp = temp;
			} else {
				if (temp < menorTemp) {
					menorTemp = temp;
				}
			}
			if (maiorTemp == 0) {
				maiorTemp = temp;
			} else {
				if (temp > maiorTemp) {
					maiorTemp = temp;
				}
			}
		}

		mediaTemp = mediaTemp / qtdTemp;

		System.out.println("Menor Temperatura: " + menorTemp);
		System.out.println("Maior Temperatura: " + maiorTemp);
		System.out.println("Temperatura Média: " + mediaTemp);
	}

}
