package Pemanasan.Jawaban;

import java.util.Scanner;

public class pecahan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();

        String result = compareFractions(a, b, c, d);
        System.out.println(result);
    }

    public static String compareFractions(int a, int b, int c, int d) {
        // Menghitung perkalian silang
        long leftProduct = (long) a * d;
        long rightProduct = (long) b * c;

        // Membandingkan hasil perkalian silang
        if (leftProduct == rightProduct) {
            return "sama";
        } else if (leftProduct > rightProduct) {
            return "lebih besar";
        } else {
            return "lebih kecil";
        }
    }
}
