package Lv2_Condition;

import java.util.Scanner;

public class P5_2884_Alarm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int minute = scanner.nextInt();

        if (minute < 45) {
            minute = 60 - (45 - minute);
            hour -= 1;
            if (hour < 0) {
                hour = 23;
            }
        } else {
            minute -= 45;
        }

        System.out.println(hour + " " + minute);
    }
}
