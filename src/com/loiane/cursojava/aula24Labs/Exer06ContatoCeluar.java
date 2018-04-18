package com.loiane.cursojava.aula24Labs;

public class Exer06ContatoCeluar {
	
	public static void main(String[] args) {
		
		ContatoCelular contato1 = new ContatoCelular();
		
		contato1.birthDay = "01/01/2001";
		contato1.email = "pedro.pedreira@email.com";
		contato1.employeer = "Pedras Na Hora Inc";
		contato1.group = "Friends";
		contato1.name = "Pedro Pedreira";
		
		contato1.numbers = new String[3][2];
		contato1.numbers[0][0] = "Celular";
		contato1.numbers[0][1] = "11 9999-8888";
		contato1.numbers[1][0] = "Casa";
		contato1.numbers[1][1] = "11 5555-4444";
		contato1.numbers[2][0] = "Trabalho";
		contato1.numbers[2][1] = "11 3333-2222";		
		
		System.out.println("Name: "+ contato1.name);
		
		for (int i=0; i<3; i++) {
			System.out.print(contato1.numbers[i][0]);
			for (int j=1; j<2; j++) {
				System.out.println(": " + contato1.numbers[i][j]);				
			}
		}
		System.out.println("Birthday: "+ contato1.birthDay);
		System.out.println("Email: "+ contato1.email);
		System.out.println("Organization: "+ contato1.employeer);
		System.out.println("Contact Group: "+ contato1.group);
	}

}
