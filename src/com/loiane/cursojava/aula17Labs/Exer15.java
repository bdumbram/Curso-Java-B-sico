package com.loiane.cursojava.aula17Labs;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		/*int fibonacci = 0, fi=10, resultado=0, a, b;
		
		for (int i = 1; i <= fi; i++) {			
			fibonacci = i + fi;
			
			
			System.out.println(" " + i + " " + fibonacci);
			
		}*/
		
		//CORREÇÃO
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o n-ésimo termo da série de Fibonacci");
		int n = scan.nextInt();
		
		int primeiro = 1, segundo = 1, proximo;
		
		System.out.println(primeiro);
		System.out.println(segundo);
		
		for (int i =3; i <=n; i++) {
			
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			
			System.out.println(proximo);
		}

	}

}
