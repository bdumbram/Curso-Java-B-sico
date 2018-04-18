package com.loiane.cursojava.aula19Labs;

public class Exer10 {
	
	public static void main(String[] args) {
		
		int[] arrayA = new int[10];
		int[] arrayB = new int[10];
		
		for (int i=0; i < arrayA.length; i++) {
			arrayA[i] = i+1;
			arrayB[i] = arrayA[i] % 2;			
		}
		
		
		
		for (int i=0; i< arrayB.length; i++) {
			System.out.println("Array A: " + arrayA[i] + "\tArray B: " + arrayB[i]);
		}
	}

}
