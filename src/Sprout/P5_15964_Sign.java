package Sprout;

import java.util.Scanner;

public class P5_15964_Sign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextInt();
        long b = scanner.nextInt();

        System.out.println((a + b) * (a - b));
    }
}
