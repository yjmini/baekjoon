package Marathon;

import java.util.Scanner;

public class P4_28352_HowManyWeeks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        long nFac = 1;
        long weekToSec = 7 * 24 * 60 * 60;
        long mWeeks = 0;

        for (int i = 1; i <= N; i++) {
            nFac *= i;
        }
        mWeeks = nFac / weekToSec;
        System.out.println(mWeeks);
    }
}
