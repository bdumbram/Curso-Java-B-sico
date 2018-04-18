package com.loiane.cursojava.aula19Labs;

import java.util.Random;

public class Exer25 {
	
	public static void main(String[] args) {
		
		Random rand = new Random();
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = rand.nextInt(10)+1;
			//sugestão correção operador condicional ternário
			vetorB[i] = (vetorA[i] % 2 == 0) ? 1 : 0;
			
			/*if (vetorA[i] % 2==0) {
				vetorB[i] = 1;
			}else {
				vetorB[i] = 0;
			}*/			
		}
		System.out.println("Vetor A\t\tVetor B");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println(vetorA[i] + "\t\t" + vetorB[i]);
		}
		
	}

}
