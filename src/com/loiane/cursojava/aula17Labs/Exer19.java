package com.loiane.cursojava.aula17Labs;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantas notas serão calculadas?");
		int qtdNotas = scan.nextInt();
		double notas, media=0, soma=0;
				
		for (int i = 1; i <= qtdNotas; i++) {
			System.out.println("Digite a " + i + "ª nota.");
			notas = scan.nextDouble();
			soma += notas;			
		}
		
		media = soma / qtdNotas;
		
		System.out.println("A soma das Notas é: " + soma);
		System.out.println("A média aritmética é: " + media);

	}

}
