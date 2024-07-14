package Lv6_Advanced1;

import java.util.Scanner;

public class P2_3003_Chess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] chess = new int[]{1, 1, 2, 2, 2, 8};

        int[] havePieces = new int[6];

        for (int i = 0; i < havePieces.length; i++) {
            havePieces[i] = scanner.nextInt();
        }

        for (int i = 0; i < havePieces.length; i++) {
            System.out.print(chess[i] - havePieces[i] + " ");
        }
    }
}
