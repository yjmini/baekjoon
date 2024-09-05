package Bronze5;

import java.util.Scanner;

public class P12_8545_ReverseTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] arr = new char[3];

        String s = scanner.next();

        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }

        char temp = arr[0];
        arr[0] = arr[2];
        arr[2] = temp;

        for (char c : arr) {
            System.out.print(c);
        }
    }
}
