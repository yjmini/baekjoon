package Class2;

import java.util.Scanner;

public class P3_30802_WelcomeKit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] size = new int[6];
        for (int i = 0; i < size.length; i++) {
            size[i] = scanner.nextInt();
        }

        int T = scanner.nextInt();
        int P = scanner.nextInt();
        int tBundleCount = 0;
        int penQuotient = 0;
        int penRemainder = 0;

        for (int i = 0; i < size.length; i++) {
            tBundleCount += size[i] / T;
            if (size[i] != 0 && T != 1 && size[i] % T != 0) {
                tBundleCount++;
            }

        }
        penQuotient = N / P;
        penRemainder = N % P;

        System.out.println(tBundleCount);
        System.out.println(penQuotient + " " + penRemainder);
    }
}
