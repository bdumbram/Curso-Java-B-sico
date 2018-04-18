package com.loiane.cursojava.aula20Labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[][] matrixM = new int[3][3];
		int evenNumber=0, oddNumber=0;
		
		for (int i=0; i<matrixM.length; i++) {
			for (int j=0; j<matrixM[i].length; j++) {
				System.out.println("Enter with a value for the line " + i + " column " + j);
				matrixM[i][j] = scan.nextInt();
			}
		}
		
		for (int i=0; i<matrixM.length; i++) {
			for (int j=0; j<matrixM[i].length; j++) {
				if (matrixM[i][j] % 2 ==0) {
					evenNumber++;
				}else {
					oddNumber++;
				}
			}
		}
		
		for (int i=0; i<matrixM.length; i++) {
			System.out.print("Line " + i + " = ");
			for (int j=0; j<matrixM[i].length; j++) {
				System.out.print(matrixM[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("\nThe amount of even numbers are: " + evenNumber);
		System.out.println("The amount of odd numbers are: "  + oddNumber);
				
		
	}

}
