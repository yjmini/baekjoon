package Marathon;

import java.util.Scanner;

public class P11_5361_DollarSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double blasterRifle = 350.34;
        double visualSensor = 230.90;
        double auditorySensor = 190.55;
        double arm = 125.30;
        double leg = 180.90;

        int testCases = scanner.nextInt();
        for (int i = 0; i < testCases; i++) {
            int brNum = scanner.nextInt();
            int vsNum = scanner.nextInt();
            int asNum = scanner.nextInt();
            int armNum = scanner.nextInt();
            int legNum = scanner.nextInt();

            double costSum = blasterRifle * brNum + visualSensor * vsNum
                    + auditorySensor * asNum + arm * armNum + leg * legNum;

            System.out.printf("$%.2f", costSum);
            System.out.println();
        }

    }
}
