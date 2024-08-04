package Class2;

import java.util.Scanner;

public class P10_28702_FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        String s3 = scanner.nextLine();
        int result = 0;

        if (isNumber(s1)) {
            result = Integer.parseInt(s1) + 3;
        } else if (isNumber(s2)) {
            result = Integer.parseInt(s2) + 2;
        } else if (isNumber(s3)) {
            result = Integer.parseInt(s3) + 1;
        }

        if (result % 3 == 0 && result % 5 != 0) {
            System.out.print("Fizz");
        } else if (result % 5 == 0 && result % 3 != 0) {
            System.out.println("Buzz");
        } else if (result % 3 == 0 && result % 5 == 0) {
            System.out.println("FizzBuzz");
        } else {
            System.out.println(result);
        }
    }

    private static boolean isNumber(String str) {
        final String regex = "[0-9]+";

        return str.matches(regex);
    }
}