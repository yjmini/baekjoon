package Lv1_IO_Math;

import java.util.Scanner;

public class P5_1008_Divide {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        double result = (double) num1 / num2;
        System.out.println(result);
    }
}
