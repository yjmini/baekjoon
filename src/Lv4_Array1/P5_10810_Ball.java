package Lv4_Array1;

import java.util.Scanner;

public class P5_10810_Ball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int repeat = scanner.nextInt();

        int[] arr = new int[len];

        for (int i = 0; i < repeat; i++) {
            int I = scanner.nextInt();
            int J = scanner.nextInt();
            int K = scanner.nextInt();

            for (int j = I - 1; j < J; j++) {
                arr[j] = K;
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
