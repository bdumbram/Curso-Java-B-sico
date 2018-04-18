package com.loiane.cursojava.aula17Labs;

import java.util.Scanner;

public class Exer3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String nome;
		int idade;
		double salario;
		char sexo, estadoCivil;
		
				
		do{
			System.out.println("Entre com seu nome:");		
			nome = scan.nextLine();
		}while(nome.length() <= 3);
		
		do {
			System.out.println("Entre com sua idade:");
			idade = scan.nextInt();			
		}while(idade <0 || idade >150);
		
		do {
			System.out.println("Entre com seu salário:");
			salario = scan.nextDouble();
		}while(salario <= 0);
		
		do {
			System.out.println("Entre com seu sexo:");
			sexo = scan.next().charAt(0);
		}while(sexo != 'f' && sexo != 'm');
		
		do {
			System.out.println("Entre com seu Estado Civil: ");
			estadoCivil = scan.next().charAt(0);
		}while(estadoCivil != 's' && estadoCivil != 'c' &&
				estadoCivil != 'v' && estadoCivil != 'd');
		
		System.out.println("nome: " + nome);
		System.out.println("idade: " + idade);
		System.out.println("salário: " + salario);
		System.out.println("sexo: " + sexo);
		System.out.println("Estado Civil: " + estadoCivil);
		
	}

}
