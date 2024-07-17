package Sprout;

import java.util.Scanner;

public class P1_SafariWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextInt();
        long m = scanner.nextInt();

        System.out.println(Math.abs(n - m));

    }
}
