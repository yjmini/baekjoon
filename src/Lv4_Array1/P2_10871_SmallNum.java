package Lv4_Array1;

import java.util.Scanner;

public class P2_10871_SmallNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int X = scanner.nextInt();

        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i : arr) {
            if (i < X) {
                System.out.print(i + " ");
            }
        }
    }
}
