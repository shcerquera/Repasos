import java.util.Arrays;

public class Arrays3 {
    public static void main(String[] args) {
//        int [] num = {5, 4, 2, 3, 6};
//        int borrar = 1;
//        int moverNum = num [borrar];
//        for (int i = 0; i < num.length; i++) {
//            num[i] = num[i +1];
//
//        }
//        System.out.println(Arrays.toString(num));
//    }
        int[] arrays1 = {1, 4, 3, 5, 8};
        int[] ivertido = new int[4];

        for (int i = 0; i < arrays1.length; i++) {
            ivertido[arrays1.length -1 -i] = arrays1[i];

        }
        System.out.println(Arrays.toString(ivertido));
    }

}
