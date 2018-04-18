package com.loiane.cursojava.aula15Labs;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número positivo ou negativo.");
		double numero = scan.nextDouble();
		
		if (numero > 0) {
			System.out.println("O Número é positivo.");
		}else if(numero < 0) {
			System.out.println("O Número é negativo.");
		} else {
			System.out.println("Número nulo.");
		}
		
	}

}
