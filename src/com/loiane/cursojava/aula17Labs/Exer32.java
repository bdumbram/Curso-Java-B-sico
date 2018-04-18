package com.loiane.cursojava.aula17Labs;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exer32 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("##,##.##");

		int pedido = 1, quant = 0;
		double totalPedido = 0;
		double cod100 = 1.20;
		double cod101 = 1.30;
		double cod102 = 1.50;
		double cod103 = 1.20;
		double cod104 = 1.30;
		double cod105 = 1;
		String COD100 = "Cachorro Quente";
		String COD101 = "Bauru Simples";
		String COD102 = "Bauro com Ovo";
		String COD103 = "Hambúnguer";
		String COD104 = "Cheeseburguer";
		String COD105 = "Refrigerante";

		while (pedido != 0) {
			System.out.print("Informe seu pedido e/ou entre com 0 para encerrar ");
			pedido = scan.nextInt();
			if (pedido == 0) {
				quant = 0;
			} else {
				System.out.print("Informe a quantidade do seu pedido ");
				quant = scan.nextInt();
			}
			switch (pedido) {
			case 100:
				totalPedido += cod100 * quant;
				System.out.println("Especificação: " + COD100 + " - Preço: R$" + format.format(quant * cod100));
				break;
			case 101:
				totalPedido += cod101 * quant;
				System.out.println("Especificação: " + COD101 + " - Preço: R$" + format.format(quant * cod101));
				break;
			case 102:
				totalPedido += cod102 * quant;
				System.out.println("Especificação: " + COD102 + " - Preço: R$" + format.format(quant * cod102));
				break;
			case 103:
				totalPedido += cod103 * quant;
				System.out.println("Especificação: " + COD103 + " - Preço: R$" + format.format(quant * cod103));
				break;
			case 104:
				totalPedido += cod104 * quant;
				System.out.println("Especificação: " + COD104 + " - Preço: R$" + format.format(quant * cod104));
				break;
			case 105:
				totalPedido += cod105 * quant;
				System.out.println("Especificação: " + COD105 + " - Preço: R$" + format.format(quant * cod105));
				break;
			case 0:
				System.out.println("Fim do pedido");
				break;
			default:
				System.out.println("Código inválido.");
			}
		 
		
		}
		
		System.out.println("Total do pedido: R$" + format.format(totalPedido));

	}

}
