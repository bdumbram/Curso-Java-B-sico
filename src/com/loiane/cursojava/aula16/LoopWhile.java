package com.loiane.cursojava.aula16;

public class LoopWhile {

	public static void main(String[] args) {
		
		int i = 1;
		int max = 10;
		
		System.out.println("contando até " + max);
		
		while(i <= 10) {
			System.out.println("valor de i: " + i);
			i++;
		}
		
		System.out.println("\nvalor de i: " + i + "\n");
		
		do {
			i++;
			System.out.println("valor de i: " + i);
		}while(i < 15);
		
		System.out.println("\nvalor de i: " + i + "\n");

	}

}
