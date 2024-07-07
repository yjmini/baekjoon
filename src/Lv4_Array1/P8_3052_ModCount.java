package Lv4_Array1;

import java.util.Scanner;

public class P8_3052_ModCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[10];
        int count = 0;
        boolean check; //n번째 수와 n+1 ... 수를 비교

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            arr[i] = arr[i] % 42;
        }

        for (int i = 0; i < arr.length; i++) {
            check = false; //기본값 false
            for (int j = i + 1; j < arr.length; j++) { //i+1부터 10까지
                if (arr[i] == arr[j]) { //두 수가 같으면 카운트할 필요가 없으니 탈출
                    check = true;
                    break;
                }
            }
            if (check == false) { //j 반복문을 통과해서 false라면 중복된 것이 아니므로 count++
                count++;
            }
        }
        System.out.println(count);
    }
}
