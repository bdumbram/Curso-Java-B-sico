//PROGRAMA QUE MOSTRA O NUMERO DIGITADO
package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero = 0;
		System.out.println("Digite um número: ");
		numero = scan.nextInt();
		System.out.println("O número digitado foi: " + numero);		
		
	}

}
