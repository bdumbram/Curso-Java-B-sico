package com.loiane.cursojava.aula15Labs;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double aumento, salario, novoSalario;
		
		
		System.out.println("Entre com o salário");
		salario = scan.nextDouble();
		int percentual=0;
		if (salario <= 280) {
			percentual = 20;
		}else if (salario > 280 && salario < 700) {
			percentual = 15;
		}else if (salario >= 700 && salario < 1500) {
			percentual = 10;
		}else if (salario >= 1500) {
			percentual = 5;
		}
		
		aumento = (salario / 100) * percentual;
		novoSalario = salario + aumento;
		
		System.out.println("Salário: " + salario);
		System.out.println("Percentual de Aumento: " + percentual + "%");
		System.out.println("Aumento: " + aumento);
		System.out.println("Novo Salário: " + novoSalario);
		
		
		/*int per1 = 20, per2 = 15, per3 = 10, per4 = 5;
		  if(salario <= 280) {
			aumento = (salario * per1) /100;
			novoSalario = aumento + salario;			
			System.out.println("Salário: " + salario);
			System.out.println("Percentual de Aumento: " + per1 + "%");
			System.out.println("Aumento: " + aumento);
			System.out.println("Novo Salário: " + novoSalario);			
			
		}else if (salario >280 && salario <=700) {
			aumento = (salario * per2) / 100;
			novoSalario = aumento + salario;
			System.out.println("Salário: " + salario);
			System.out.println("Percentual de Aumento: " + per2 + "%");
			System.out.println("Aumento: " + aumento);
			System.out.println("Novo Salário: " + novoSalario);			
			
		}else if (salario > 700 && salario < 1500) {
			aumento = (salario * per3) / 100;
			novoSalario = aumento + salario;
			System.out.println("Salário: " + salario);
			System.out.println("Percentual de Aumento: " + per3 + "%");
			System.out.println("Aumento: " + aumento);
			System.out.println("Novo Salário: " + novoSalario);
			
		}else if(salario >= 1500) {
			aumento = (salario * per4) / 100;
			novoSalario = aumento + salario;
			System.out.println("Salário: " + salario);
			System.out.println("Percentual de Aumento: " + per4 + "%");
			System.out.println("Aumento: " + aumento);
			System.out.println("Novo Salário: " + novoSalario);
		}*/

	}

}
