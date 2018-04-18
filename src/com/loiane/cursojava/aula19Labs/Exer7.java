package com.loiane.cursojava.aula19Labs;

import java.util.Scanner;

public class Exer7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arrayA = new int[10];
		int[] arrayB = new int[10];
		int[] arrayC = new int[10];
		
		for (int i =0; i< arrayA.length; i++) {
			System.out.println("Entre com um valor inteiro para o array A, posição " + (i+1));
			arrayA[i] = scan.nextInt();
			System.out.println("Entre com um valor inteiro para o array B, posição " + (i+1));
			arrayB[i] = scan.nextInt();
			arrayC[i] = arrayA[i] - arrayB[i];
		}
		
		for (int i =0; i< arrayA.length; i++) {
			System.out.println("Array A: " + arrayA[i] + " - \tArray B: " + arrayB[i] + " = \tArray C: " + arrayC[i]);
		}

	}

}
