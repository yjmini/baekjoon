package Marathon;

import java.util.Scanner;

public class P18_28701_Cubed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int nSum = 0;
        int nCubeSum = 0;

        for (int i = 1; i <= n; i++) {
            nSum += i;
        }
        System.out.println(nSum);

        System.out.println(nSum * nSum);

        for (int i = 1; i <= n; i++) {
            nCubeSum += i * i * i;
        }
        System.out.println(nCubeSum);
    }
}
