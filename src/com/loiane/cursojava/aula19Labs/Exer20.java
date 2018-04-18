package com.loiane.cursojava.aula19Labs;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exer20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat ("0.00");
		double[] cotacoesDolar = new double[20];
		double cotDolar=0;
		
		System.out.println("Entre com a cotação do dólar (U$)");
		cotDolar = scan.nextDouble();
		
		for (int i =0; i<cotacoesDolar.length; i++) {
			cotacoesDolar[i] = cotDolar * (i+1);
			System.out.println("Cotação dólar U$" + cotDolar + " em reais R$" + df.format(cotacoesDolar[i]));
		}

	}

}
