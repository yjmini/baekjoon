package Lv4_Array1;

import java.util.Scanner;

public class P6_10813_BallChange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt(); //N
        int repeat = scanner.nextInt(); //M

        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = i+1;
        }

        for (int i = 0; i < repeat; i++) {
            int I = scanner.nextInt();
            int J = scanner.nextInt();

            if (I != J) {
                int temp = arr[I-1];
                arr[I-1] = arr[J-1];
                arr[J-1] = temp;
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}
