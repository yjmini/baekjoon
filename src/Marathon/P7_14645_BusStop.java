package Marathon;

import java.util.Scanner;

public class P7_14645_BusStop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int busStopNum = scanner.nextInt();
        int startNum = scanner.nextInt();

        for (int i = 0; i < busStopNum; i++) {
            int hopOn = scanner.nextInt();
            int hopOff = scanner.nextInt();

            startNum = startNum + hopOn - hopOff;;
        }
        System.out.println("비와이");

    }
}
