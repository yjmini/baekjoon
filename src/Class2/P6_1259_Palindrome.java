package Class2;

import java.util.Scanner;

public class P6_1259_Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testNum = scanner.nextInt();
        boolean isPalindrome = false;

        while (testNum != 0) {
            String str = String.valueOf(testNum);
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                    isPalindrome = false;
                    break;
                } else {
                    isPalindrome = true;
                }
            }
            if (isPalindrome == true) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
            testNum = scanner.nextInt();
        }
    }
}
