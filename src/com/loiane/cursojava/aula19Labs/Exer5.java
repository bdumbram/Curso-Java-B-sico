package com.loiane.cursojava.aula19Labs;

public class Exer5 {

	public static void main(String[] args) {
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];

		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = i + 1;
			vetorB[i] = vetorA[i] * i;
		}

		for (int i = 0; i <  vetorA.length; i++) {
			System.out.println(vetorA[i] + " X " + i +  " = " + vetorB[i]);
		}		

	}

}
