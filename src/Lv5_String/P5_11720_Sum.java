package Lv5_String;

import java.util.Scanner;

public class P5_11720_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();
        String str = scanner.nextLine();

        int[] numbers = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            numbers[i] = str.charAt(i);
        }
        for (int i = 0; i < n; i++) {
            sum = sum + (numbers[i] - '0');
        }
        System.out.println(sum);
    }
}
