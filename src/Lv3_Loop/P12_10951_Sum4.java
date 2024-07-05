package Lv3_Loop;

import java.util.Scanner;

public class P12_10951_Sum4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //int 값이 들어오지 않으먼 반복문 탈출
        while (scanner.hasNextInt()) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            System.out.println(A + B);
        }
    }
}
