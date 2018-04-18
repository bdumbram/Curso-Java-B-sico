package com.loiane.cursojava.aula19Labs;

import java.util.Random;
import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {

		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		int[] arrayA = new int[10];		
		int menorQue15 = 0, igual15 = 0, maiorQue15=0, countMaior=0;

		for (int i = 0; i < arrayA.length; i++) {
			//arrayA[i] = scan.nextInt();
			arrayA[i] = rand.nextInt(20) + 1;			
		}
		
		for (int i = 0; i < arrayA.length; i++) {
			System.out.println(arrayA[i]);
		}

		for (int i = 0; i < arrayA.length; i++) {
			if (arrayA[i] < 15) {				
				menorQue15 += arrayA[i];
			}
			if (arrayA[i] == 15) {
				igual15++;
			}
			if (arrayA[i] > 15) {
				countMaior++;
				maiorQue15 += arrayA[i];
			}
		}
		
		maiorQue15 /= countMaior;
		System.out.println("A soma de elementos armazenados neste vetor que são inferiores a 15: " + menorQue15);
		System.out.println("A quantidade de elementos armazenados no vetor que são iguais a 15: " + igual15);
		System.out.println("A média dos elementos armazenados no vetor que são superiores a 15: " + maiorQue15);

	}

}
