package com.loiane.cursojava.aula15Labs;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double precoAlcool = 1.90, custo, precoGas = 2.50, litros;

		System.out.println("Informe o tipo de combustível vendido A-álcool e G-gasolina.");
		char combustivel = scan.next().charAt(0);
		System.out.println("Informe a quantidade de litros vendidos.");
		litros = scan.nextDouble();

		if (combustivel == 'A') {
			if (litros <= 20) {
				precoAlcool = (precoAlcool * 97) / 100;
				custo = litros * precoAlcool;
				System.out.println("Valor a ser pago: " + custo);
			} else {
				precoAlcool = (precoAlcool * 95) / 100;
				custo = litros * precoAlcool;
				System.out.println("Valor a ser pago: " + custo);
			}

		} else if (combustivel == 'G') {
			if (litros <= 20) {
				precoGas = (precoGas * 96) / 100;
				custo = litros * precoGas;
				System.out.println("Valor a ser pago: " + custo);
			} else {
				precoGas = (precoGas * 94) / 100;
				custo = litros * precoGas;
				System.out.println("Valor a ser pago: " + custo);
			}
		}
	}

}
