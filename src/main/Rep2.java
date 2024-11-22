package main;

import java.util.Scanner;

public class Rep2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numeros = new int [10];

        System.out.print("Introduice 10 números: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }
        int mayor = elMayor(numeros);
        System.out.println("El mayor es: " + mayor);
    }
    public static int elMayor(int[] numeros){

        int mayor = numeros [0];
        for (int num : numeros){
            if (num > mayor){
                mayor = num;
            }
        }
        return mayor;
    }
}
