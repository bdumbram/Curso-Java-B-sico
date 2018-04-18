package com.loiane.cursojava.aula15Labs;

import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o ano para saber se é bissexto");
        int ano = scan.nextInt();
        
        int bissexto = ano % 4;
        if(bissexto == 0) {
        System.out.println("O ano " + ano + " é bissexto");
    }else {
        System.out.println("O ano " + ano + " não é bissexto");
        }
    }

}

