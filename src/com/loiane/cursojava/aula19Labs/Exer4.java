package com.loiane.cursojava.aula19Labs;

import java.text.DecimalFormat;

public class Exer4 {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("###,###.##");
		int[] vetorA = new int[15];
		double[] vetorB = new double[15];

		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = i + 1;
			vetorB[i] = Math.sqrt(vetorA[i]);
		}

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Vetor A: " + vetorA[i] + "\tVetor B: " + df.format(vetorB[i]));
		}

	}

}
