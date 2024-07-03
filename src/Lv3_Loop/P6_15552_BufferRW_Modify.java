package Lv3_Loop;

import java.io.*;
import java.util.StringTokenizer;

public class P6_15552_BufferRW_Modify {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //테스트 케이스 개수 T
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            //A B 입력
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            //A + B 출력
            int sum = A + B;
            bw.write(Integer.toString(sum));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
