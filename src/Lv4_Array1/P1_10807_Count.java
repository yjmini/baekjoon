package Lv4_Array1;

import java.util.Scanner;

public class P1_10807_Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int[] arr = new int[length];
        int count = 0;

        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }

        int findNum = scanner.nextInt();

        for (int i = 0; i < length; i++) {
            if (findNum == arr[i]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
