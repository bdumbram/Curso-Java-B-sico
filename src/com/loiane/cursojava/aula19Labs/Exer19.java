package com.loiane.cursojava.aula19Labs;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double[] notas1 = new double[10];
		double[] notas2 = new double[10];
		double[] results = new double[10];

		for (int i = 0; i < notas1.length; i++) {
			System.out.println("Entre com a Nota1 do " + (i + 1) + "º aluno.");
			notas1[i] = scan.nextDouble();
		}
		for (int i = 0; i < notas2.length; i++) {
			System.out.println("Entre com a Nota2 do " + (i + 1) + "º aluno.");
			notas2[i] = scan.nextDouble();
		}

		for (int i = 0; i < results.length; i++) {
			results[i] = (notas1[i] + notas2[i]) / 2;
		}

		for (int i = 0; i < results.length; i++) {
			if (results[i] >= 7) {
				System.out.println("Média aritmética do " + (i + 1) + "º aluno: " + results[i] + " - APROVADO");
			}else {
				System.out.println("Média aritmética do " + (i + 1) + "º aluno: " + results[i] + " - REPROVADO");
			}

		}

	}

}
