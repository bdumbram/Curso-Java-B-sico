package com.loiane.cursojava.aula17Labs;

public class Exer16 {

	public static void main(String[] args) {

		//CORREÇÃO
		int primeiro = 1, segundo = 1, proximo = 0;

		System.out.println(primeiro);
		System.out.println(segundo);

		while (proximo <= 500) {
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;

			System.out.println(proximo);
		}

	}

}
