package com.loiane.cursojava.aula17Labs;

import java.util.Scanner;

public class Exer29 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean primo;

		System.out.println("Entre com um número inteiro maior que 1:");
		int numero = scan.nextInt();
		
		for (int i = 1; i <= numero; i++) {

			primo = true;

			for (int j = 2; j < i; j++) {

				if (i % j == 0) {
					primo = false;
				}
			}
			
			if(primo) {
				System.out.println(i);
			}

		}
	}

}
