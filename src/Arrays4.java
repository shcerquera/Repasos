public class Arrays4 {
    /**
     * Crea un array con los números escritos en letras, que vaya de 1 a 10
     * recorre este array en orden descendente e indque si el número de letras del número que se está recorriendo coinciden
     */
    public static void main(String[] args) {

        String[] numerosEnLetras = new String[]{"uno", "dos", "tres", "cuatro", "cinco", "seis", "siente", "ocho", "nueve", "diez"};

//        System.out.println(numerosEnLetras[2]);

        int longitudDePalabrasMasLarga = 0;

        for (int index = 10; index > 0; index--) {
            String numeroEnLetras = numerosEnLetras[index-1];
            int numeroDeLetras = numeroEnLetras.length();

            if( numeroDeLetras > longitudDePalabrasMasLarga) {
                System.out.println("se actualiza el valor mas grande a: " + numeroDeLetras + ", " + numeroEnLetras);
                longitudDePalabrasMasLarga = numeroDeLetras;
            }
        }

        for (int index = 10; index > 0; index--) {
            String numeroEnLetras = numerosEnLetras[index -1];
            // System.out.print(index + " ");
            int numeroDeLetras = numeroEnLetras.length();
            // System.out.println(numeroDeLetras);
            int espaciosParaAlinear = longitudDePalabrasMasLarga - numeroDeLetras;

            System.out.print(numeroEnLetras);

            for (int index2 = 0; index2 < espaciosParaAlinear; index2++) {
                System.out.print(" ");

            }

            System.out.print(" tiene " + numeroDeLetras + " letras.");

            if (index == numeroDeLetras) {
                System.out.print(" Si");
            } else {
                System.out.print(" No");
            }

            System.out.print(" coincide las letras con el numero.\n");
        }
    }
}
//public static void  contarPalabras (String[] palabras)
