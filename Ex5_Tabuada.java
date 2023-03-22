package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:

Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/
public class Ex5_Tabuada {
    private static final String Continue = null;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;

        while (true) {
            System.out.println("Escolha uma tabuada entre 1 e 10: ");
            numero = scan.nextInt();
            
            if (numero < 1 | numero > 10)
                System.out.println("Número inválido!");
            else
                break;
        }   
        
        System.out.println("Tabuada do " + numero);

        for (int x = 1; x < 11; x++) {
            System.out.println(numero + " x " + x + " = " + numero * x);
        }
    }
}
