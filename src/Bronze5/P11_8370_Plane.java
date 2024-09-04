package Bronze5;

import java.util.Scanner;

public class P11_8370_Plane {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int BizRow = scanner.nextInt();
        int BizSeat = scanner.nextInt();
        int EcoRow = scanner.nextInt();
        int EcoSeat = scanner.nextInt();

        System.out.println(BizRow * BizSeat + EcoRow * EcoSeat);

    }
}
