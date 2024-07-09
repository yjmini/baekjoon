package Lv5_String;

import java.util.Scanner;

public class P3_9086_FirstLast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();
        String[] strings = new String[n];

        for (int i = 0; i < n; i++) {
            strings[i] = scanner.nextLine();
        }

        for (int i = 0; i < n; i++) {
            System.out.print(strings[i].charAt(0));
            System.out.print(strings[i].charAt(strings[i].length() - 1));
            System.out.println();
        }
    }
}
