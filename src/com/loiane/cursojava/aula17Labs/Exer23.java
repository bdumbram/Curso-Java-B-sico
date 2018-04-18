package com.loiane.cursojava.aula17Labs;

public class Exer23 {
	
	public static void main(String[] args) {
		
		int item=0;
		double valor = 1.99;
		
		System.out.println("\t\tLojas Quase Dois  - \tTabela de Preços");
		System.out.println("\t\tNúmero Item\t\tValor Item");
		for (item=1; item <=50; item++) {
			System.out.println("\t\t" + item + "\t\t\tR$ " + valor * item);
		}
		
		
	}

}
