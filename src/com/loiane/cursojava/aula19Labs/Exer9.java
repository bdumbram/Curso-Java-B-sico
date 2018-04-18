package com.loiane.cursojava.aula19Labs;

import java.util.Scanner;

public class Exer9 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arrayA = new int[10];
		int[] arrayB = new int[10];
		int[] arrayC = new int[10];
		
		for (int i=0; i<arrayC.length; i++) {
			System.out.println("Entre com o " + (i+1) + "º valor inteiro para o Array A.");
			arrayA[i] = scan.nextInt();
			System.out.println("Entre com o " + (i+1) + "º valor inteiro para o Array B.");
			arrayB[i] = scan.nextInt();
			arrayC[i] = arrayA[i] / arrayB[i];
		}
		// usar DecimalFormat para inteiros
		for (int i = 0; i < arrayC.length; i++) {
			System.out.println("Array A: " + arrayA[i] + " / " + "Array B: " + arrayB[i] + " = " + "Array C: " + arrayC[i]);
		}
		
	}

}
