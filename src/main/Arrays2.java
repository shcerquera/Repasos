package main;

public class Arrays2 {
    public static void main(String[] args) {
        int[] num = {5, 4, 6, 3, 2};
        int[] num2 = {5, 6, 9, 0, 3};

        String result = " ";
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num2.length; j++) {
                if (num[i] == num2[j]) {
                    result += num[i] + ", ";

                }
            }
        }
        System.out.println(result);
    }
}
