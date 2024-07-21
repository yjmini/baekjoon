package Class1;

import java.util.Scanner;

public class P1_31403_StrVsNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        String strA = "";
        strA = String.valueOf(a) + String.valueOf(b);

        int result = Integer.parseInt(strA)- c;

        System.out.println(a + b - c);

        System.out.println(result);

    }
}
