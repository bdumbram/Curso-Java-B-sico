package com.loiane.cursojava.aula15Labs;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("Digite o primeiro número:");
		num1 = scan.nextInt();
		System.out.println("Digite o segundo número:");
		num2 = scan.nextInt();
		System.out.println("Digite o terceiro número:");
		num3 = scan.nextInt();
		
		if(num1 >= num2 && num1 >= num3) {
			System.out.println("Maior: " + num1);
			if (num2 <= num3) {
				System.out.println("Menor: " + num2);
			}else {
				System.out.println("Menor: " + num3);
			}			
			
		}else if (num2 >= num1 && num2 >= num3){
			System.out.println("Maior: " + num2);
			if(num1 <= num3) {
				System.out.println("Menor: " + num1);				
			}else {
				System.out.println("Menor: " + num3);
			}
		} else if (num3 >= num1 && num3 >= num2) {
			System.out.println("Maior: " + num3);
			if(num1 <= num2) {
				System.out.println("Menor: " + num1);
			}else {
				System.out.println("Menor: " + num2);
			}
		}
		
	}

}

