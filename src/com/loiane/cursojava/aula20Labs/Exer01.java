package com.loiane.cursojava.aula20Labs;

import java.util.Random;

public class Exer01 {

	public static void main(String[] args) {

		int[][] matrizM = new int[4][4];
		int maior = Integer.MIN_VALUE, posicaoLinha = 0, posicaoColuna = 0;
		Random rand = new Random();

		for (int i = 0; i < matrizM.length; i++) {

			for (int j = 0; j < matrizM[i].length; j++) {

				matrizM[i][j] = rand.nextInt(9) + 0;

				if (matrizM[i][j] >= maior) {
					maior = matrizM[i][j];
					posicaoLinha = i;
					posicaoColuna = j;
				}

			}

		}

		for (int i = 0; i < matrizM.length; i++) {

			System.out.print("Linha " + i + " = ");

			for (int j = 0; j < matrizM[i].length; j++) {

				// System.out.print(" Coluna " + j);
				System.out.print(matrizM[i][j] + " ");
			}

			System.out.println();

		}

		System.out.println("\nMaior número = " + maior);
		System.out.println("Linha = " + posicaoLinha + " Coluna = " + posicaoColuna);

	}

}
