package com.loiane.cursojava.aula13;
import java.util.Scanner;
public class exercicio8 {
//PROGRAMA TRABALHO
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor por hora trabalhada e o número de horas trabalhadas em seguida.");
		float valorHora = scan.nextFloat();
		int horas = scan.nextInt();
		float salario = valorHora * horas;
		System.out.println("O salário total no mês é: " + salario);
		
	}

}
