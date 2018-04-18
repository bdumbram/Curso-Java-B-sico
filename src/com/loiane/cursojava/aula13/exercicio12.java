package com.loiane.cursojava.aula13;
import java.util.Scanner;
public class exercicio12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double pesoIdeal, altura;
		
		System.out.println("Digite sua altura: ");
		altura = scan.nextDouble();
		pesoIdeal = (72.7*altura) - 58;
		System.out.println("Seu peso ideal é: " + pesoIdeal + "kg.");

	}

}
