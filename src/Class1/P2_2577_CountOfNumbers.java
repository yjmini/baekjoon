package Class1;

import java.util.Scanner;

public class P2_2577_CountOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int[] numbers = new int[10];

        int result = a * b * c;
        String strResult = Integer.toString(result);
        //System.out.println(strResult);

        for (int i = 0; i < strResult.length(); i++) {
            char c1 = strResult.charAt(i);
            numbers[c1 - '0']++;
        }

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
