package com.loiane.cursojava.aula15Labs;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double nota1, nota2, media;
		
		System.out.println("Digite a primeira nota");
			nota1 = scan.nextDouble();
		System.out.println("Digite a segunda nota");
			nota2 = scan.nextDouble();
		media = (nota1 + nota2) / 2;	
		
		if (media >=7 && media < 10) {
			System.out.println("Aprovado");			
		}else if (media < 7) {
			System.out.println("Reprovado");
		}else {
			System.out.println("Aprovado com Distinção");
		}

	}

}
