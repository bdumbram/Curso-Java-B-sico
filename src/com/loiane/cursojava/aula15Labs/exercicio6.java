package com.loiane.cursojava.aula15Labs;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num1, num2, num3, maior;
		
		System.out.println("Digite o primeiro número:");
			num1 = scan.nextInt();
		System.out.println("Digite o segundo número:");	
			num2 = scan.nextInt();
		System.out.println("Digite o terceiro número:");
			num3 = scan.nextInt();
		
		if(num1 >= num2 && num1 >= num3 ) {
			maior = num1;
			System.out.println("o primeiro número é o maior." + maior);
		}else if (num2 >= num1 && num2 >= num3) {
			maior = num2;
			System.out.println("o segundo número é o maior." + maior);
		}else {
			maior = num3;
			System.out.println("o terceiro número é o maior." + maior);
		}

	}

}
