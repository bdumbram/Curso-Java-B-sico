package com.loiane.cursojava.aula15Labs;

import java.util.Scanner;

public class Exercicio18 {

public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com um número inteiro para saber se o mesmo é par ou impar");
        int numero = scan.nextInt();
        int resultado = numero % 2;
        
        if(resultado == 0) {
            System.out.println("O número " + numero + " é par");
        }else {
            System.out.println("O número " + numero + " é impar");
        }
    }

}

