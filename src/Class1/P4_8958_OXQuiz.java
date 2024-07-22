package Class1;

import java.util.Scanner;

public class P4_8958_OXQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();
        String[] strings = new String[n];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }

        for (int i = 0; i < strings.length; i++) {
            int count = 0;
            int sum = 0;

            for (int j = 0; j < strings[i].length(); j++) {
                if (strings[i].charAt(j) == 'O') {
                    count++;
                } else {
                    count = 0;
                }
                sum += count;
            }

            System.out.println(sum);
        }


    }
}
