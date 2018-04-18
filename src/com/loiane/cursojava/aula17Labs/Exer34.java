package com.loiane.cursojava.aula17Labs;

public class Exer34 {

	public static void main(String[] args) {
		
		
		double h = 1, i = 5;
		
		System.out.print("Valor de H = " + h);
		for (double n = 6; n <=i; n++) {
			System.out.print(" + 1/"+n);
			h = h + (1/n);	
		}
		System.out.print(" = " + h);

	}

}
