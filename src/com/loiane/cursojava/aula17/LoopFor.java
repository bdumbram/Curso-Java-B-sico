package com.loiane.cursojava.aula17;

public class LoopFor {

	public static void main(String[] args) {
		
		//variáveis declaradas dentro da estrutura for não são válidas fora da estrutura do mesmo.
		
		for(int i=0; i < 5; i++) {					
			System.out.println("valor de i: " + i);
					
		}
		
		System.out.println("\n\n");
		
		for(int i=5; i > 0; i--) {					
			System.out.println("valor de i: " + i);
					
		}
		
		System.out.println("\n\n");
		
		//FOR com mais de uma variável 
		for(int i=0, j=10; i < j; i++, j--) {
			System.out.println("valor de i: " + i + " valor de j: "+ j);
		}
		
		System.out.println("\n\n");
		
		//FOR com partes ausentes
		int count =0;
		for( ; count < 10;) {
			System.out.println("valor de count: " + count);
			count += 2;
		}
		
		System.out.println("\n\n");
		
		for(int cont=0; cont<10; cont+=2) {
			System.out.println("valor de cont: " + cont);
		}
		
		System.out.println("\n\n");
		
		//FOR com loop infinito for( ; ;);
		
		//FOR para somar
		
		int soma=0;
		for(int i=0; i<5; soma+= i++);
		System.out.println("valor soma: " + soma);
		
		System.out.println("\n\n");
		
		//FOR sem chaves executa a primeira linha após o for - NÃO RECOMENDADO.
		for (int i=1; i<6; i++)
			System.out.println("valor de i " + i);

	}

}
