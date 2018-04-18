package com.loiane.cursojava.aula17Labs;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número para obter a tabuada");
		int num = scan.nextInt();

		System.out.println("Tabuada do " + num + ":\n");
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " X " + i + "= " + (num * i));
		}

	}

}
