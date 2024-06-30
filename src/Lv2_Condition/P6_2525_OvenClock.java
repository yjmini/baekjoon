package Lv2_Condition;

import java.util.Scanner;

public class P6_2525_OvenClock {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        int time = scanner.nextInt();

        minute += time;

        while (minute >= 60) {
            hour++;
            minute -= 60;
            if (hour >= 24) {
                hour = 0;
            }
        }

        System.out.println(hour + " " + minute);
    }
}
