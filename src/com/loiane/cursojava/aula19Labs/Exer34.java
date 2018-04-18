package com.loiane.cursojava.aula19Labs;

import java.util.Random;

public class Exer34 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int[] vetorA = new int[10];
		
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = rand.nextInt(30)+1;	
			System.out.println(vetorA[i]);
		}
		
		for (int i =0; i < vetorA.length; i++) {
			System.out.println();
			System.out.print(vetorA[i] + " = ");
			for (int j =2; j< vetorA[i]; j++) {
				if (j % 2 == 0) {
					System.out.print(" " +j);
					
				}
				
			}
			
		}

	}

}
