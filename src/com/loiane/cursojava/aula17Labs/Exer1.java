package com.loiane.cursojava.aula17Labs;

import java.util.Scanner;

public class Exer1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double nota;
		
		do {
			System.out.println("Entre com uma nota de 0 á 10");
			nota = scan.nextDouble();
			if(nota < 0 || nota > 10) {
				System.out.println("Valor inválido");
			}
		}while(nota < 0 || nota > 10);
		
		System.out.println("Nota correta!");

	}

}
