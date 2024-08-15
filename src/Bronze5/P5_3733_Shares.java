package Bronze5;

import java.util.Scanner;

public class P5_3733_Shares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, stockNum;

        while (scanner.hasNext()) {
            n = scanner.nextInt();
            stockNum = scanner.nextInt();

            System.out.println(stockNum / (n + 1));
        }

    }
}
