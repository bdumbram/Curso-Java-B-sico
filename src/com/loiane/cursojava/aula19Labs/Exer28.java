package com.loiane.cursojava.aula19Labs;

import java.util.Random;
import java.util.Scanner;

public class Exer28 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		/*sugestão correção
		for (int i = 0; i< vetorA.length; i++) {
			vetorA[i] = scan.nextInt();
			vetorB[vetorA.length - i - 1] = vetorA[i];
		}*/
		
		for (int i = 0, j = vetorB.length-1; i < vetorA.length; i++, j--) {
			vetorA[i] = rand.nextInt(10) + 1;
			vetorB[j] = vetorA[i];
		}
		
		System.out.println("Vetor A\t\tVetor B");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println(vetorA[i] + "\t\t" + vetorB[i]);
		}
		
	}

}
