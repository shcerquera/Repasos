package main;

import java.util.Scanner;

public class Rep3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("introduce la nota");
        int nota = sc.nextInt();

        if (nota >= 0 && nota < 3){
            System.out.println("I");

        }else if (nota >=4 && nota < 5){
            System.out.println("A");
        } else if (nota >= 6 && nota <8) {
            System.out.println("S");

        }else {
            System.out.println( "E");

        }

    }
}
