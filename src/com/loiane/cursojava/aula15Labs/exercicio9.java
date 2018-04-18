package com.loiane.cursojava.aula15Labs;

import java.util.Scanner;

public class exercicio9 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("Digite o primeiro número:");
		num1 = scan.nextInt();
		System.out.println("Digite o segundo número:");
		num2 = scan.nextInt();
		System.out.println("Digite o terceiro número:");
		num3 = scan.nextInt();
		
		// EXEMPLO if(num1<=num2 && num1<=num3 && num2<=num3)
		// EXEMPLO if(num1<=num2 && num1<=num3 && num3<=num2)
		// EXEMPLO if(num2<=num1 && num2<=num3 && num1<=num3)
		// EXEMPLO if(num2<=num1 && num2<=num3 && num3<=num1)
		// EXEMPLO if(num3<=num1 && num3<=num2 && num2<=num1)
		// EXEMPLO if(num3<=num1 && num3<=num2 && num1<=num3)
		
		if(num1 >= num2 && num1 >= num3) {
			if(num2 >= num3) {
				System.out.println(num1 + "\n" + num2 + "\n" + num3);
			}else {
				System.out.println(num1 + "\n" + num3 + "\n" + num2);
			}
		}else if (num2 >= num1 && num2 >= num3) {
			if(num1 >= num3) {
				System.out.println(num2 + "\n" + num1 + "\n" + num3);				
			}else {
				System.out.println(num2 + "\n" + num3 + "\n" + num1);
			}
		}else if (num3 >= num1 && num3 >= num2) {
			if(num1 >= num2) {
				System.out.println(num3 + "\n" + num1 + "\n" + num2);
			}else {
				System.out.println(num3 + "\n" + num2 + "\n" + num1);
			}
		}
		
	}

}

