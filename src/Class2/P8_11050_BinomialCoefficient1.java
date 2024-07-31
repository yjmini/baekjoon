package Class2;

import java.util.Scanner;

public class P8_11050_BinomialCoefficient1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int result = fac(N) / (fac(K) * fac(N - K));
        System.out.println(result);
    }

    private static int fac(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }


}