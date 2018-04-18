package com.loiane.cursojava.aula17Labs;

import java.util.Scanner;

public class Exer30 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um número inteiro para calcular a tabuada:");
		int numTabuada = scan.nextInt();
		System.out.println("Por qual número começar a tabuada?");
		int inicio = scan.nextInt();
		System.out.println("Terminar em qual número a tabuada?");
		int terminar = scan.nextInt();
		do {
			if (inicio > terminar) {
				System.out.println("O número final é maior que o de inicio, entre com outro número");
				terminar = scan.nextInt();
			}

		} while (inicio > terminar);

		System.out.println("Vou mostrar a tabuada de " + numTabuada + " começando em " + inicio + " e terminando em "
				+ terminar + ":");
		for (int i = inicio; i <= terminar; i++) {
			int resultado = numTabuada * i;
			System.out.println(numTabuada + " X " + i + " = " + resultado);
		}

	}

}
