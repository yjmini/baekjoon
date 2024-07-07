package Lv4_Array1;

import java.util.Arrays;
import java.util.Scanner;

public class P7_5597_NonSubmitter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] Students = new int[30];

        for (int i = 0; i < 28; i++) {
            int index = scanner.nextInt();
            Students[index-1] = index;
        }

        for (int i = 0; i < Students.length; i++) {
            if (Students[i] == 0) {
                System.out.println(i+1);
            }
        }
    }
}
