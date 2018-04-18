package com.loiane.cursojava.aula20Labs;

import java.util.Random;

public class Exer02 {

	public static void main(String[] args) {

		int[][] matrixM = new int[10][10];
		int bigger = Integer.MIN_VALUE, biggerPositionLine = 0, biggerPositionColumn = 0; // the use of others variables are necessary for the validation of column 7
		int smaller = Integer.MAX_VALUE, smallPositionLine = 0, smallPositionColumn = 0;
		Random rand = new Random();

		for (int i = 0; i < matrixM.length; i++) {

			for (int j = 0; j < matrixM[i].length; j++) {

				matrixM[i][j] = rand.nextInt(10) + 0;
			}
		}

		for (int i = 0; i < matrixM.length; i++) {

			System.out.print("Line " + i + " = ");

			for (int j = 0; j < matrixM[i].length; j++) {

				System.out.print(matrixM[i][j] + " ");

			}

			System.out.println();

		}

		for (int i = 0; i < matrixM[5].length; i++) {
		
				if (matrixM[5][i] >= bigger) {					
						bigger = matrixM[5][i];
						biggerPositionLine = 5;
						biggerPositionColumn = i;
					}
					if (matrixM[5][i] <= smaller) {
						smaller = matrixM[5][i];
						smallPositionLine = 5;
						smallPositionColumn = i;

					}
				
			}		

		 System.out.println("\nBigger number: " + bigger);
		 System.out.println("Bigger number's Line Position: " + biggerPositionLine);
		 System.out.println("Bigger number's Column Position: " + biggerPositionColumn);
		 System.out.println("\nSmaller number: " + smaller);
		 System.out.println("Smaller number's Line Position: " + smallPositionLine);
		 System.out.println("Smaller number's Column Position: " + smallPositionColumn);
		 
		 for (int i = 0; i < matrixM.length; i++) {
					if (matrixM[i][7] >= bigger) {						
							bigger = matrixM[i][7];
							biggerPositionLine = i;
							biggerPositionColumn = 7;
						}
						if (matrixM[i][7] <= smaller) {
							smaller = matrixM[i][7];
							smallPositionLine = i;
							smallPositionColumn = 7;

						}
					}			
		 
		 System.out.println("\nBigger number: " + bigger);
		 System.out.println("Bigger number's Line Position: " + biggerPositionLine);
		 System.out.println("Bigger number's Column Position: " + biggerPositionColumn);
		 System.out.println("\nSmaller number: " + smaller);
		 System.out.println("Smaller number's Line Position: " + smallPositionLine);
		 System.out.println("Smaller number's Column Position: " + smallPositionColumn);

	}

}
