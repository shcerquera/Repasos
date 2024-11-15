import java.util.HashMap;
import java.util.Map;

public class Repaso {
    //Escribe un programa que reciba una lista de palabras (como un array de cadenas).
// El programa debe contar cuántas veces aparece cada palabra en la lista y devolver los resultados en un formato legible.
    public static void main(String[] args) {
        String[] lista = {"manzana, pera, naranja, lima, manzana, banan, pera, manzana"};



    }

    public static void contarPalabras(String[] palabras) {

        for (int i = 0; i < palabras.length; i++) {
            boolean yaContada = false;
            for (int j = 0; j < i; j++) {
                if (palabras[i].equals(palabras[j])) {
                    yaContada = true;
                    break;
                }
            }
            if (!yaContada) {
                int contador = 0;
                for (int k = 0; k < palabras.length; k++) {
                    if (palabras[i].equals(palabras[k]))
                        contador++;
                }
            }
            System.out.println("'" + palabras[i] + "' aparece ");
        }

    }
}



