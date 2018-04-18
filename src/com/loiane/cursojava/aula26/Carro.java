package com.loiane.cursojava.aula26;

public class Carro {
	
	String Marca;
	String Modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	double obterAutonomia () {
		System.out.println("Método obterAutonomia foi chamado.");
	
		return capCombustivel * consumoCombustivel;
	}

}
