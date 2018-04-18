package com.loiane.cursojava.aula17Labs;

import java.util.Scanner;

public class Exer22 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double valorTotalInvestido=0, valorMedio=0, valorCd=0;
		int qtdCds=0, count=1;
		
		System.out.println("Digite a quantidade de CDs comprados.");
		qtdCds = scan.nextInt();
		while(count <= qtdCds) {
			System.out.println("Digite o valor do " + count + "º CD.");
			valorCd = scan.nextDouble();
			valorTotalInvestido += valorCd;
			count++;
		}
		
		valorMedio = valorTotalInvestido / qtdCds;
		System.out.println("Valor total investido: " + valorTotalInvestido);
		System.out.println("Valor Médio: " + valorMedio);
	}

}
