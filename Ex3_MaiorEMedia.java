package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int contagem = 0;
        int maior = 0;
        int soma = 0;
        double media;
        
        do {
            System.out.println("Digite o " + (contagem + 1) +"° número: ");
            numero = scan.nextInt();
            soma += numero;
            contagem++;

        } while (contagem < 5);
        if (numero > maior) maior = numero;
        media = soma / 5;
        System.out.println("O maior número digitado foi: "+ maior);
        System.out.println("A média é: " + media);
    }
}
