package Lv3_Loop;

import java.util.Scanner;

public class P8_11022_SumCaseUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int[] sum = new int[count];
        int[] a = new int[count];
        int[] b = new int[count];

        for (int i = 0; i < count; i++) {
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
            sum[i] = a[i] + b[i];
        }

        for (int i = 0; i < count; i++) {
            System.out.println("Case #" + (i + 1) + ": " + a[i] + " + " + b[i] + " = " + sum[i]);
        }
    }
}
