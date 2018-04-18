package com.loiane.cursojava.aula19;

public class Arrays {

	public static void main(String[] args) {
		
		double[] temperaturas = new double[365];
		
		temperaturas[0] = 31.1;
		temperaturas[1] = 31.2;
		temperaturas[2] = 31.3;
		temperaturas[3] = 31.4;
		temperaturas[364] = 31.5;
		
		System.out.println("temperatura dia 365: " + temperaturas[364]);
		
		System.out.println("tamanho " + temperaturas.length);
		
		/*for (int i = 0; i < temperaturas.length; i++) {
		System.out.println("valor do dia " + (i) + " é " + temperaturas[i]);
		}*/
		
		int count=0;
		for (double temp : temperaturas) {
			count++;
			System.out.println(count);
			System.out.println(temp);
		}
		
	}

}
