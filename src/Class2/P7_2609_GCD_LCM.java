package Class2;

import java.util.Scanner;

public class P7_2609_GCD_LCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int gcd = gcd(a, b); // 최대공약수
        int lcm = (a * b) / gcd; // 최소공배수

        System.out.println(gcd);
        System.out.println(lcm);
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;

            //gcd(a, b) = gcd(b, r)
            a = b;
            b = r;
        }
        return a;
    }
}
