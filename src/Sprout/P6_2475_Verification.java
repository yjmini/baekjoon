package Sprout;

import java.util.Scanner;

public class P6_2475_Verification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        for (int i = 0; i < 5; i++) {
            int n = scanner.nextInt();
            sum += n * n;
        }

        int result = sum % 10;
        System.out.println(result);
    }
}
