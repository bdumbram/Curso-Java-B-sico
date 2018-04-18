package com.loiane.cursojava.aula15Labs;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double kgMorango, kgMaca, valorMorango, valorMaca;

		System.out.println("informe a quantidade em Kg de morangos vendidos");
		kgMorango = scan.nextInt();
		System.out.println("informe a quantidade em Kg de maças vendidos");
		kgMaca = scan.nextInt();

		if (kgMorango <= 5) {
			valorMorango = kgMorango * 2.50;
			//System.out.println("Valor a ser pago pelos morangos: " + valorMorango);
		} else {
			valorMorango = kgMorango * 2.20;
			if (kgMorango > 8 || valorMorango > 25) {
				valorMorango = (valorMorango * 90) / 100;
				//System.out.println("Valor a ser pago pelos morangos: " + valorMorango);
			} else {
				//System.out.println("Valor a ser pago pelos morangos: " + valorMorango);
			}
		}

		if (kgMaca <= 5) {
			valorMaca = kgMaca * 1.80;
			//System.out.println("Valor a ser pago pelas maças: " + valorMaca);
		} else {
			valorMaca = kgMaca * 1.50;
			if (kgMaca > 8 || valorMaca > 25) {
				valorMaca = (valorMaca * 90) / 100;
				//System.out.println("Valor a ser pago pelas maças: " + valorMaca);
			} else {
				//System.out.println("Valor a ser pago pelas maças: " + valorMaca);
			}
		}
		
		double precoTotal = valorMorango + valorMaca;
		if((kgMorango + kgMaca) > 8 || (valorMorango + valorMaca) > 25) {
			precoTotal = (precoTotal * 90) / 100;
		}
		System.out.println("Valor Morango: " + valorMorango);
		System.out.println("Valor Maça: " + valorMaca);
		System.out.println("Preço Total: " + precoTotal);
	}

}
