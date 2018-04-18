package com.loiane.cursojava.aula13;
import java.util.Scanner;
public class exercicio11 {
//PROGRAMA CALCULAR
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1, num2, result1;
		double nreal1, result2, result3;
		
		System.out.println("Digite 2 números inteiros e 1 número real, seguindo a ordem dita: ");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		nreal1 = scan.nextDouble();		
		result1 = (num1 * 2) * (num2/2);
		result2 = num1 * 3 + nreal1;
		result3 = nreal1 * nreal1 * nreal1; //ou Math.pow(nreal1, 3)
		
		System.out.println("a: o produto do dobro do primeiro com metade do segundo é: " + result1);		
		System.out.println("b: a soma do triplo do primeiro com o terceiro é: " + result2);		
		System.out.println("c: o terceiro elevado ao cubo é: " + result3);
		
		
		
		

	}

}
