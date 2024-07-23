package Class2;

import java.util.Scanner;

public class P2_1978_PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int isPN;
        int count = 0;

        for (int i = 0; i < n; i++) {
            isPN = scanner.nextInt();
            for (int j = 2; j <= isPN; j++) {
                if (j == isPN) {
                    count++;
                }
                if (isPN % j == 0) {
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
