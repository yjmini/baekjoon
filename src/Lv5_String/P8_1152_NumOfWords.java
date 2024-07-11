package Lv5_String;

import java.util.Scanner;

public class P8_1152_NumOfWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        String str = scanner.nextLine();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }

        if (str.charAt(0) != ' ' && str.charAt(str.length() - 1) != ' ') {
            count += 1;
        }
        if (str.charAt(0) == ' ' && str.charAt(str.length() - 1) == ' ') {
            count -= 1;
        }

        System.out.println(count);
    }
}
