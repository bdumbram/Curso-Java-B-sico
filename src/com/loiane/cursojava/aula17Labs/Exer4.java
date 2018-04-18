package com.loiane.cursojava.aula17Labs;

public class Exer4 {

	public static void main(String[] args) {
		
		
		double paisA, paisB;
		int countAno =0;

		for(paisA = 80000, paisB = 200000; paisA <= paisB; paisA = paisA + ((paisA*3)/100), paisB = paisB + ((paisB*1.5)/100)) {
			System.out.println("Anos: " + countAno);
			System.out.println("Pais A: " + paisA);
			System.out.println("Pais B: " + paisB + "\n");
			countAno ++;
		}
		System.out.println("\n\nTotal de Anos: " + countAno);
		System.out.println("População Pais A: " + paisA);
		System.out.println("População Pais B: " + paisB);
		
		//CORREÇÃO
		/* int popA = 80000;
		 * int popB = 200000;
		 * int count = 0;
		 * 
		 * while (popA < popB){
		 * popA += (popA/100)*3;
		 * popB += (popB/100)*1.5;
		 * count++;
		 * }
		 *  
		 */
		
	}

}
