package main;

import java.util.Scanner;

public class Rep4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nota");
        int nota = sc.nextInt();

        switch (nota) {
            case 0:
            case 1:
            case 2:
                System.out.println("I");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("A");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("S");

            case 9:
            case 10:
                System.out.println("E");
                break;

            default:
                System.out.println("Error");

        }
    }
}
