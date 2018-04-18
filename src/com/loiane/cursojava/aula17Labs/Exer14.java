package com.loiane.cursojava.aula17Labs;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int soma=0, countP=0, countI=0;
		
		for (int i = 1; i <=10; i++) {
			System.out.println("Entre com o " + i + "º número");
			int num = scan.nextInt();
			soma += num;
			if(num % 2 ==0) {
				countP++;
				System.out.println("Número " + num + " é par.");
			}else {
				countI++;
				System.out.println("Número " + num + " é impar.");
			}
		}
		
		System.out.println("\nSoma dos números: " + soma);
		System.out.println("Números pares: " + countP);
		System.out.println("Números impares: " + countI);
	}

}
