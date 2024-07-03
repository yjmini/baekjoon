package Lv3_Loop;

import java.util.Scanner;

public class P7_11021_SumCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int[] sum = new int[count];

        for (int i = 0; i < count; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            sum[i] = a + b;
        }

        for (int i = 0; i < count; i++) {
            System.out.println("Case #" + (i + 1) + ": " + sum[i]);
        }
    }
}

