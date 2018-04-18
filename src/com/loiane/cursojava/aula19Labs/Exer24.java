package com.loiane.cursojava.aula19Labs;

import java.util.Scanner;

public class Exer24 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] vetor = new int[10];
		boolean palindromo = true;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Entre com um valor inteiro posição: " + (i+1));
			vetor[i] = scan.nextInt();
		}
		for (int i = 0, j = vetor.length - 1; i < vetor.length; i++, j--) {
			if (vetor[i] == vetor[j]) {
				System.out.println("Posição " + (i + 1) + " valor: " + vetor[i] + " Posição " + (j + 1) + " valor: " + vetor[j]);								
			} else {				
				palindromo  = false;
				break;
			}
		}
		if (palindromo) {
			System.out.print("É um palíndromo:\t");
			for (int i=0; i< vetor.length; i++) {
				System.out.print(vetor[i]);
			}
		}else {
			System.out.print("Não é um palíndromo:\t");
			for (int i=0; i< vetor.length; i++) {
				System.out.print(vetor[i]);
			}
		}
		
	}
}
