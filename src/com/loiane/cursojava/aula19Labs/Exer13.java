package com.loiane.cursojava.aula19Labs;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
		int[] arrayA = new int[10];
		int soma=0;
		
		for (int i=0; i<arrayA.length; i++) {
			System.out.println("Entre com o " + (i+1) +  "º valor inteiro para o Array:");
			arrayA[i] = scan.nextInt();			
			if (arrayA[i] % 5 == 0) {
				System.out.println("O valor " + arrayA[i] + " é múltiplo de 5");
				soma += arrayA[i];				
			}			
		}
		System.out.println("Soma dos valores múltiplos de 5: " + soma);
	}

}
