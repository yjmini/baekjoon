package Lv5_String;

import java.util.Scanner;

public class P10_5622_Dial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        char[] chars = new char[str.length()];
        int dialSec = 0;

        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);

            if (chars[i] == 'A' || chars[i] == 'B' || chars[i] == 'C') {
                dialSec += 2;
            } else if (chars[i] == 'D' || chars[i] == 'E' || chars[i] == 'F') {
                dialSec += 3;
            } else if (chars[i] == 'G' || chars[i] == 'H' || chars[i] == 'I') {
                dialSec += 4;
            } else if (chars[i] == 'J' || chars[i] == 'K' || chars[i] == 'L') {
                dialSec += 5;
            } else if (chars[i] == 'M' || chars[i] == 'N' || chars[i] == 'O') {
                dialSec += 6;
            } else if (chars[i] == 'P' || chars[i] == 'Q' || chars[i] == 'R' || chars[i] == 'S') {
                dialSec += 7;
            } else if (chars[i] == 'T' || chars[i] == 'U' || chars[i] == 'V') {
                dialSec += 8;
            } else if (chars[i] == 'W' || chars[i] == 'X' || chars[i] == 'Y' || chars[i] == 'Z') {
                dialSec += 9;
            }
        }
        dialSec += str.length();
        System.out.println(dialSec);

    }
}
