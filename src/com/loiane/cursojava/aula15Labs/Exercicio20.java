package com.loiane.cursojava.aula15Labs;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int culpado = 0;

		System.out.println("Responder com 'S-SIM' ou 'N-Não'");
		System.out.println("Telefonou para a vítima?");
		String resposta = scan.nextLine();
		if (resposta.equalsIgnoreCase("s")) {
			culpado++;
		}
		System.out.println("Esteve no local do crime?");
		resposta = scan.nextLine();
		if (resposta.equalsIgnoreCase("s")) {
			culpado++;
		}
		System.out.println("Mora perto da vítima?");
		resposta = scan.nextLine();
		if (resposta.equalsIgnoreCase("s")) {
			culpado++;
		}
		System.out.println("Devia para a vítima?");
		resposta = scan.nextLine();
		if (resposta.equalsIgnoreCase("s")) {
			culpado++;
		}
		System.out.println("Já trabalhou com a vítima?");
		resposta = scan.nextLine();
		if (resposta.equalsIgnoreCase("s")) {
			culpado++;
		}

		switch (culpado) {
		case 2:
			System.out.println("Suspeito.");
			break;
		case 3:
		case 4:
			System.out.println("Cúmplice.");
			break;
		case 5:
			System.out.println("Assassino.");
			break;
		default:
			System.out.println("Inocente.");
			break;
		}

	}

}
