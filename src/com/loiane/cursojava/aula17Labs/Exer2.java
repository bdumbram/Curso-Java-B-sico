package com.loiane.cursojava.aula17Labs;

import java.util.Scanner;

public class Exer2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String user, pass;
		boolean validacao = false;
		
		do {
			System.out.println("Entre com seu usuário:");
			user = scan.next();
			System.out.println("Entre com sua senha:");
			pass = scan.next();
			if(user.equals(pass)) {
				System.out.println("Erro! Senha não pode ser igual ao usuário.");
			}else {
				validacao = true;
			}
		}while(!validacao);
		
		/*while(user.equalsIgnoreCase(pass)) {
		System.out.println("Entre com seu usuário:");
		user = scan.nextLine();
		System.out.println("Entre com sua senha:");
		pass = scan.nextLine();
		}*/
		
		System.out.println("usuário: " + user + " senha: " + pass);

	}

}
