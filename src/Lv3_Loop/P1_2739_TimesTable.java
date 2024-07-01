package Lv3_Loop;

import java.util.Scanner;

public class P1_2739_TimesTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < 9; i++) {
            System.out.println(n + " * " + (i + 1) + " = " + (n * (i + 1)));
        }
    }
}
