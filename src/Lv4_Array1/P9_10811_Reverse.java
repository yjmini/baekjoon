package Lv4_Array1;

import java.util.Scanner;

public class P9_10811_Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt();
        int repeat = scanner.nextInt();
        int[] arr = new int[len];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < repeat; i++) {
            int I = scanner.nextInt();
            int J = scanner.nextInt();

            while (I <= J) {
                int temp = arr[I-1];
                arr[I-1] = arr[J-1];
                arr[J-1] = temp;
                I++;
                J--;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
