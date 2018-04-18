package com.loiane.cursojava.aula15Labs;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String conceito = null;
		
		System.out.println("Entre com a primeira nota");
		double nota1 = scan.nextDouble();
		System.out.println("Entre com a segunda nota");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if (media >= 9 && media <= 10) {
			conceito = "A";
		} else if (media >= 7.5 && media < 9) {
			conceito = "B";
		} else if (media >= 6 && media < 7.5) {
			conceito = "C";
		} else if (media >= 4 && media < 6) {
			conceito = "D";
		} else if (media >= 0 && media < 4) {
			conceito = "E";
		}
		
		System.out.println("Nota 1: " + nota1);
		System.out.println("Nota 2: " + nota2);
		System.out.println("Média: " + media);
		System.out.println("Conceito: " + conceito);
		
		switch (conceito) {
		case "A":
		case "B":
		case "C":
			System.out.println("APRODAVO.");
			break;
		case "D":
		case "E":
			System.out.println("REPRODAVO.");
			break;

		}
		
		/*switch (conceito) {
		case "A":
			System.out.println("Primeira Nota: " + nota1 + " - Segunda Nota: " + nota2 + " - Média: " + media
					+ " - Conceito: " + conceito + " - APROVADO");
			break;
		case "B":
			System.out.println("Primeira Nota: " + nota1 + " - Segunda Nota: " + nota2 + " - Média: " + media
					+ " - Conceito: " + conceito + " - APROVADO");
			break;
		case "C":
			System.out.println("Primeira Nota: " + nota1 + " - Segunda Nota: " + nota2 + " - Média: " + media
					+ " - Conceito: " + conceito + " - APROVADO");
			break;
		case "D":
			System.out.println("Primeira Nota: " + nota1 + " - Segunda Nota: " + nota2 + " - Média: " + media
					+ " - Conceito: " + conceito + " - REPROVADO");
			break;
		case "E":
			System.out.println("Primeira Nota: " + nota1 + " - Segunda Nota: " + nota2 + " - Média: " + media
					+ " - Conceito: " + conceito + " - REPROVADO");
			break;

		}*/

	}

}
