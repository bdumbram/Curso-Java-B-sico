//PROGRAMA CONVERTE METROS EM CENTIMETROS
package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class exercicio5 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o numero de metros para converter em centimetros: ");
		float metros = scan.nextFloat();
		float centimetros  = metros * 100;
		System.out.println(metros + " são " + centimetros + " em centimetros.");
		
	}

}
