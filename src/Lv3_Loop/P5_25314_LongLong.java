package Lv3_Loop;

import java.util.Scanner;

public class P5_25314_LongLong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int count = 0;

        if (n % 4 == 0) {
            count = n / 4;
            for (int i = 0; i < count; i++) {
                System.out.print("long ");
            }
            System.out.println("int");
        } else {
            System.out.println("다시 입력");
        }
    }
}
