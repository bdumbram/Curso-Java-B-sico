package com.loiane.cursojava.aula13;

public class OperadoresAritmeticos {
	
	public static void main(String[] args) {
		
		int resultado = 1 + 2;
		System.out.println(resultado);
		
		resultado += (-1);
		System.out.println(resultado);
		
		resultado = resultado * 2;
		System.out.println(resultado);
		
		resultado = resultado / 2;
		System.out.println(resultado);
		
		resultado = resultado + 8;
		System.out.println(resultado);
		
		resultado = resultado % 7;
		System.out.println(resultado);
		
		//Uso do operador + em String
		
		String primeiroNome = "Esta é";
		String segundoNome = " uma String concatenada";
		String terceiroNome = primeiroNome + segundoNome;
		System.out.println(terceiroNome);
		
		resultado++;
		System.out.println(resultado);
		
		//5
		
		System.out.println(resultado++); // esta adicionando 1 depois de imprimir
		/*mesca coisa que
		 System.out.println(resultado);
		 resultado = resultado + 1;
		 resultado += 1;*/
		
		System.out.println(++resultado); // esta adicionando 1 antes de imprimir
		/* mesma coisa que
		 * resultado +=1;
		 * System.out.println(resultado);
		 */
		
		resultado--;
		System.out.println(resultado);
		
		System.out.println(resultado--);
		System.out.println(--resultado);
		 
	}

}
