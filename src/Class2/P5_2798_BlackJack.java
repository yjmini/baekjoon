package Class2;

import java.util.Scanner;

public class P5_2798_BlackJack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int maxNum = scanner.nextInt();

        int[] cards = new int[n];

        for (int i = 0; i < n; i++) {
            cards[i] = scanner.nextInt();
        }

        int result = BlackJack(cards, n, maxNum);
        System.out.println(result);
    }

    static int BlackJack(int[] cards, int n, int maxNum) {
        int result = 0;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int temp = cards[i] + cards[j] + cards[k];

                    if (maxNum == temp) {
                        return temp;
                    }

                    if (result < temp && temp < maxNum) {
                        result = temp;
                    }
                }
            }
        }
        return result;
    }
}