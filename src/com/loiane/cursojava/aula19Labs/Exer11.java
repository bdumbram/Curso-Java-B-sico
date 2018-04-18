package com.loiane.cursojava.aula19Labs;

public class Exer11 {

	public static void main(String[] args) {
		
		int[] arrayA = new int[10];
		int qtdPares=0;
		
		for (int i = 0; i < arrayA.length; i++) {
			arrayA[i] = i+1;
			if(arrayA[i] % 2 == 0) {
				System.out.println("par: " + arrayA[i]);
				qtdPares++;				
			}
		}
		System.out.println("\nQuantidade de pares: " + qtdPares);

	}

}
