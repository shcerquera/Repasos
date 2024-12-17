import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio8 {
    //Dada una serie de números enteros positivos en el que sólo puede faltar uno,
    // encontrar cuál es. Por ejemplo, en la serie {4, 3, 6, 2} falta el número 5.
    // Si no falta ninguno, debe devolver un -1
    public static void main(String[] args) {
        List<Integer> numero = Arrays.asList(1, 2, 3, 5, 6, 7);
        System.out.println(cualFalta(numero));


    }
    public static int cualFalta(List<Integer> lista){

        if (lista == null || lista.isEmpty()){
            return -1;
        }
        for (int i = 0; i < lista.size() -1; i++) {
            int diferencia = lista.get(i + 1) - lista.get(i);
            if ( diferencia > 1){
                return lista.get(i) +1;
            }
        }
        return -1;
    }
}
