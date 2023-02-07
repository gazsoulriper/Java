package Calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o primeiro número:");
        a = scan.nextInt();
        System.out.println("Digite o segundo número:");
        b = scan.nextInt();

        int somar = somar(a, b);
        int subtrair = subtrair(a, b);
        int multiplicar = multiplicar(a, b);
        float dividir = dividir(a, b);

        System.out.println("Somar:" + somar);
        System.out.println("Subtrair:" + subtrair);
        System.out.println("Multiplicar:" + multiplicar);
        System.out.println("Dividir:" + dividir);

    }
    public static int somar(int a, int b) {
        return a + b;
    }public static int subtrair(int a, int b) {
        return a - b;
    }public static int multiplicar(int a, int b) {
        return a * b;
    }public static float dividir(float a, float b) {
        return a / b;
    }
}

