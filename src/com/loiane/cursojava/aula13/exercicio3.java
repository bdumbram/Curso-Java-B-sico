//PROGRAMA QUE SOMA 2 NUMEROS
package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class exercicio3 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero1 = 0, numero2 = 0, resultado=0;
		System.out.println("Digite o primeiro número: ");
		numero1 = scan.nextInt();
		System.out.println("Digite o segundo número: ");
		numero2 = scan.nextInt();
		resultado = numero1 + numero2;
		System.out.println("A soma dos números é: " + resultado );
		
	}

}
