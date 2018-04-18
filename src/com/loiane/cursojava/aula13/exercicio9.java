package com.loiane.cursojava.aula13;

//PROGRAMA CONVERSAO DE GRAUS
import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		double c, f = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a temperatura em graus Fahrenheit: ");
		f = scan.nextInt();
		c=(f-32)/1.8;
		System.out.println("A temperatura em Fahrenheit é: " + f + " e a temperatura em Celsius é: " + c);
	}

}
