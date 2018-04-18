package com.loiane.cursojava.aula10;

public class Variaveis {

	public static void main(String[] args) {
		//inteiros
		byte idade = 20;
		short idade1;
		int idade2 = 20;
		long idade3;
		
		//ponto flutuante
		float idade5 = 100.30f;
		double idade6 = 100.30;
		//CHAR
		char o = 111;
		char i = 105;
		char interrogacao = 0x00E1; // char unicode
		boolean verdadeiro = true;
		boolean falso = false;
		
		String nome = "Bruno";
		String nomeDoMeuCachorro = "Dogao";
		//Usar aspas duplas para que o char não seja somado.		
		System.out.println("" + o + i + interrogacao);
		
		System.out.println("Idade: " + idade);
		System.out.println("Nome: "+ nome);
		System.out.println("Cachorro: " + nomeDoMeuCachorro);
	}

}
