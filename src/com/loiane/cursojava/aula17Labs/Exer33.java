package com.loiane.cursojava.aula17Labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer33 {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("0.##");
		Scanner scan = new Scanner(System.in);
		
		double m = 1;
		double s = 0;
		System.out.println("Entre com valor de n:");
		double n = scan.nextDouble();
		
		
		//CORREÇÃO
		for (int i=1, j =1; i<=n; i++, j+=2) {
			System.out.print(i + "/" + j + " + ");
			s += i/j;
		}
		System.out.println(" = " + s);
				
		/*System.out.print("S = ");		
		for (int i = 1; i <= 3; i++) {
			System.out.print(i + "/" + m + " + ");
			s = s+(i/m);
			m += 2;			
		}
		System.out.println("\n\nS = " +  df.format(s));*/
	}

}
