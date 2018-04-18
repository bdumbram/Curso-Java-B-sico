package com.loiane.cursojava.aula19Labs;

import java.util.Random;

public class Exer23 {

	public static void main(String[] args) {

		Random rand = new Random();
		int[] vetorA = new int[10];
		boolean par = true;

		for (int i = 0; i < vetorA.length; i++) {
			if (par) {
				vetorA[i] = rand.nextInt(20)+1;
				if (vetorA[i] % 2 == 0) {
					System.out.println("Par: " + vetorA[i]);
				} else {
					System.out.println("[Impar: " + vetorA[i]);
					par = false; //break;
					System.out.println(par);
				}
			}

		}
	}
}
