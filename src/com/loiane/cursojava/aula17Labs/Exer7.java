package com.loiane.cursojava.aula17Labs;

import java.util.Scanner;

public class Exer7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int maior= Integer.MIN_VALUE, num=0;
		
		for(int i = 1; i <= 5; i++) {
			System.out.println("Digite o " +i +"º número inteiro. ");
			num = scan.nextInt();			
			if(num >= maior) {
				maior = num;
			}else {
				System.out.println("Número digitado é menor que o anterior");
			}
		}
		System.out.println("Maior: " + maior);

	}

}
