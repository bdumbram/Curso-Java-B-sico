package com.loiane.cursojava.aula15Labs;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double prod1, prod2, prod3;
		
		System.out.println("Digite o preço do primeiro produto:");
		prod1 = scan.nextDouble();
		System.out.println("Digite o preço do segundo produto:");
		prod2 = scan.nextDouble();
		System.out.println("Digite o preço do terceiro produto:");
		prod3 = scan.nextDouble();
		
		if(prod1 <= prod2 && prod1 <= prod3) {
			System.out.println("Comprar o primeiro produto, preço: " + prod1);			
		}else if (prod2 <= prod1 && prod2 <= prod3) {
			System.out.println("Comprar o segundo produto, preço: " + prod2);
		}else if (prod3 <= prod1 && prod3 <= prod2) {
			System.out.println("Comprar o terceiro produto, preço: " + prod3);
		}

	}

}

