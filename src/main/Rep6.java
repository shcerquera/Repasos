package main;

public class Rep6 {
    public static void main(String[] args) {

        int [] numeros = {1,2,23,4,35,6,17,8,9,11,12,};

        int mayor = numeroMayor(numeros);

        System.out.println("le numero mayor es: " + mayor);

    }
    public static int numeroMayor (int [] numeros){
        int mayor = 0;

        for (int i = 0; i < numeros.length ; i++) {
            if (numeros [i] > mayor){
                mayor = numeros [i];
            }

        }
        return mayor;
    }
}
