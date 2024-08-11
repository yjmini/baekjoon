package Bronze5;

import java.math.BigInteger;
import java.util.Scanner;

public class P1_1271_Rich {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger money = scanner.nextBigInteger();
        BigInteger divNum = scanner.nextBigInteger();

        System.out.println(money.divide(divNum));
        System.out.println(money.remainder(divNum));
    }
}
