package Bronze5;

import java.math.BigInteger;
import java.util.Scanner;

public class P10_7891_CanYouAddThis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            BigInteger a = scanner.nextBigInteger();
            BigInteger b = scanner.nextBigInteger();
            System.out.println(a.add(b));
        }

    }
}
