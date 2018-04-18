package com.loiane.cursojava.aula15Labs;

import java.util.Scanner;

public class exercicio1 {
	
	public static void main(String[] args) {		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite 2 números para saber qual é maior:");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		if(num1 > num2) {
			System.out.println("Maior número é o primeiro: " + num1);
		}else if(num2 > num1) {
			System.out.println("Maior número é o segundo: " + num2);
		}else {
			System.out.println("Os números " + num1 + " e " + num2 + " são iguais.");
		}
		
	}

}
