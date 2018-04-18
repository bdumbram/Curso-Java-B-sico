package com.loiane.cursojava.aula27Labs;

import java.util.Scanner;

public class Exer1 {
	
	String cor;
	String tipo; //incandescentes, fluorescentes, Halógenas, LED
	String tensao; //bivolt/monovolt
	int potencia;
	boolean on = true; // on/off
	
	Scanner scan = new Scanner(System.in);
	
	
	void ligarLampada () {
		
		int ligar=0;
		if (!on) {
		System.out.println("Ligar Lâmpada? (1. YES / 0. NO)");
		ligar = scan.nextInt();
			if (ligar == 1) {
				on = true;				
			}
			if (on) {
				System.out.println("Lampada Ligada!");
			}else {
				System.out.println("Lampada Desligada");
			}
				
		}else {
			System.out.println("Lampada esta ligada, deseja desligar? (1. YES / 0. NO)\")");
			ligar = scan.nextInt();
			if (ligar == 1) {
				on = false;
				System.out.println("Lampada Desligada!");
			}
		}
		
	}
	
	
}

