package com.loiane.cursojava.aula19Labs;

public class Exer22 {

	public static void main(String[] args) {
		
		int[] vetorA = new int[10];
		double countZero=0, countOne=0;
		
		for (int i=0; i<vetorA.length; i++) {
			vetorA[i] = (int)Math.round(Math.random()*1);
			if (vetorA[i] == 0) {
				countZero++;				
			}
			if (vetorA[i] == 1) {
				countOne++;
			}
		}
		
		countZero = (countZero / vetorA.length) * 100;
		countOne = (countOne / vetorA.length) * 100;
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Elemento " + (i+1) + ": " + vetorA[i]);			
		}
		
		System.out.println("Percentual de números 0's: " + countZero + "%");
		System.out.println("Percentual de números 1's: " + countOne + "%");

	}

}
