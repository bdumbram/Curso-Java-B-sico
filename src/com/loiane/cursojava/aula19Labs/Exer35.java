package com.loiane.cursojava.aula19Labs;

import java.util.Random;
import java.util.Scanner;

public class Exer35 {

	public static void main(String[] args) {

		// CORRIGIDO
		Scanner scan = new Scanner(System.in);

		Random rand = new Random();
		int[] vetorA = new int[10];
		
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = scan.nextInt();
			//vetorA[i] = rand.nextInt(30)+1;	
			
		}
		
		for (int i =0; i < vetorA.length; i++) {
			System.out.println();
			System.out.print(vetorA[i] + " = ");
			for (int j =1; j< vetorA[i]; j++) {
				if (vetorA[i] % j == 0) {
					System.out.print(" " +j);
					
				}
				
			}
			
		}
		
		
		
		
		
		
		/*int numero = scan.nextInt();
		int resto = 0;
		int[] vetorDivisores = new int[10];

		vetorDivisores[0] = 1;
		
		for (int i = 2; i <= 10; i++) {
			for (int j = i; j <= numero; j++) {
				if (numero % i == 0) {
					resto = (numero / i);
					System.out.println("i = " + i);
					vetorDivisores[i-1] = i * vetorDivisores[i-2];
					System.out.println("vetor divisores: " + vetorDivisores[i-2]);
					numero = resto;
					System.out.println("resto = " + resto);
				}
			}
		}*/
		
		
		
	}

}