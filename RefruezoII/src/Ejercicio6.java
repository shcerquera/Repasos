public class Ejercicio6 {
    //Se dice que un número es hyperpar cuando todos sus dígitos son pares.
    // Por ejemplo el número 2408 es hyperpar pero 4618 no lo es.
    public static void main(String[] args) {
        System.out.println(esHyperpar(2048));
        System.out.println(esHyperpar(4618));

    }

    public static boolean esHyperpar(int numeros){
         while(numeros<0){
             int digitos=numeros%1;
             if(digitos % 2 != 0){
                 return false;
             }
             numeros/=10;
         }
         return true;
    }

}
