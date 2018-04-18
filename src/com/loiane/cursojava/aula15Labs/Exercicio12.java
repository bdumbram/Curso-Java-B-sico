package com.loiane.cursojava.aula15Labs;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
		double salarioBruto, salarioLiquido, totalDescontos, ir, inss, fgts;
		int valorHora, horas;
		
		System.out.println("Entre com o número de horas trabalhadas:");
		horas = scan.nextInt();
		System.out.println("Entre com o valor de sua hora:");
		valorHora = scan.nextInt();
		
		salarioBruto = horas * valorHora;
		if (salarioBruto <= 900) {
			ir = 0;
		} else if (salarioBruto > 900 && salarioBruto <= 1500) {
			ir = (salarioBruto * 5) / 100;
		} else if (salarioBruto > 1500 && salarioBruto <= 2500) {
			ir = (salarioBruto * 10) / 100;
		} else {
			ir = (salarioBruto * 20) / 100;
		}
		
		inss = (salarioBruto * 10) / 100;
		fgts = (salarioBruto * 11) / 100;
		totalDescontos = ir + inss;
		salarioLiquido = salarioBruto - totalDescontos;
		
		System.out.println("Salário Bruto: (" + valorHora + " * " + horas + ") " + salarioBruto);
		System.out.println("Imposto de Renda: " + ir);
		System.out.println("INSS: " + inss);
		System.out.println("FGTS: " + fgts);
		System.out.println("Total de Descontos: " + totalDescontos);
		System.out.println("Salário Líquido: " + salarioLiquido);		
		
	}

}
