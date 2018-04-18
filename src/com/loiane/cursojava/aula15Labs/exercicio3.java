package com.loiane.cursojava.aula15Labs;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
		
		//comparar String = variável.equals("f")  OU  variável.equalsIgnoreCase("f") - porque String é um objeto/classe
		
		char letra;
		System.out.println("Digite uma letra.");
		
		letra = scan.nextLine().charAt(0);
		if ((letra == 'f') || (letra == 'F')) {
			System.out.println("Feminino");
		}else if (letra == 'm' || letra == 'M') {
			System.out.println("Masculino");
		}else {
			System.out.println("Sexo inválido.");
		}
	}	
	
}
