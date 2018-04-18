	package com.loiane.cursojava.aula13;
//PROGRAMA ÁREA DE UM CÍRCULO

import java.util.Scanner;

public class exercicio6 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double pi = 3.14;
		
		System.out.println("Para calcular a área do círculo digite o raio do mesmo: ");
		double raio = scan.nextDouble();
		double area = pi * (raio*raio); // OU double area = Math.PI * Math.pow(raio, 2);
		
		System.out.println("A área do círculo é: " + area + " cm²");
		
	}

}


/*public class TesteDesempenho {
	public static void main(String args[]) {
		long inicio = System.currentTimeMillis(), fim;
		double x;
		for(int i=0 ; i<90000000 ; i++){
			x = Math.PI * Math.pow(i,2); 	//Testa esse primeiro
			//x = Math.PI * i * i;			//Depois testa esse
		}
		fim = System.currentTimeMillis();
		System.out.println("Tempo total: " + ((double)(fim-inicio)/1000) + "s");
		//Math.pow = 5.706 segundos
		//i*i = 0.256 segundos
	}
}*/
