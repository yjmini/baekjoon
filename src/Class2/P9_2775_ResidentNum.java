package Class2;

import java.util.Scanner;

public class P9_2775_ResidentNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] APT = new int[15][15];

        for (int i = 0; i < 15; i++) {
            APT[i][1] = 1; //i층 1호는 모두 1
            APT[0][i] = i; // 0층 i호는 모두 i
        }

        for (int i = 1; i < 15; i++) { //1층부터 14층까지
            for (int j = 2; j < 15; j++) { //2호부터 14호까지
                APT[i][j] = APT[i][j - 1] + APT[i - 1][j]; //이전 호 주민 수 + 아래 주민 수 = 현재 칸 주민 수
            }
        }

        int testCases = scanner.nextInt();

        for (int i = 0; i < testCases; i++) {
            int k = scanner.nextInt();
            int n = scanner.nextInt();
            System.out.println(APT[k][n]);

        }
    }
}
