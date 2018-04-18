package com.loiane.cursojava.aula19Labs;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] idades = new int[10];
		int menorIdade = Integer.MAX_VALUE, maiorIdade = Integer.MIN_VALUE;
		int indexMenor=0, indexMaior=0;
		

		for (int i = 0; i < idades.length; i++) {
			System.out.println("Entre com a " + (i + 1) + "ª idade da pessoa " + (i+1));
			idades[i] = scan.nextInt();
			if (menorIdade > idades[i]) {
				menorIdade = idades[i];
				indexMenor = i+1;
			}
			if (maiorIdade < idades[i]) {
				maiorIdade = idades[i];
				indexMaior = i+1;
			}
		}
		System.out.println("Menor idade: " + menorIdade + " - Posição: " + indexMenor);
		System.out.println("Maior idade: " + maiorIdade + " - Posição: " + indexMaior);

	}

}
