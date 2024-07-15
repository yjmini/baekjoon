package Lv6_Advanced1;

import java.util.Scanner;

public class P4_10988_Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        int len = str.length();
        int result = 1;

        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                result = 0;
            }
        }
        System.out.println(result);
    }
}
