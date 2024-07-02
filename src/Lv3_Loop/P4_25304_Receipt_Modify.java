package Lv3_Loop;

import java.util.Scanner;

public class P4_25304_Receipt_Modify {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPrice = scanner.nextInt();
        int totalCount = scanner.nextInt();

        int sum = 0;

        for (int i = 0; i < totalCount; i++) {
            int price = scanner.nextInt();
            int count = scanner.nextInt();
            sum += price * count;
        }

        if (sum == totalPrice) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
