package Bronze5;

import java.util.Arrays;
import java.util.Scanner;

public class P9_6840_WhoIsInTheMiddle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] bowls = new int[3];
        for (int i = 0; i < bowls.length; i++) {
            bowls[i] = scanner.nextInt();
        }

        Arrays.sort(bowls);
        System.out.println(bowls[1]);

    }
}
