package com.loiane.cursojava.aula17Labs;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("Digite o primeiro inteiro");
		num1 = scan.nextInt();
		System.out.println("Digite o segundo inteiro");
		num2 = scan.nextInt();
		
		if(num1 <= num2) {
			for(int i = num1+1; i < num2; i++) {
				System.out.println(i);
			}
		}else if (num1 >= num2) {
			for(int i = num1-1; i > num2; i--) {
				System.out.println(i);
			}
		}
		

	}
}
