package com.loiane.cursojava.aula15Labs;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe em qual turno você estuda. Digite M-matutino, V-vespertino ou N-noturno");
		String turno = scan.next();
		
		switch(turno) {
		case "M":
		case "m": System.out.println("Bom dia!"); break;
		case "V": 
		case "v": System.out.println("Boa tarde!");break;
		case "N":
		case "n": System.out.println("Boa noite!");break;
		default : System.out.println("Não é um valor válido");
		}
		
		/*if (turno.equalsIgnoreCase("m")) {
			System.out.println("Bom dia!");
		}else if (turno.equalsIgnoreCase("v")) {
			System.out.println("Boa tarde!");			
		}
		else if (turno.equalsIgnoreCase("n")) {
			System.out.println("Boa noite!");
		}else {
			System.out.println("Não é um valor válido");
		}*/

	}

}
