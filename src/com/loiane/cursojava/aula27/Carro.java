package com.loiane.cursojava.aula27;

public class Carro {
	
	String Marca;
	String Modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	//criação de método
	void exibirAutonomia () {
		System.out.println("A Autonomia do carro é: " + capCombustivel * consumoCombustivel + " Km");
	}
	
	double obterAutonomia () {
		System.out.println("Método Obter Autonomia foi chamado: ");
		
		return capCombustivel * consumoCombustivel;
	}
	
	double calcularCombustivel (double km) { //calcula combustivel usado
		double qtdCombustivel = km/consumoCombustivel;
		return qtdCombustivel;
	}

}
