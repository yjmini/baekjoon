package Lv1_IO_Math;

import java.util.Scanner;

public class P10_2588_AdvMul {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int a = num2 % 10;
        int b = (num2 / 10) % 10;
        int c = (num2 / 100) % 10;

        System.out.println(num1 * a);
        System.out.println(num1 * b);
        System.out.println(num1 * c);
        System.out.println(num1 * num2);
    }
}
