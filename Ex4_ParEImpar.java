package br.com.dio.exercicios.loops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List lista = new ArrayList();

        int quantidadeNumeros, numero; 
        int quantidadePar = 0, quantidadeImpar = 0, count = 0;

        System.out.println("Quantos números vão ser inseridos? ");
        quantidadeNumeros = scan.nextInt();

        do {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();
            lista.add(numero);
            count++;
            if (numero % 2 == 0) quantidadePar++;
            else quantidadeImpar++;
        } while (count < quantidadeNumeros);
        
        System.out.println("Quantidade de numeros par: " + quantidadePar);
        System.out.println("Quantidade de números impar: " + quantidadeImpar);
        System.out.println("Lista dos números: " + lista);
    }

}
