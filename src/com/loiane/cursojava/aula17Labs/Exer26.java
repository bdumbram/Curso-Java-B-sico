package com.loiane.cursojava.aula17Labs;

import java.util.Scanner;

public class Exer26 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int fatorial=1;
		System.out.println("Entre com um número inteiro:");
		int numero = scan.nextInt();
		
		System.out.println("fatorial de :" + numero);
		for(int i = numero; i>=1;i--) {			
			fatorial = fatorial* i;			
		}
		System.out.print(numero + "! = " + numero);
		for (int j = (numero-1); j >= 1; j--) {
		System.out.print(" . " + j);
		}
		System.out.print(" = " + fatorial);

	}

}
