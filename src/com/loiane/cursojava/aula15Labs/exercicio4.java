package com.loiane.cursojava.aula15Labs;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);			
		
		System.out.println("Digite uma letra.");
		char letra = scan.next().charAt(0);
		System.out.println(letra);
		
		/* com variável String -> if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i")
		   ||letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
		   System.out.println("Vogal");
		}else{
			System.out.println("Consoante");
			}
		*/
		// para validar mais de uma letra com variável String -> if(letra.length() > 1)
		
		switch(letra) {
		case 'a':;
		case 'e':;
		case 'i':;
		case 'o':;
		case 'u':;
		case 'A':;
		case 'E':;
		case 'I':;
		case 'O':;
		case 'U': System.out.println("Vogal"); break;
		default: System.out.println("Consoante");
		}
		

	}

}
