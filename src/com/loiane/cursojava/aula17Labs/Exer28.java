package com.loiane.cursojava.aula17Labs;

import java.util.Scanner;

public class Exer28 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean primo = true;
		
		System.out.println("Entre com um número inteiro:");
		int numero = scan.nextInt();

		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				System.out.println("Não é número primo - divisível por " + i);
				primo = false;
			} 
		}
		if(primo) {
			System.out.println("primo");
		}
	}

}
