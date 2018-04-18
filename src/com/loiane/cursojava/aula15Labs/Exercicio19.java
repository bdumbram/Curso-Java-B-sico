package com.loiane.cursojava.aula15Labs;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double resultado=0;
		
		System.out.println("Entre com o primeiro número");
		double num1 = scan.nextDouble();
		System.out.println("Entre com a operação desejada (+ - * /)");
		char operador = scan.next().charAt(0);		
		System.out.println("Entre com o segundo número");
		double num2 = scan.nextDouble();
		
		switch(operador) {
		case '+': resultado = num1 + num2; break;
		case '-': resultado = num1 - num2; break;
		case '*': resultado = num1 * num2; break;
		case '/': resultado = num1 / num2; break;
		default : System.out.println("ERRO");		
		}		
		
		if(resultado >=0) {
			if(resultado % 2 == 0) {
				System.out.println("O resultado: " + resultado + " da operação é positivo e par");
			}else {
				System.out.println("O resultado: " + resultado + " da operação é positivo e impar");
			}
		}else {
			if(resultado % 2 == 0) {
				System.out.println("O resultado: " + resultado + " da operação é negativo e par");
			}else {
				System.out.println("O resultado: " + resultado + " da operação é negativo e impar");
			}
		}
		
	}

}
