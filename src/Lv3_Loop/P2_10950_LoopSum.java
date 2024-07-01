package Lv3_Loop;

import java.util.Scanner;

public class P2_10950_LoopSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int times = scanner.nextInt();
        int[] sum = new int[times];

        for (int i = 0; i < times; i++) {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            sum[i] = num1 + num2;
        }

        for (int i : sum) {
            System.out.println(i);
        }
    }
}
