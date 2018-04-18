package com.loiane.cursojava.aula17Labs;

import java.util.Scanner;

public class Exer25 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int produto = 1;
		double valorProduto = 0, valorTotal = 0, dinheiro = 0;
		String output = "";

		System.out.println("Lojas Tabajara\n");

		do {
			System.out.print("Digite o preço do " + produto + "º produto:");
			valorProduto = scan.nextDouble();
			if(valorProduto != 0) {
			output += "Produto " + produto + ": R$ " + valorProduto + "\n";
			}
			valorTotal += valorProduto;
			produto++;
		} while (valorProduto != 0);

		System.out.print("\nDinheiro recebido: ");
		dinheiro = scan.nextDouble(); 
		
		System.out.println(output);
		System.out.println("Valor total da compra: R$ " + valorTotal);
		System.out.println("Valor recebido em dinheiro: R$ " + dinheiro);
		System.out.println("Troco: R$ " + (dinheiro - valorTotal));

	}

}
