package Sprout;

import java.util.Scanner;

public class P3_10872_Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int result = 1;

        for (int i = 0; i < n; i++) {
            result *= (i + 1);
        }
        System.out.println(result);
    }
}
