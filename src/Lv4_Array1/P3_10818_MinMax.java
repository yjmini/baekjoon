package Lv4_Array1;

import java.util.Scanner;

public class P3_10818_MinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int[] arr = new int[length];


        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }

        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }

        }
        System.out.println(min + " " + max);
    }
}
