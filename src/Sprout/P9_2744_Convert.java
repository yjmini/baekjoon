package Sprout;

import java.util.Scanner;

public class P9_2744_Convert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLowerCase(c)) {
                c = Character.toUpperCase(c);
            } else if (Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
            }
            System.out.print(c);
        }
    }
}
