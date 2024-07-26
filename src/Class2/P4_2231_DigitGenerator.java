package Class2;

import java.util.Scanner;

public class P4_2231_DigitGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int result = 0; // 최종 값 // ex)216

        for (int i = 0; i < n; i++) {
            int num = i; // ex) 198
            int digitSum = 0; // ex) 1+9+8

            while (num > 0) {
                digitSum += num % 10; //모든 자릿수 더하기
                num /= 10;
            }

            if (n == i + digitSum) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}