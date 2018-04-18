package com.loiane.cursojava.aula13;
import java.util.Scanner;
public class exercicio10 {
//PROGRAMA TEMPERATURA CELSIUS PARA FAHRENHEIT
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double f, c;
		System.out.println("Digite a temperatura em graus Celsius: ");
		c = scan.nextDouble();
		f = 1.8 * c + 32;
		System.out.println("A temperatura em Fahrenheit é: " + f);

	}

}
