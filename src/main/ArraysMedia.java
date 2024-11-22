package main;

public class ArraysMedia {
    //repaso  arrays
    public static void main(String[] args) {
       int []num = { 5, 6, 3, 4, 5 , 3, 4};

       String result = "";
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if (num[i] == num[j]){
                    result += num[i] + ", ";
                }
            }

        }
        System.out.println(result);
    }
}
