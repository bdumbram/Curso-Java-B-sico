//PROGRAMA NOTAS BIMESTRAIS
package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class exercicio4 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double nota1, nota2, nota3, nota4, media;
		System.out.println("Digite as 4 notas bimestrais: ");
		nota1 = scan.nextDouble();
		nota2 = scan.nextDouble();
		nota3 = scan.nextDouble();
		nota4 = scan.nextDouble();
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.println("A Media das notas digitadas é: " + media);
		
		
	}

}
