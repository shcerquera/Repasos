import java.math.BigInteger;
import java.util.Scanner;

public class Big {
    public static void main(String[] args) {
        //5! = 1 * 2 * 3 * 4 * 5;
        BigInteger factorial = new BigInteger("1");


        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = sc.nextInt();

        for (int i = num; i > 0; i--) {
            BigInteger iBig = new BigInteger(String.valueOf(i));
            factorial = factorial.multiply(iBig);
        }

        System.out.print("El factoria de " + num + ", es: " + factorial);
    }
}
