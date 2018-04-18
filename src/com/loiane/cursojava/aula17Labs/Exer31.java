package com.loiane.cursojava.aula17Labs;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exer31 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double perAtual = 1.5;
		double salario = 1000 + ((1000 * perAtual) / 100);		
		
		System.out.println("Entre com o salário inicial do funcionário: ");
		salario = scan.nextDouble();
		salario = salario + ((salario * perAtual) / 100);
		
		double salarioAtual = salario, ajuste = 0;
		
		DecimalFormat format = new DecimalFormat ("###,###.##");

		for (int i = 1997; i <= 2017; i++) {
			perAtual *= 2;
			ajuste = (salarioAtual * perAtual) / 100;
			salarioAtual += ajuste;
			System.out.println(i + " = " + format.format(salarioAtual) + " - " + perAtual + "%");
			/*System.out.println("Percentual de Aumento: " + perAtual);
			System.out.println("Ajuste: " + ajuste);
			System.out.println("Salário Atual: " + salarioAtual + "\n\n");*/
		}

	}

}
