package Lv6_Advanced1;

import java.util.Scanner;

public class P5_1157_MostUsed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[26]; //알파벳 개수
        int max = -1;
        char ch = '.';
        String str = scanner.nextLine().toUpperCase();

        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) -'A']++; // 해당 알파벳 순서의 값 1증가
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 'A'); //대문자로 출력
            } else if (arr[i] == max) {
                ch = '?';
            }
        }

        System.out.println(ch);
    }
}
