package Class1;

import java.util.Scanner;

public class P3_2920_Scale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] scales = new int[8];
        String result = "";

        for (int i = 0; i < scales.length; i++) {
            scales[i] = scanner.nextInt();
        }

        for (int i = 0; i < scales.length - 1; i++) {
            if (scales[i] == scales[i + 1] - 1) {
                result = "ascending";
            } else if (scales[i] == scales[i + 1] + 1) {
                result = "descending";
            } else {
                result = "mixed";
                break;
            }
        }

        System.out.println(result);
    }
}
