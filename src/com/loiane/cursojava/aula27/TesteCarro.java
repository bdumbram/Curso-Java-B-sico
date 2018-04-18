package com.loiane.cursojava.aula27;

import com.loiane.cursojava.aula27.Carro;

public class TesteCarro {
	
public static void main(String[] args) {
		
		Carro passeio = new Carro();
		passeio.capCombustivel = 55.5;
		passeio.consumoCombustivel = 7;
		passeio.Marca = "Chevrolet";
		passeio.Modelo = "Astra";
		passeio.numPassageiros = 4;
		
		System.out.println(passeio.Marca);
		System.out.println(passeio.Modelo);
		
		double autonomia = passeio.obterAutonomia();
		System.out.println("Autonomia: " + autonomia);
		
		double qtdCombustivel = passeio.calcularCombustivel(10);
		System.out.println("qtd Combustivel usado: " + qtdCombustivel + " Litros");
	}

}
