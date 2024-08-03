package Marathon;

import java.util.Scanner;

public class P9_20254_SiteScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int UR = scanner.nextInt();
        int TR = scanner.nextInt();
        int UO = scanner.nextInt();
        int TO = scanner.nextInt();

        int result = 56 * UR + 24 * TR + 14 * UO + 6 * TO;

        System.out.println(result);
    }
}
