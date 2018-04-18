package com.loiane.cursojava.aula17Labs;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int fatorial=1;
		System.out.println("Entre com um número inteiro:");
		int numero = scan.nextInt();
		
		for(int i = numero; i>=1;i--) {			
			fatorial *= i;			
		}
		System.out.println("fatorial de " + numero + " é " + fatorial);

	}

}
