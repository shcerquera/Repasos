package main;

import java.util.Scanner;

public class Rep5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("indicar lso nuemros");

        int num;
        int contadorPositivos = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("numeros " + (i + 1) + ": ");

            num = sc.nextInt();

            if (num > 0){
                contadorPositivos++;
            }
        }
        System.out.println("positivos: " + contadorPositivos);
    }
}
