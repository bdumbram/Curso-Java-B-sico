package com.loiane.cursojava.aula15Labs;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double valorCompra=0, desconto=0;
		double valorFile = 4.9, valorAlcatra = 5.9, valorPicanha = 6.9;
		
		System.out.println("Compra será feita no cartão Tabajara? s-sim / n-não:");
		String cartao = scan.nextLine();
		System.out.println("Informe o tipo de carne: f-File Duplo, a-Alcatra ou p-Picanha:");
		String carne = scan.nextLine();
		System.out.println("Informe o KG da carne:");
		double kg = scan.nextDouble();
		
		
		
		if(carne.equalsIgnoreCase("f")) {
			if(kg <=5) {
				valorCompra = kg * valorFile;
			}else {
				valorFile = 5.8;
				valorCompra = kg * valorFile;
			}
		}else if(carne.equalsIgnoreCase("a")) {
			if(kg <=5) {
				valorCompra = kg * valorAlcatra;
			}else {
				valorAlcatra = 6.8;
				valorCompra = kg * valorAlcatra;
			}
		}else if(carne.equalsIgnoreCase("p")) {
			if(kg <=5) {
				valorCompra = kg * valorPicanha;
			}else {
				valorPicanha = 7.8;
				valorCompra = kg * valorPicanha;
			}
		}		
				
		if(cartao.equalsIgnoreCase("s")) {
			cartao = "Cartão Tabajara";
			desconto = (valorCompra * 5) / 100;
			valorCompra = valorCompra - desconto;
			System.out.println("Tipo de Carne: " + carne);
			System.out.println("Quantidade de Carne: " + kg + "kg");
			System.out.println("Preço Total: " + (valorCompra + desconto));
			System.out.println("Tipo de Pagamento : " + cartao);
			System.out.println("Valor Desconto: " + desconto);
			System.out.println("Valor a pagar: " + valorCompra);
		}else if(cartao.equalsIgnoreCase("n")) {
			cartao = "Outro Cartão/Dinheiro";
			System.out.println("Tipo de Carne: " + carne);
			System.out.println("Quantidade de Carne: " + kg + "kg");
			System.out.println("Preço Total: " + (valorCompra + desconto));
			System.out.println("Tipo de Pagamento : " + cartao);
			System.out.println("Valor Desconto: " + desconto);
			System.out.println("Valor a pagar: " + valorCompra);
			
		}

	}

}
