package com.loiane.cursojava.aula19Labs;

public class Exer6 {

	public static void main(String[] args) {

		int[] arrayA = new int[10];
		int[] arrayB = new int[10];
		int[] arrayC = new int[10];

		for (int i = 0; i < arrayA.length; i++) {
			arrayA[i] = i + 1;
			arrayB[i] = arrayA[i] + 1;
			arrayC[i] = arrayA[i] + arrayB[i];
		}

		for (int i = 0; i < arrayA.length; i++) {
			System.out.println("Array A: " + arrayA[i] + "\t+ \tArray B: " + arrayB[i] + "\t= \tArray C: " + arrayC[i]);
		}

	}

}
