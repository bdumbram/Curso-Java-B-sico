package com.loiane.cursojava.aula17Labs;

import java.util.Scanner;

public class Exer8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int soma=0, media=0, num;
		
		for(int i = 1; i <= 5; i++) {
			System.out.println("Digite o " +i +"º número inteiro. ");
			num = scan.nextInt();
			soma += num;
			media = (soma / i);
			
		}
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);

	}

}
