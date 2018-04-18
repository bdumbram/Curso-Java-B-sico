package com.loiane.cursojava.aula26;

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
	}

}
