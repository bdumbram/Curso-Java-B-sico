package com.loiane.cursojava.aula19Labs;

import java.util.Scanner;

public class Exer37 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int [15];
		int[] vetorB = new int [15];				
		
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = scan.nextInt();
			vetorB[i] = vetorA[i];
			for (int j = vetorA[i]-1; j >1; j--) {							
				vetorB[i] *=  (j);				
			}
			
			System.out.println("Fatoria de " + vetorA[i] + " é :" + vetorB[i]);
		}

	}

}
