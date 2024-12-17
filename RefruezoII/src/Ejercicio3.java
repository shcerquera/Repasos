public class Ejercicio3 {
    //Se trata de implementar un programa que sume los dígitos de un número entero no negativo.
// Por ejemplo, la suma de los dígitos del 3433 es 13.
//Para darle un poco más de emoción, el programa no se limitará a escribir el resultado de la suma,
//sino que también escribirá todos los sumandos utilizados: 3 + 4 + 3 + 3 = 13. Para obtener
// el dígito iésimo usa Integer.parseInt("" + total.charAt(i));
    public static void main(String[] args) {
        // ejemplo del ejerciccio 3433 =13

        int numero = 3433;
        int resultado = sumaDigitos(numero);

        System.out.print(" = " + resultado);

    }

    public static int sumaDigitos(int numero) {

        int suma = 0;
        System.out.println("Digitos sumados");

        boolean primero = true;

        while (numero > 0) {
            int digito = numero % 10;

            suma += digito;

            if (primero) {
                System.out.print(digito);

                primero = false;

            } else {
                System.out.print(" + " + digito);
            }
            numero /= 10;
        }
        return suma;
    }
}
