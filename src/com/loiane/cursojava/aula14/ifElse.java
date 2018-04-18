package com.loiane.cursojava.aula14;

import java.util.Scanner;

public class ifElse {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("Entre com sua idade:");
		
		int idade = scan.nextInt();
		
		if (idade >= 18) {
			System.out.println("É maio de idade.");
		} else {
			System.out.println("Não é maio de idade.");
		}*/
		
		System.out.println("Entre com preço de um item:");
		double valor = scan.nextDouble();
		if (valor <= 10) {
			System.out.println("Comprar.");
		} else if (valor > 10 && valor < 15) {
			System.out.println("Pedir desconto");
		} else if (valor > 15 && valor < 17) {
			System.out.println("Pesquisar.");
		} else {
			System.out.println("Não comprar.");
		}

	}

}
