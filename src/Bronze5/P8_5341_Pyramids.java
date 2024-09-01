package Bronze5;

import java.util.Scanner;

public class P8_5341_Pyramids {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum = 0;

        while (n != 0) {
            for (int i = n; i > 0; i--) {
                sum += i;
            }
            System.out.println(sum);
            sum = 0;
            n = scanner.nextInt();
        }
    }
}
