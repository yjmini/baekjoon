package Sprout;

import java.util.Scanner;

public class P4_2754_PrintGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        double grade = 0.0;

        if (str.charAt(0) == 'A') {
            grade = 4;
        } else if (str.charAt(0) == 'B') {
            grade = 3;
        } else if (str.charAt(0) == 'C') {
            grade = 2;
        } else if (str.charAt(0) == 'D') {
            grade = 1;
        } else {
            System.out.println(grade);
            return;
        }

        if (str.charAt(1) == '+') {
            grade += 0.3;
        } else if (str.charAt(1) == '-') {
            grade -= 0.3;
        }
        System.out.println(grade);
    }
}
