package Class2;

import java.util.Scanner;

public class P1_4153_RightTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            scanner.nextLine();

            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            if (a * a + b * b == c * c) {
                System.out.println("right");
            } else if (a * a == b * b + c * c) {
                System.out.println("right");
            } else if (b * b == a * a + c * c) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}
