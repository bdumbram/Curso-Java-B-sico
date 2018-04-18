package com.loiane.cursojava.aula13;
//PROGRAMA CALCULAR ÁREA DE UM QUADRADO AREA=LADO * LADO ou AREA= LADO²
import java.util.Scanner;

public class exercicio7 {
	public static void main(String[] args) {
		float area, lado;
		
		Scanner scan = new Scanner(System.in);		
		System.out.println("Digite o valor do lado de um quadrado: ");		
		lado = scan.nextFloat();
		area = 2*(lado*lado); // ou area = Math.pow(lado,2);
		System.out.println("o dobro da área é: " + area + "m²");
		
	}

}
