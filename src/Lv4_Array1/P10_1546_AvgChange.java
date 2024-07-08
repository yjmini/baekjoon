package Lv4_Array1;

import java.util.Arrays;
import java.util.Scanner;

public class P10_1546_AvgChange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sub = scanner.nextInt();
        double[] grades = new double[sub];
        double sum = 0;
        double avg = 0;

        for (int i = 0; i < grades.length; i++) {
            grades[i] = scanner.nextInt();
        }
        Arrays.sort(grades);

        for (int i = 0; i < grades.length; i++) {
            sum = sum + grades[i] / grades[sub-1] * 100;
        }
        avg = sum / sub;

        System.out.println(avg);
    }
}
