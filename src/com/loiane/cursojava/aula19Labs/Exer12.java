package com.loiane.cursojava.aula19Labs;

public class Exer12 {

	public static void main(String[] args) {

		int[] arrayA = new int[10];
		int aux=0;

		for (int i = 0; i < arrayA.length; i++) {
			arrayA[i] = i+1;
			System.out.println("Array A " + i + "ª posição :" + arrayA[i]); 
			aux += arrayA[i];			
		}
		System.out.println("\nSoma dos elementos do vetor: " + aux);
	}

}
