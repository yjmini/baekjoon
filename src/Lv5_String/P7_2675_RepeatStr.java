package Lv5_String;

import java.util.Scanner;

public class P7_2675_RepeatStr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int repeat = scanner.nextInt();
            String str = scanner.next();

            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < repeat; k++) {
                    System.out.print(str.charAt(j));
                }
            }
            System.out.println();
        }

    }
}
