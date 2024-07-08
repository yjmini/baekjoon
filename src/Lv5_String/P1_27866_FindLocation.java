package Lv5_String;

import java.util.Scanner;

public class P1_27866_FindLocation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        int findNum = scanner.nextInt();

        char c = word.charAt(findNum - 1);

        System.out.println(c);

    }
}
