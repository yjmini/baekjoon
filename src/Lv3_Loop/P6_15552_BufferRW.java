package Lv3_Loop;

import java.util.Scanner;

public class P6_15552_BufferRW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int[] sum = new int[count];

        for (int i = 0; i < count; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            sum[i] = a + b;
        }

        for (int i : sum) {
            System.out.println(i);
        }
    }
}
