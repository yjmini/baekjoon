package Lv2_Condition;

import java.util.Scanner;

public class P7_2480_Dice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int prize = 0;
        int pip = 0;

        if (a == b && b == c) {
            pip = a;
            prize = 10000 + pip * 1000;
        } else if (a == b || b == c || a == c) {
            if (a == b || a == c) {
                pip = a;
            } else {
                pip = b;
            }
            prize = 1000 + pip * 100;
        } else {
            if (a > b && a > c) {
                pip = a;
            } else if (a < b && b > c) {
                pip = b;
            } else {
                pip = c;
            }
            prize = pip * 100;
        }
        System.out.println(prize);
    }
}
