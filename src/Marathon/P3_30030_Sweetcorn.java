package Marathon;

import java.util.Scanner;

public class P3_30030_Sweetcorn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        double price = n / 1.10;
        System.out.println(Math.round(price));
    }
}
