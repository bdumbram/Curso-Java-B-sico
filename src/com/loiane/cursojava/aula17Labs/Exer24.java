package com.loiane.cursojava.aula17Labs;

import java.util.Scanner;

public class Exer24 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int item=0;
		double precoPao = 1.99;
		
		System.out.println("Entre com o preço do pão:");
		precoPao = scan.nextDouble();
		System.out.println("\t\tPanificadora Pão de Ontem  - Tabela de Preços");
		System.out.println("\t\tNúmero Item\t\t\tValor Item");
		for (item=1; item <=50; item++) {
			System.out.println("\t\t" + item + "\t\t\t\tR$ " + precoPao * item);
		}
		
	}

}
