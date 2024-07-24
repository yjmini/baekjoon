package Class1;

import java.util.Scanner;

public class P5_10250_ACMHotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int height = scanner.nextInt();
            int width = scanner.nextInt();
            int N = scanner.nextInt();

            if (N % height == 0) {
                System.out.println((height * 100) + (N / height));
            } else {
                System.out.println((N % height * 100) + ((N / height) + 1));
            }
        }
    }
}
