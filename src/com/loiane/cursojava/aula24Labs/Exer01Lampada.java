package com.loiane.cursojava.aula24Labs;

public class Exer01Lampada {

	public static void main(String[] args) {
		
		Lampada lampada = new Lampada();
		
		lampada.lampModel = "A60";
		lampada.lampVoltage = "Bivolt";
		lampada.lampshade = false;
		lampada.lamPower = 7;
		lampada.lampColour = "Yellow";
		
		lampada.lampType = new String[5];
		lampada.lampType[0] = "lampshade";
		lampada.lampType[0] = "lamplights";

	}

}
