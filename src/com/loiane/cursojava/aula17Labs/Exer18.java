package com.loiane.cursojava.aula17Labs;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		System.out.println("Entre com um número inteiro:");
		int numero = scan.nextInt();
		boolean primo = true;
		
		//correção com for
		for (int i =2; i < numero; i++) {
			if(numero % i == 0) {
				System.out.println("Não é número primo - divisível por " + i);
				primo = false;
			}
		}
		if (primo) {
			System.out.println("é primo");
		}
		
		//incorreto
		/*if(numero % 2 == 0){
			System.out.println("Não é número primo.");
		}else {
			System.out.println("Número primo.");
		}*/

	}

}
