package Lv5_String;

import java.util.Scanner;

public class P9_2908_Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String num1 = scanner.next();
        String num2 = scanner.next();
        char[] reNum1 = new char[3];
        char[] reNum2 = new char[3];
        int n = 0;

        for (int i = 2; i >=0; i--) {
            reNum1[i] = num1.charAt(n);
            reNum2[i] = num2.charAt(n);
            n++;
        }

        String strNum1 = new String(reNum1);
        String strNum2 = new String(reNum2);
        int a = Integer.parseInt(strNum1);
        int b = Integer.parseInt(strNum2);

        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
